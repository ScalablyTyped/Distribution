package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClientVpnEndpointResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.undefined
}

object ModifyClientVpnEndpointResult {
  @scala.inline
  def apply(Return: js.UndefOr[scala.Boolean] = js.undefined): ModifyClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Return)) __obj.updateDynamic("Return")(Return)
    __obj.asInstanceOf[ModifyClientVpnEndpointResult]
  }
}

