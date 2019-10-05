package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociationsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var AssociationFilterList: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListAssociationsRequest {
  @scala.inline
  def apply(
    AssociationFilterList: AssociationFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null
  ): ListAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AssociationFilterList != null) __obj.updateDynamic("AssociationFilterList")(AssociationFilterList)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociationsRequest]
  }
}

