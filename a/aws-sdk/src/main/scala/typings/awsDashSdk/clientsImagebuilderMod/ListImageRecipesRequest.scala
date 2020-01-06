package typings.awsDashSdk.clientsImagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImageRecipesRequest extends js.Object {
  /**
    *  
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    *  The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The owner defines whose image recipes you wish to list. By default this request will only show image recipes owned by your account. You may use this field to specify if you wish to view image recipes owned by yourself, Amazon, or those image recipes that have been shared with you by other customers. 
    */
  var owner: js.UndefOr[Ownership] = js.native
}

object ListImageRecipesRequest {
  @scala.inline
  def apply(
    filters: FilterList = null,
    maxResults: Int | Double = null,
    nextToken: NonEmptyString = null,
    owner: Ownership = null
  ): ListImageRecipesRequest = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageRecipesRequest]
  }
}

