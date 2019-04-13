package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSpeechSynthesisTaskInput extends js.Object {
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: awsDashSdkLib.clientsPollyMod.TaskId
}

object GetSpeechSynthesisTaskInput {
  @scala.inline
  def apply(TaskId: TaskId): GetSpeechSynthesisTaskInput = {
    val __obj = js.Dynamic.literal(TaskId = TaskId)
  
    __obj.asInstanceOf[GetSpeechSynthesisTaskInput]
  }
}

