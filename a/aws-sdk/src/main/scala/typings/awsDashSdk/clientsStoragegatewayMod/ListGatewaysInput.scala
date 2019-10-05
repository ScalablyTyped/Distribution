package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGatewaysInput extends js.Object {
  /**
    * Specifies that the list of gateways returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * An opaque string that indicates the position at which to begin the returned list of gateways.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
}

object ListGatewaysInput {
  @scala.inline
  def apply(Limit: Int | Double = null, Marker: Marker = null): ListGatewaysInput = {
    val __obj = js.Dynamic.literal()
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListGatewaysInput]
  }
}

