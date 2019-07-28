package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotAliasesRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName
  /**
    * The maximum number of aliases to return in the response. The default is 50. . 
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Substring to match in bot alias names. An alias will be returned if any part of its name matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz."
    */
  var nameContains: js.UndefOr[AliasName] = js.undefined
  /**
    * A pagination token for fetching the next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBotAliasesRequest {
  @scala.inline
  def apply(
    botName: BotName,
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nameContains: AliasName = null,
    nextToken: NextToken = null
  ): GetBotAliasesRequest = {
    val __obj = js.Dynamic.literal(botName = botName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nameContains != null) __obj.updateDynamic("nameContains")(nameContains)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBotAliasesRequest]
  }
}

