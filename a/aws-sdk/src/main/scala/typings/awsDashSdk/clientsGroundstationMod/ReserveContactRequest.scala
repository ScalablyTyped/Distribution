package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReserveContactRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: Timestamp
  /**
    * Name of a ground station.
    */
  var groundStation: String
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: MissionProfileArn
  /**
    * ARN of a satellite
    */
  var satelliteArn: typings.awsDashSdk.clientsGroundstationMod.satelliteArn
  /**
    * Start time of a contact.
    */
  var startTime: Timestamp
  /**
    * Tags assigned to a contact.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object ReserveContactRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    groundStation: String,
    missionProfileArn: MissionProfileArn,
    satelliteArn: satelliteArn,
    startTime: Timestamp,
    tags: TagsMap = null
  ): ReserveContactRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, groundStation = groundStation, missionProfileArn = missionProfileArn, satelliteArn = satelliteArn, startTime = startTime)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[ReserveContactRequest]
  }
}

