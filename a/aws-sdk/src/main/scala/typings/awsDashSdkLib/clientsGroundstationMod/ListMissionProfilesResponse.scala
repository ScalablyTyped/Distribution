package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMissionProfilesResponse extends js.Object {
  /**
    * List of mission profiles
    */
  var missionProfileList: js.UndefOr[MissionProfileList] = js.undefined
  /**
    * Next token returned in the response of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListMissionProfilesResponse {
  @scala.inline
  def apply(missionProfileList: MissionProfileList = null, nextToken: String = null): ListMissionProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (missionProfileList != null) __obj.updateDynamic("missionProfileList")(missionProfileList)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListMissionProfilesResponse]
  }
}

