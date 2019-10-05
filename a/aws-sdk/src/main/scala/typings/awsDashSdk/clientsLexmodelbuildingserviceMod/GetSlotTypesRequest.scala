package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSlotTypesRequest extends js.Object {
  /**
    * The maximum number of slot types to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Substring to match in slot type names. A slot type will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[SlotTypeName] = js.undefined
  /**
    * A pagination token that fetches the next page of slot types. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch next page of slot types, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetSlotTypesRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nameContains: SlotTypeName = null, nextToken: NextToken = null): GetSlotTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetSlotTypesRequest]
  }
}

