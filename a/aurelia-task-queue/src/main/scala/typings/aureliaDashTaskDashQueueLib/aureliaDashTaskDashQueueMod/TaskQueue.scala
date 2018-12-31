package typings
package aureliaDashTaskDashQueueLib.aureliaDashTaskDashQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-task-queue", "TaskQueue")
@js.native
/**
  * Creates an instance of TaskQueue.
  */
class TaskQueue () extends js.Object {
  /**
    * Whether the queue is in the process of flushing.
    */
  var flushing: js.Any = js.native
  /**
    * Enables long stack traces for queued tasks.
    */
  var longStacks: js.Any = js.native
  /**
    * Immediately flushes the micro task queue.
    */
  def flushMicroTaskQueue(): scala.Unit = js.native
  /**
    * Immediately flushes the task queue.
    */
  def flushTaskQueue(): scala.Unit = js.native
  def prepareQueueStack(): js.Any = js.native
  def prepareQueueStack(separator: js.Any): js.Any = js.native
  /**
    * Queues a task on the micro task queue for ASAP execution.
    * @param task The task to queue up for ASAP execution.
    */
  def queueMicroTask(task: Task): scala.Unit = js.native
  def queueMicroTask(task: js.Function): scala.Unit = js.native
  /**
    * Queues a task on the macro task queue for turn-based execution.
    * @param task The task to queue up for turn-based execution.
    */
  def queueTask(task: Task): scala.Unit = js.native
  def queueTask(task: js.Function): scala.Unit = js.native
}

