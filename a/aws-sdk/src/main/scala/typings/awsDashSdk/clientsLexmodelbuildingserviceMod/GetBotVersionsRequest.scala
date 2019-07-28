package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotVersionsRequest extends js.Object {
  /**
    * The maximum number of bot versions to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The name of the bot for which versions should be returned.
    */
  var name: BotName
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBotVersionsRequest {
  @scala.inline
  def apply(name: BotName, maxResults: js.UndefOr[MaxResults] = js.undefined, nextToken: NextToken = null): GetBotVersionsRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBotVersionsRequest]
  }
}

