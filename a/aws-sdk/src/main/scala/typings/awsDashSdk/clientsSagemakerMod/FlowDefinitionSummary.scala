package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlowDefinitionSummary extends js.Object {
  /**
    * The timestamp when SageMaker created the flow definition.
    */
  var CreationTime: Timestamp = js.native
  /**
    * The reason why the flow definition creation failed. A failure reason is returned only when the flow definition status is Failed.
    */
  var FailureReason: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FailureReason] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsDashSdk.clientsSagemakerMod.FlowDefinitionArn = js.native
  /**
    * The name of the flow definition.
    */
  var FlowDefinitionName: typings.awsDashSdk.clientsSagemakerMod.FlowDefinitionName = js.native
  /**
    * The status of the flow definition. Valid values:
    */
  var FlowDefinitionStatus: typings.awsDashSdk.clientsSagemakerMod.FlowDefinitionStatus = js.native
}

object FlowDefinitionSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    FlowDefinitionArn: FlowDefinitionArn,
    FlowDefinitionName: FlowDefinitionName,
    FlowDefinitionStatus: FlowDefinitionStatus,
    FailureReason: FailureReason = null
  ): FlowDefinitionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], FlowDefinitionStatus = FlowDefinitionStatus.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDefinitionSummary]
  }
}

