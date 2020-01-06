package typings.awsDashSdk.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPlaybackConfigurationsRequest extends js.Object {
  /**
    * Maximum number of records to return. 
    */
  var MaxResults: js.UndefOr[__integerMin1Max100] = js.native
  /**
    * Pagination token returned by the GET list request when results exceed the maximum allowed. Use the token to fetch the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListPlaybackConfigurationsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: __string = null): ListPlaybackConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
  }
}

