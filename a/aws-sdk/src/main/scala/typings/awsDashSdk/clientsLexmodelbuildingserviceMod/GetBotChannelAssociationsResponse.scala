package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotChannelAssociationsResponse extends js.Object {
  /**
    * An array of objects, one for each association, that provides information about the Amazon Lex bot and its association with the channel. 
    */
  var botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.undefined
  /**
    * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBotChannelAssociationsResponse {
  @scala.inline
  def apply(botChannelAssociations: BotChannelAssociationList = null, nextToken: NextToken = null): GetBotChannelAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    if (botChannelAssociations != null) __obj.updateDynamic("botChannelAssociations")(botChannelAssociations)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBotChannelAssociationsResponse]
  }
}

