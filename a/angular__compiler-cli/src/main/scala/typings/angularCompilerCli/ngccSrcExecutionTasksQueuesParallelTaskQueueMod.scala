package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskDependencies
import typings.angularCompilerCli.ngccSrcExecutionTasksQueuesBaseTaskQueueMod.BaseTaskQueue
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionTasksQueuesParallelTaskQueueMod {
  
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
