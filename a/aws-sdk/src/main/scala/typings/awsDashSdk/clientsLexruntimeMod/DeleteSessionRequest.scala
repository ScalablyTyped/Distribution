package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSessionRequest extends js.Object {
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName
  /**
    * The identifier of the user associated with the session data.
    */
  var userId: UserId
}

object DeleteSessionRequest {
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): DeleteSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, userId = userId)
  
    __obj.asInstanceOf[DeleteSessionRequest]
  }
}

