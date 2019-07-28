package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputVpcRequest extends js.Object {
  /**
    * A list of up to 5 EC2 VPC security group IDs to attach to the Input VPC network interfaces.
  Requires subnetIds. If none are specified then the VPC default security group will be used.
    */
  var SecurityGroupIds: js.UndefOr[__listOf__string] = js.undefined
  /**
    * A list of 2 VPC subnet IDs from the same VPC.
  Subnet IDs must be mapped to two unique availability zones (AZ).
    */
  var SubnetIds: __listOf__string
}

object InputVpcRequest {
  @scala.inline
  def apply(SubnetIds: __listOf__string, SecurityGroupIds: __listOf__string = null): InputVpcRequest = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds)
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds)
    __obj.asInstanceOf[InputVpcRequest]
  }
}

