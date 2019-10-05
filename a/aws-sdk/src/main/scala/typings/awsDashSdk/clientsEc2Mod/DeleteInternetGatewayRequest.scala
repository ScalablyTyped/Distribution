package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInternetGatewayRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: String
}

object DeleteInternetGatewayRequest {
  @scala.inline
  def apply(InternetGatewayId: String, DryRun: js.UndefOr[scala.Boolean] = js.undefined): DeleteInternetGatewayRequest = {
    val __obj = js.Dynamic.literal(InternetGatewayId = InternetGatewayId)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteInternetGatewayRequest]
  }
}

