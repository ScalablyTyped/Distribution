package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInternetGatewayResult extends js.Object {
  /**
    * Information about the internet gateway.
    */
  var InternetGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InternetGateway] = js.native
}

object CreateInternetGatewayResult {
  @scala.inline
  def apply(InternetGateway: InternetGateway = null): CreateInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (InternetGateway != null) __obj.updateDynamic("InternetGateway")(InternetGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInternetGatewayResult]
  }
}

