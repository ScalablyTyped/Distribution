package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSatelliteResponse extends js.Object {
  /**
    * When a satellite was created.
    */
  var dateCreated: js.UndefOr[Timestamp] = js.undefined
  /**
    * When a satellite was last updated.
    */
  var lastUpdated: js.UndefOr[Timestamp] = js.undefined
  /**
    * NORAD satellite ID number.
    */
  var noradSatelliteID: js.UndefOr[typings.awsDashSdk.clientsGroundstationMod.noradSatelliteID] = js.undefined
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[typings.awsDashSdk.clientsGroundstationMod.satelliteArn] = js.undefined
  /**
    * UUID of a satellite.
    */
  var satelliteId: js.UndefOr[Uuid] = js.undefined
  /**
    * Tags assigned to a satellite.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object GetSatelliteResponse {
  @scala.inline
  def apply(
    dateCreated: Timestamp = null,
    lastUpdated: Timestamp = null,
    noradSatelliteID: Int | scala.Double = null,
    satelliteArn: satelliteArn = null,
    satelliteId: Uuid = null,
    tags: TagsMap = null
  ): GetSatelliteResponse = {
    val __obj = js.Dynamic.literal()
    if (dateCreated != null) __obj.updateDynamic("dateCreated")(dateCreated)
    if (lastUpdated != null) __obj.updateDynamic("lastUpdated")(lastUpdated)
    if (noradSatelliteID != null) __obj.updateDynamic("noradSatelliteID")(noradSatelliteID.asInstanceOf[js.Any])
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn)
    if (satelliteId != null) __obj.updateDynamic("satelliteId")(satelliteId)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetSatelliteResponse]
  }
}

