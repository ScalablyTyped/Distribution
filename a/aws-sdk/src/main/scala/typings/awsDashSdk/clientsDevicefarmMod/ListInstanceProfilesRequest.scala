package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInstanceProfilesRequest extends js.Object {
  /**
    * An integer that specifies the maximum number of items you want to return in the API response.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListInstanceProfilesRequest {
  @scala.inline
  def apply(maxResults: Int | scala.Double = null, nextToken: PaginationToken = null): ListInstanceProfilesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInstanceProfilesRequest]
  }
}

