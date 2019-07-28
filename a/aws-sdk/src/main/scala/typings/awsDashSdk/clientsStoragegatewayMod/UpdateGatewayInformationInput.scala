package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGatewayInformationInput extends js.Object {
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
  var GatewayName: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayName] = js.undefined
  /**
    * A value that indicates the time zone of the gateway.
    */
  var GatewayTimezone: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayTimezone] = js.undefined
}

object UpdateGatewayInformationInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, GatewayName: GatewayName = null, GatewayTimezone: GatewayTimezone = null): UpdateGatewayInformationInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
    if (GatewayName != null) __obj.updateDynamic("GatewayName")(GatewayName)
    if (GatewayTimezone != null) __obj.updateDynamic("GatewayTimezone")(GatewayTimezone)
    __obj.asInstanceOf[UpdateGatewayInformationInput]
  }
}

