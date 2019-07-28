package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBotChannelAssociationRequest extends js.Object {
  /**
    * An alias that points to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName
  /**
    * The name of the association. The name is case sensitive. 
    */
  var name: BotChannelName
}

object DeleteBotChannelAssociationRequest {
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): DeleteBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, name = name)
  
    __obj.asInstanceOf[DeleteBotChannelAssociationRequest]
  }
}

