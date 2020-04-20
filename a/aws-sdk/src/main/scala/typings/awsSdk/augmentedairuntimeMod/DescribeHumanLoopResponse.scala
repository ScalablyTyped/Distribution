package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopResponse extends js.Object {
  /**
    * The creation time when Amazon Augmented AI created the human loop.
    */
  var CreationTime: Timestamp = js.native
  /**
    * A failure code that identifies the type of failure.
    */
  var FailureCode: js.UndefOr[String] = js.native
  /**
    * The reason why a human loop failed. The failure reason is returned when the status of the human loop is Failed.
    */
  var FailureReason: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the flow definition.
    */
  var FlowDefinitionArn: typings.awsSdk.augmentedairuntimeMod.FlowDefinitionArn = js.native
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: typings.awsSdk.augmentedairuntimeMod.HumanLoopArn = js.native
  /**
    * The name of the human loop. The name must be lowercase, unique within the Region in your account, and can have up to 63 characters. Valid characters: a-z, 0-9, and - (hyphen).
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
  /**
    * An object that contains information about the output of the human loop.
    */
  var HumanLoopOutput: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopOutput] = js.native
  /**
    * The status of the human loop. 
    */
  var HumanLoopStatus: typings.awsSdk.augmentedairuntimeMod.HumanLoopStatus = js.native
}

object DescribeHumanLoopResponse {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    FlowDefinitionArn: FlowDefinitionArn,
    HumanLoopArn: HumanLoopArn,
    HumanLoopName: HumanLoopName,
    HumanLoopStatus: HumanLoopStatus,
    FailureCode: String = null,
    FailureReason: String = null,
    HumanLoopOutput: HumanLoopOutput = null
  ): DescribeHumanLoopResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopArn = HumanLoopArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any], HumanLoopStatus = HumanLoopStatus.asInstanceOf[js.Any])
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (HumanLoopOutput != null) __obj.updateDynamic("HumanLoopOutput")(HumanLoopOutput.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopResponse]
  }
}

