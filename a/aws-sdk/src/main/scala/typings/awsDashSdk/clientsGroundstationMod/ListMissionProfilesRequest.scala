package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMissionProfilesRequest extends js.Object {
  /**
    * Maximum number of mission profiles returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Next token returned in the request of a previous ListMissionProfiles call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListMissionProfilesRequest {
  @scala.inline
  def apply(maxResults: Int | scala.Double = null, nextToken: String = null): ListMissionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListMissionProfilesRequest]
  }
}

