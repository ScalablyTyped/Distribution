package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSpeechSynthesisTaskInput extends js.Object {
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: typings.awsDashSdk.clientsPollyMod.TaskId = js.native
}

object GetSpeechSynthesisTaskInput {
  @scala.inline
  def apply(TaskId: TaskId): GetSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(TaskId = TaskId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
  }
}

