package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroundStationsRequest extends js.Object {
  /**
    * Maximum number of ground stations returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Next token that can be supplied in the next call to get the next page of ground stations.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListGroundStationsRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[Integer] = js.undefined, nextToken: String = null): ListGroundStationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListGroundStationsRequest]
  }
}

