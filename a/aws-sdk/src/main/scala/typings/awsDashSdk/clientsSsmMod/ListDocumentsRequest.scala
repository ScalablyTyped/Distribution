package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDocumentsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var DocumentFilterList: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentFilterList] = js.undefined
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var Filters: js.UndefOr[DocumentKeyValuesFilterList] = js.undefined
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object ListDocumentsRequest {
  @scala.inline
  def apply(
    DocumentFilterList: DocumentFilterList = null,
    Filters: DocumentKeyValuesFilterList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null
  ): ListDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    if (DocumentFilterList != null) __obj.updateDynamic("DocumentFilterList")(DocumentFilterList)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDocumentsRequest]
  }
}

