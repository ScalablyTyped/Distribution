package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotRequest extends js.Object {
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName
  /**
    * The version or alias of the bot.
    */
  var versionOrAlias: String
}

object GetBotRequest {
  @scala.inline
  def apply(name: BotName, versionOrAlias: String): GetBotRequest = {
    val __obj = js.Dynamic.literal(name = name, versionOrAlias = versionOrAlias)
  
    __obj.asInstanceOf[GetBotRequest]
  }
}

