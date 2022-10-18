package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.Task
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskDependencies
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskQueue
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionTasksQueuesBaseTaskQueueMod {
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/queues/base_task_queue", "BaseTaskQueue")
  @js.native
  open class BaseTaskQueue protected ()
    extends StObject
       with TaskQueue {
    def this(logger: Logger, tasks: PartiallyOrderedTasks, dependencies: TaskDependencies) = this()
    
    /** Whether all tasks have been completed. */
    /* CompleteClass */
    var allTasksCompleted: Boolean = js.native
    @JSName("allTasksCompleted")
    def allTasksCompleted_MBaseTaskQueue: Boolean = js.native
    
    /* protected */ def computeNextTask(): Task | Null = js.native
    
    /* protected */ var dependencies: TaskDependencies = js.native
    
    /**
      * Get the next task whose processing can start (if any).
      *
      * This implicitly marks the task as in-progress.
      * (This information is used to determine whether all tasks have been completed.)
      *
      * @return The next task available for processing or `null`, if no task can be processed at the
      *         moment (including if there are no more unprocessed tasks).
      */
    /* CompleteClass */
    override def getNextTask(): Task | Null = js.native
    
    /* protected */ var inProgressTasks: Set[Task] = js.native
    
    /* protected */ var logger: Logger = js.native
    
    /**
      * Mark a task as completed.
      *
      * This removes the task from the internal list of in-progress tasks.
      * (This information is used to determine whether all tasks have been completed.)
      *
      * @param task The task to mark as completed.
      */
    /* CompleteClass */
    override def markAsCompleted(task: Task): Unit = js.native
    
    /**
      * Mark a task as failed.
      *
      * Do not process the tasks that depend upon the given task.
      */
    /* CompleteClass */
    override def markAsFailed(task: Task): Unit = js.native
    
    /**
      * Mark a task as not processed (i.e. add an in-progress task back to the queue).
      *
      * This removes the task from the internal list of in-progress tasks and adds it back to the list
      * of pending tasks.
      *
      * @param task The task to mark as not processed.
      */
    /* CompleteClass */
    override def markAsUnprocessed(task: Task): Unit = js.native
    
    /**
      * Mark the given `task` as to be skipped, then recursive skip all its dependents.
      *
      * @param task The task to skip
      * @param failedTask The task that failed, causing this task to be skipped
      */
    /* protected */ def skipDependentTasks(task: Task, failedTask: Task): Unit = js.native
    
    /* protected */ def stringifyTasks(tasks: js.Array[Task], indentation: String): String = js.native
    
    /* protected */ var tasks: PartiallyOrderedTasks = js.native
    
    /**
      * A map of tasks that should be skipped, mapped to the task that caused them to be skipped.
      */
    /* private */ var tasksToSkip: Any = js.native
  }
}
