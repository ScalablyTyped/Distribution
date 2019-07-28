package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBotAliasRequest extends js.Object {
  /**
    * The name of the bot that the alias points to.
    */
  var botName: BotName
  /**
    * The name of the alias to delete. The name is case sensitive. 
    */
  var name: AliasName
}

object DeleteBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, name: AliasName): DeleteBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName, name = name)
  
    __obj.asInstanceOf[DeleteBotAliasRequest]
  }
}

