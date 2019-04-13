package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotAliasRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName
  /**
    * The name of the bot alias. The name is case sensitive.
    */
  var name: AliasName
}

object GetBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, name: AliasName): GetBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName, name = name)
  
    __obj.asInstanceOf[GetBotAliasRequest]
  }
}

