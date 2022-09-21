package typings.angularCompilerCli

import typings.angularCompilerCli.baseTaskQueueMod.BaseTaskQueue
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.tasksApiMod.PartiallyOrderedTasks
import typings.angularCompilerCli.tasksApiMod.TaskDependencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serialTaskQueueMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/execution/tasks/queues/serial_task_queue", "SerialTaskQueue")
  @js.native
  open class SerialTaskQueue protected () extends BaseTaskQueue {
    def this(logger: Logger, tasks: PartiallyOrderedTasks, dependencies: TaskDependencies) = this()
  }
}
