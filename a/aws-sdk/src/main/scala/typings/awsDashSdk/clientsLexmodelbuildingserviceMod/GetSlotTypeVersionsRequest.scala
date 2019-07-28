package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSlotTypeVersionsRequest extends js.Object {
  /**
    * The maximum number of slot type versions to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The name of the slot type for which versions should be returned.
    */
  var name: SlotTypeName
  /**
    * A pagination token for fetching the next page of slot type versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetSlotTypeVersionsRequest {
  @scala.inline
  def apply(name: SlotTypeName, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): GetSlotTypeVersionsRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetSlotTypeVersionsRequest]
  }
}

