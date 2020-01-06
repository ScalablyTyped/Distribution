package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroundStationsResponse extends js.Object {
  /**
    * List of ground stations.
    */
  var groundStationList: js.UndefOr[GroundStationList] = js.native
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListGroundStationsResponse {
  @scala.inline
  def apply(groundStationList: GroundStationList = null, nextToken: String = null): ListGroundStationsResponse = {
    val __obj = js.Dynamic.literal()
    if (groundStationList != null) __obj.updateDynamic("groundStationList")(groundStationList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroundStationsResponse]
  }
}

