package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopResponse extends js.Object {
  /**
    * The timestamp when Amazon Augmented AI created the human loop.
    */
  var CreationTimestamp: Timestamp = js.native
  /**
    * A failure code denoting a specific type of failure.
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * The reason why a human loop has failed. The failure reason is returned when the human loop status is Failed.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsDashSdk.clientsAugmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopArn = js.native
  /**
    * An object containing information about the human loop input.
    */
  var HumanLoopInput: HumanLoopInputContent = js.native
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopName = js.native
  /**
    * An object containing information about the output of the human loop.
    */
  var HumanLoopOutput: js.UndefOr[HumanLoopOutputContent] = js.native
  /**
    * The status of the human loop. Valid values:
    */
  var HumanLoopStatus: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopStatus = js.native
}

object DescribeHumanLoopResponse {
  @scala.inline
  def apply(
    CreationTimestamp: Timestamp,
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopArn: HumanLoopArn,
    HumanLoopInput: HumanLoopInputContent,
    HumanLoopName: HumanLoopName,
    HumanLoopStatus: HumanLoopStatus,
    FailureCode: String = null,
    FailureReason: String = null,
    HumanLoopOutput: HumanLoopOutputContent = null
  ): DescribeHumanLoopResponse = {
    val __obj = js.Dynamic.literal(CreationTimestamp = CreationTimestamp.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopArn = HumanLoopArn.asInstanceOf[js.Any], HumanLoopInput = HumanLoopInput.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any], HumanLoopStatus = HumanLoopStatus.asInstanceOf[js.Any])
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HumanLoopOutput != null) __obj.updateDynamic("HumanLoopOutput")(HumanLoopOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopResponse]
  }
}

