package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNatGatewayRequest extends js.Object {
  /**
    * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is associated with another resource, you must first disassociate it.
    */
  var AllocationId: typings.awsDashSdk.clientsEc2Mod.AllocationId = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency. Constraint: Maximum 64 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The subnet in which to create the NAT gateway.
    */
  var SubnetId: typings.awsDashSdk.clientsEc2Mod.SubnetId = js.native
}

object CreateNatGatewayRequest {
  @scala.inline
  def apply(AllocationId: AllocationId, SubnetId: SubnetId, ClientToken: String = null): CreateNatGatewayRequest = {
    val __obj = js.Dynamic.literal(AllocationId = AllocationId.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNatGatewayRequest]
  }
}

