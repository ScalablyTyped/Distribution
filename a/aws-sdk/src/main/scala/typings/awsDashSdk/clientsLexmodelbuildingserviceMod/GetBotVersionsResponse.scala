package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotVersionsResponse extends js.Object {
  /**
    * An array of BotMetadata objects, one for each numbered version of the bot plus one for the $LATEST version.
    */
  var bots: js.UndefOr[BotMetadataList] = js.undefined
  /**
    * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBotVersionsResponse {
  @scala.inline
  def apply(bots: BotMetadataList = null, nextToken: NextToken = null): GetBotVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (bots != null) __obj.updateDynamic("bots")(bots)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBotVersionsResponse]
  }
}

