package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotAliasesResponse extends js.Object {
  /**
    * An array of BotAliasMetadata objects, each describing a bot alias.
    */
  var BotAliases: js.UndefOr[BotAliasMetadataList] = js.undefined
  /**
    * A pagination token for fetching next page of aliases. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of aliases, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBotAliasesResponse {
  @scala.inline
  def apply(BotAliases: BotAliasMetadataList = null, nextToken: NextToken = null): GetBotAliasesResponse = {
    val __obj = js.Dynamic.literal()
    if (BotAliases != null) __obj.updateDynamic("BotAliases")(BotAliases)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBotAliasesResponse]
  }
}

