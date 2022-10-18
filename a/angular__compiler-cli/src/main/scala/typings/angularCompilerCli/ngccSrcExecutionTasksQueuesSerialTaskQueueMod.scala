package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.ngccSrcExecutionTasksApiMod.TaskDependencies
import typings.angularCompilerCli.ngccSrcExecutionTasksQueuesBaseTaskQueueMod.BaseTaskQueue
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcExecutionTasksQueuesSerialTaskQueueMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/queues/serial_task_queue", "SerialTaskQueue")
  @js.native
  open class SerialTaskQueue protected () extends BaseTaskQueue {
    def this(logger: Logger, tasks: PartiallyOrderedTasks, dependencies: TaskDependencies) = this()
  }
}
