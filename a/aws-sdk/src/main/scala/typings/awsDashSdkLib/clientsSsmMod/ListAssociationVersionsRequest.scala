package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociationVersionsRequest extends js.Object {
  /**
    * The association ID for which you want to view all versions.
    */
  var AssociationId: awsDashSdkLib.clientsSsmMod.AssociationId
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token to start the list. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAssociationVersionsRequest {
  @scala.inline
  def apply(
    AssociationId: AssociationId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListAssociationVersionsRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociationVersionsRequest]
  }
}

