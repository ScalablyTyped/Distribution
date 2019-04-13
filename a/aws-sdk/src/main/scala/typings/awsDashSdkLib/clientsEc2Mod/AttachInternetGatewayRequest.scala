package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: String
  /**
    * The ID of the VPC.
    */
  var VpcId: String
}

object AttachInternetGatewayRequest {
  @scala.inline
  def apply(InternetGatewayId: String, VpcId: String, DryRun: js.UndefOr[Boolean] = js.undefined): AttachInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId, VpcId = VpcId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AttachInternetGatewayRequest]
  }
}

