package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPlaybackConfigurationsResponse extends js.Object {
  /**
    * Array of playback configurations. This might be all the available configurations or a subset, depending on the settings that you provide and the total number of configurations stored. 
    */
  var Items: js.UndefOr[__listOfPlaybackConfigurations] = js.undefined
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListPlaybackConfigurationsResponse {
  @scala.inline
  def apply(Items: __listOfPlaybackConfigurations = null, NextToken: __string = null): ListPlaybackConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Items != null) __obj.updateDynamic("Items")(Items)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListPlaybackConfigurationsResponse]
  }
}

