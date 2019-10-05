package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origination extends js.Object {
  /**
    * When origination settings are disabled, inbound calls are not enabled for your Amazon Chime Voice Connector.
    */
  var Disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The call distribution properties defined for your SIP hosts. Valid range: Minimum value of 1. Maximum value of 20.
    */
  var Routes: js.UndefOr[OriginationRouteList] = js.undefined
}

object Origination {
  @scala.inline
  def apply(Disabled: js.UndefOr[scala.Boolean] = js.undefined, Routes: OriginationRouteList = null): Origination = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled)
    if (Routes != null) __obj.updateDynamic("Routes")(Routes)
    __obj.asInstanceOf[Origination]
  }
}

