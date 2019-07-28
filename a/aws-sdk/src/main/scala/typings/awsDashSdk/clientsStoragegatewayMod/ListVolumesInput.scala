package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumesInput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * Specifies that the list of volumes returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  /**
    * A string that indicates the position at which to begin the returned list of volumes. Obtain the marker from the response of a previous List iSCSI Volumes request.
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.Marker] = js.undefined
}

object ListVolumesInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN = null,
    Limit: js.UndefOr[PositiveIntObject] = js.undefined,
    Marker: Marker = null
  ): ListVolumesInput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListVolumesInput]
  }
}

