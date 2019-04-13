package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNatGatewayRequest extends js.Object {
  /**
    * The allocation ID of an Elastic IP address to associate with the NAT gateway. If the Elastic IP address is associated with another resource, you must first disassociate it.
    */
  var AllocationId: String
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency. Constraint: Maximum 64 ASCII characters.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The subnet in which to create the NAT gateway.
    */
  var SubnetId: String
}

object CreateNatGatewayRequest {
  @scala.inline
  def apply(AllocationId: String, SubnetId: String, ClientToken: String = null): CreateNatGatewayRequest = {
    val __obj = js.Dynamic.literal(AllocationId = AllocationId, SubnetId = SubnetId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    __obj.asInstanceOf[CreateNatGatewayRequest]
  }
}

