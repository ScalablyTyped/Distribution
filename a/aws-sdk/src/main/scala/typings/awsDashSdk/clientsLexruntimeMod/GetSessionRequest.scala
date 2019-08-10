package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSessionRequest extends js.Object {
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId
}

object GetSessionRequest {
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): GetSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, userId = userId)
  
    __obj.asInstanceOf[GetSessionRequest]
  }
}

