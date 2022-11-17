package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPoint
import typings.angularCompilerCli.ngccSrcPackagesEntryPointMod.EntryPointJsonProperty
import typings.angularCompilerCli.ngccSrcUtilsMod.JsonObject
import typings.angularCompilerCli.ngccSrcUtilsMod.PartiallyOrderedList
import typings.std.Map
import typings.std.MapConstructor
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionTasksApiMod {
  
  @js.native
  sealed trait DtsProcessing extends StObject
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/api", "DtsProcessing")
  @js.native
  object DtsProcessing extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DtsProcessing & Double] = js.native
    
    /**
      * No, do not process the typings as part of this task - they must have already been processed by
      * another task or previous ngcc process.
      */
    @js.native
    sealed trait No
      extends StObject
         with DtsProcessing
    /* 1 */ val No: typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.DtsProcessing.No & Double = js.native
    
    /**
      * Only process the typings for this entry-point; do not render any JavaScript files for the
      * `formatProperty` of this task.
      */
    @js.native
    sealed trait Only
      extends StObject
         with DtsProcessing
    /* 2 */ val Only: typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.DtsProcessing.Only & Double = js.native
    
    /**
      * Yes, process the typings for this entry point as part of the task.
      */
    @js.native
    sealed trait Yes
      extends StObject
         with DtsProcessing
    /* 0 */ val Yes: typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.DtsProcessing.Yes & Double = js.native
  }
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/api", "TaskDependencies")
  @js.native
  val TaskDependencies: MapConstructor = js.native
  type TaskDependencies = Map[Task, Set[Task]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/api", "TaskDependencies")
  @js.native
  /* standard es2015.collection */
  open class TaskDependenciesCls[K, V] ()
    extends StObject
       with Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  type CreateTaskCompletedCallback = js.Function1[/* taskQueue */ TaskQueue, TaskCompletedCallback]
  
  type PartiallyOrderedTasks = PartiallyOrderedList[Task]
  
  trait Task
    extends StObject
       with JsonObject {
    
    /** The `EntryPoint` which needs to be processed as part of the task. */
    var entryPoint: EntryPoint
    
    /**
      * The list of all format properties (including `task.formatProperty`) that should be marked as
      * processed once the task has been completed, because they point to the format-path that will be
      * processed as part of the task.
      */
    var formatPropertiesToMarkAsProcessed: js.Array[EntryPointJsonProperty]
    
    /**
      * The `package.json` format property to process (i.e. the property which points to the file that
      * is the program entry-point).
      */
    var formatProperty: EntryPointJsonProperty
    
    /**
      * Whether to process typings for this entry-point as part of the task.
      */
    var processDts: DtsProcessing
  }
  object Task {
    
    inline def apply(
      entryPoint: EntryPoint,
      formatPropertiesToMarkAsProcessed: js.Array[EntryPointJsonProperty],
      formatProperty: EntryPointJsonProperty,
      processDts: DtsProcessing
    ): Task = {
      val __obj = js.Dynamic.literal(entryPoint = entryPoint.asInstanceOf[js.Any], formatPropertiesToMarkAsProcessed = formatPropertiesToMarkAsProcessed.asInstanceOf[js.Any], formatProperty = formatProperty.asInstanceOf[js.Any], processDts = processDts.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    extension [Self <: Task](x: Self) {
      
      inline def setEntryPoint(value: EntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setFormatPropertiesToMarkAsProcessed(value: js.Array[EntryPointJsonProperty]): Self = StObject.set(x, "formatPropertiesToMarkAsProcessed", value.asInstanceOf[js.Any])
      
      inline def setFormatPropertiesToMarkAsProcessedVarargs(value: EntryPointJsonProperty*): Self = StObject.set(x, "formatPropertiesToMarkAsProcessed", js.Array(value*))
      
      inline def setFormatProperty(value: EntryPointJsonProperty): Self = StObject.set(x, "formatProperty", value.asInstanceOf[js.Any])
      
      inline def setProcessDts(value: DtsProcessing): Self = StObject.set(x, "processDts", value.asInstanceOf[js.Any])
    }
  }
  
  type TaskCompletedCallback = js.Function3[
    /* task */ Task, 
    /* outcome */ TaskProcessingOutcome, 
    /* message */ String | Null, 
    Unit
  ]
  
  object TaskProcessingOutcome {
    
    /** Failed to process the target format. */
    inline def Failed: 1 = 1.asInstanceOf[1]
    
    /** Successfully processed the target format property. */
    inline def Processed: 0 = 0.asInstanceOf[0]
  }
  type TaskProcessingOutcome = 0 | 1
  
  trait TaskQueue extends StObject {
    
    /** Whether all tasks have been completed. */
    var allTasksCompleted: Boolean
    
    /**
      * Get the next task whose processing can start (if any).
      *
      * This implicitly marks the task as in-progress.
      * (This information is used to determine whether all tasks have been completed.)
      *
      * @return The next task available for processing or `null`, if no task can be processed at the
      *         moment (including if there are no more unprocessed tasks).
      */
    def getNextTask(): Task | Null
    
    /**
      * Mark a task as completed.
      *
      * This removes the task from the internal list of in-progress tasks.
      * (This information is used to determine whether all tasks have been completed.)
      *
      * @param task The task to mark as completed.
      */
    def markAsCompleted(task: Task): Unit
    
    /**
      * Mark a task as failed.
      *
      * Do not process the tasks that depend upon the given task.
      */
    def markAsFailed(task: Task): Unit
    
    /**
      * Mark a task as not processed (i.e. add an in-progress task back to the queue).
      *
      * This removes the task from the internal list of in-progress tasks and adds it back to the list
      * of pending tasks.
      *
      * @param task The task to mark as not processed.
      */
    def markAsUnprocessed(task: Task): Unit
  }
  object TaskQueue {
    
    inline def apply(
      allTasksCompleted: Boolean,
      getNextTask: () => Task | Null,
      markAsCompleted: Task => Unit,
      markAsFailed: Task => Unit,
      markAsUnprocessed: Task => Unit
    ): TaskQueue = {
      val __obj = js.Dynamic.literal(allTasksCompleted = allTasksCompleted.asInstanceOf[js.Any], getNextTask = js.Any.fromFunction0(getNextTask), markAsCompleted = js.Any.fromFunction1(markAsCompleted), markAsFailed = js.Any.fromFunction1(markAsFailed), markAsUnprocessed = js.Any.fromFunction1(markAsUnprocessed))
      __obj.asInstanceOf[TaskQueue]
    }
    
    extension [Self <: TaskQueue](x: Self) {
      
      inline def setAllTasksCompleted(value: Boolean): Self = StObject.set(x, "allTasksCompleted", value.asInstanceOf[js.Any])
      
      inline def setGetNextTask(value: () => Task | Null): Self = StObject.set(x, "getNextTask", js.Any.fromFunction0(value))
      
      inline def setMarkAsCompleted(value: Task => Unit): Self = StObject.set(x, "markAsCompleted", js.Any.fromFunction1(value))
      
      inline def setMarkAsFailed(value: Task => Unit): Self = StObject.set(x, "markAsFailed", js.Any.fromFunction1(value))
      
      inline def setMarkAsUnprocessed(value: Task => Unit): Self = StObject.set(x, "markAsUnprocessed", js.Any.fromFunction1(value))
    }
  }
}
