package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSatellitesResponse extends js.Object {
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * List of satellites.
    */
  var satellites: js.UndefOr[SatelliteList] = js.native
}

object ListSatellitesResponse {
  @scala.inline
  def apply(nextToken: String = null, satellites: SatelliteList = null): ListSatellitesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (satellites != null) __obj.updateDynamic("satellites")(satellites.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSatellitesResponse]
  }
}

