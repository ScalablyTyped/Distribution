package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFlowDefinitionRequest extends js.Object {
  /**
    * The name of your flow definition.
    */
  var FlowDefinitionName: typings.awsDashSdk.clientsSagemakerMod.FlowDefinitionName = js.native
  /**
    * An object containing information about the events that trigger a human workflow.
    */
  var HumanLoopActivationConfig: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.HumanLoopActivationConfig] = js.native
  /**
    * An object containing information about the tasks the human reviewers will perform.
    */
  var HumanLoopConfig: typings.awsDashSdk.clientsSagemakerMod.HumanLoopConfig = js.native
  /**
    * An object containing information about where the human review results will be uploaded.
    */
  var OutputConfig: FlowDefinitionOutputConfig = js.native
  /**
    * The Amazon Resource Name (ARN) of the role needed to call other services on your behalf. For example, arn:aws:iam::1234567890:role/service-role/AmazonSageMaker-ExecutionRole-20180111T151298.
    */
  var RoleArn: typings.awsDashSdk.clientsSagemakerMod.RoleArn = js.native
  /**
    * An array of key-value pairs that contain metadata to help you categorize and organize a flow definition. Each tag consists of a key and a value, both of which you define.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateFlowDefinitionRequest {
  @scala.inline
  def apply(
    FlowDefinitionName: FlowDefinitionName,
    HumanLoopConfig: HumanLoopConfig,
    OutputConfig: FlowDefinitionOutputConfig,
    RoleArn: RoleArn,
    HumanLoopActivationConfig: HumanLoopActivationConfig = null,
    Tags: TagList = null
  ): CreateFlowDefinitionRequest = {
    val __obj = js.Dynamic.literal(FlowDefinitionName = FlowDefinitionName.asInstanceOf[js.Any], HumanLoopConfig = HumanLoopConfig.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (HumanLoopActivationConfig != null) __obj.updateDynamic("HumanLoopActivationConfig")(HumanLoopActivationConfig.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFlowDefinitionRequest]
  }
}

