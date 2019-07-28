package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntentVersionsRequest extends js.Object {
  /**
    * The maximum number of intent versions to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The name of the intent for which versions should be returned.
    */
  var name: IntentName
  /**
    * A pagination token for fetching the next page of intent versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetIntentVersionsRequest {
  @scala.inline
  def apply(name: IntentName, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): GetIntentVersionsRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetIntentVersionsRequest]
  }
}

