package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroundStationData extends js.Object {
  /**
    * ID of a ground station.
    */
  var groundStationId: js.UndefOr[String] = js.undefined
  /**
    * Name of a ground station.
    */
  var groundStationName: js.UndefOr[String] = js.undefined
  /**
    * Ground station Region.
    */
  var region: js.UndefOr[String] = js.undefined
}

object GroundStationData {
  @scala.inline
  def apply(groundStationId: String = null, groundStationName: String = null, region: String = null): GroundStationData = {
    val __obj = js.Dynamic.literal()
    if (groundStationId != null) __obj.updateDynamic("groundStationId")(groundStationId)
    if (groundStationName != null) __obj.updateDynamic("groundStationName")(groundStationName)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[GroundStationData]
  }
}

