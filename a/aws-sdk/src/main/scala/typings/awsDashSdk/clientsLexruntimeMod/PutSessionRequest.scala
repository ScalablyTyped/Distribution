package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSessionRequest extends js.Object {
  /**
    * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of this field.   If the value is text/plain; charset=utf-8, Amazon Lex returns text in the response.   If the value begins with audio/, Amazon Lex returns speech in the response. Amazon Lex uses Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify audio/mpeg as the value, Amazon Lex returns speech in the MPEG format.   If the value is audio/pcm, the speech is returned as audio/pcm in 16-bit, little endian format.   The following are the accepted values:    audio/mpeg     audio/ogg     audio/pcm     audio/ * (defaults to mpeg)    text/plain; charset=utf-8     
    */
  var accept: js.UndefOr[Accept] = js.undefined
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName
  /**
    * Sets the next action that the bot should take to fulfill the conversation.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId
}

object PutSessionRequest {
  @scala.inline
  def apply(
    botAlias: BotAlias,
    botName: BotName,
    userId: UserId,
    accept: Accept = null,
    dialogAction: DialogAction = null,
    sessionAttributes: StringMap = null
  ): PutSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, userId = userId)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    __obj.asInstanceOf[PutSessionRequest]
  }
}

