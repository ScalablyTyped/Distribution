package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApiKeysResponse extends js.Object {
  /**
    * The ApiKey objects.
    */
  var apiKeys: js.UndefOr[ApiKeys] = js.native
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListApiKeysResponse {
  @scala.inline
  def apply(apiKeys: ApiKeys = null, nextToken: PaginationToken = null): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (apiKeys != null) __obj.updateDynamic("apiKeys")(apiKeys.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApiKeysResponse]
  }
}

