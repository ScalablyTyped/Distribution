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
    HumanLoopStatus: HumanLoopStatus
  ): DescribeHumanLoopResponse = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], FlowDefinitionArn = FlowDefinitionArn.asInstanceOf[js.Any], HumanLoopArn = HumanLoopArn.asInstanceOf[js.Any], HumanLoopName = HumanLoopName.asInstanceOf[js.Any], HumanLoopStatus = HumanLoopStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHumanLoopResponse]
  }
  @scala.inline
  implicit class DescribeHumanLoopResponseOps[Self <: DescribeHumanLoopResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlowDefinitionArn(value: FlowDefinitionArn): Self = this.set("FlowDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopArn(value: HumanLoopArn): Self = this.set("HumanLoopArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopName(value: HumanLoopName): Self = this.set("HumanLoopName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHumanLoopStatus(value: HumanLoopStatus): Self = this.set("HumanLoopStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureCode(value: String): Self = this.set("FailureCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureCode: Self = this.set("FailureCode", js.undefined)
    @scala.inline
    def setFailureReason(value: String): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setHumanLoopOutput(value: HumanLoopOutput): Self = this.set("HumanLoopOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopOutput: Self = this.set("HumanLoopOutput", js.undefined)
  }
  
}

