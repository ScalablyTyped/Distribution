package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigsRequest extends js.Object {
  /**
    * Maximum number of Configs returned.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  /**
    * Next token returned in the request of a previous ListConfigs call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListConfigsRequest {
  @scala.inline
  def apply(maxResults: js.UndefOr[Integer] = js.undefined, nextToken: String = null): ListConfigsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListConfigsRequest]
  }
}

