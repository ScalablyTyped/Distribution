package typings.angularCompilerCli

import typings.angularCompilerCli.baseTaskQueueMod.BaseTaskQueue
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.tasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.tasksApiMod.TaskDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelTaskQueueMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/queues/parallel_task_queue", "ParallelTaskQueue")
  @js.native
  open class ParallelTaskQueue protected () extends BaseTaskQueue {
    def this(logger: Logger, tasks: PartiallyOrderedTasks, dependencies: TaskDependencies) = this()
    
    /**
      * A map from Tasks to the Tasks that it depends upon.
      *
      * This is the reverse mapping of `TaskDependencies`.
      */
    /* private */ var blockedTasks: Any = js.native
    
    /* private */ var stringifyBlockedTasks: Any = js.native
  }
}
