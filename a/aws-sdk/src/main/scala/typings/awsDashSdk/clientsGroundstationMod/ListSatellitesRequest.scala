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
  def apply(maxResults: js.UndefOr[Integer] = js.undefined, nextToken: String = null): ListSatellitesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListSatellitesRequest]
  }
}

