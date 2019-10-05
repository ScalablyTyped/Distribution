package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListSatellitesRequest extends js.Object {
  /**
    * Maximum number of satellites returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListSatellitesRequest {
  @scala.inline
  def apply(maxResults: Int | scala.Double = null, nextToken: String = null): ListSatellitesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSatellitesRequest]
  }
}

