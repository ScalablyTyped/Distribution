package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntentsRequest extends js.Object {
  /**
    * The maximum number of intents to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Substring to match in intent names. An intent will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[IntentName] = js.undefined
  /**
    * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetIntentsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nameContains: IntentName = null, nextToken: NextToken = null): GetIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetIntentsRequest]
  }
}

