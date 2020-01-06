package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionTrigger extends js.Object {
  /**
    * Detail related to the event that started a pipeline execution, such as the webhook ARN of the webhook that triggered the pipeline execution or the user ARN for a user-initiated start-pipeline-execution CLI command.
    */
  var triggerDetail: js.UndefOr[TriggerDetail] = js.native
  /**
    * The type of change-detection method, command, or user interaction that started a pipeline execution.
    */
  var triggerType: js.UndefOr[TriggerType] = js.native
}

object ExecutionTrigger {
  @scala.inline
  def apply(triggerDetail: TriggerDetail = null, triggerType: TriggerType = null): ExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    if (triggerDetail != null) __obj.updateDynamic("triggerDetail")(triggerDetail.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTrigger]
  }
}

