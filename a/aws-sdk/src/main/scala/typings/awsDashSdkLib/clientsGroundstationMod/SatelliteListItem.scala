package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SatelliteListItem extends js.Object {
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[satelliteArn] = js.undefined
  /**
    * ID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
}

object SatelliteListItem {
  @scala.inline
  def apply(
    noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
    satelliteArn: satelliteArn = null,
    satelliteId: Uuid = null
  ): SatelliteListItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noradSatelliteID)) __obj.updateDynamic("noradSatelliteID")(noradSatelliteID)
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn)
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId)
    __obj.asInstanceOf[SatelliteListItem]
  }
}

