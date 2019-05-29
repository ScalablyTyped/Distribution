package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListContactsRequest extends js.Object {
  /**
    * End time of a contact.
    */
  var endTime: Timestamp
  /**
    * Name of a ground station.
    */
  var groundStation: js.UndefOr[String] = js.undefined
  /**
    * Maximum number of contacts returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  /**
    * Next token returned in the request of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * ARN of a satellite.
    */
  var satelliteArn: js.UndefOr[satelliteArn] = js.undefined
  /**
    * Start time of a contact.
    */
  var startTime: Timestamp
  /**
    * Status of a contact reservation.
    */
  var statusList: StatusList
}

object ListContactsRequest {
  @scala.inline
  def apply(
    endTime: Timestamp,
    startTime: Timestamp,
    statusList: StatusList,
    groundStation: String = null,
    maxResults: js.UndefOr[Integer] = js.undefined,
    missionProfileArn: MissionProfileArn = null,
    nextToken: String = null,
    satelliteArn: satelliteArn = null
  ): ListContactsRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime, startTime = startTime, statusList = statusList)
    if (groundStation != null) __obj.updateDynamic("groundStation")(groundStation)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (satelliteArn != null) __obj.updateDynamic("satelliteArn")(satelliteArn)
    __obj.asInstanceOf[ListContactsRequest]
  }
}

