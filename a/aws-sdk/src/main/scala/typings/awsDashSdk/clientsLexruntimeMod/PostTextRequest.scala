package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostTextRequest extends js.Object {
  /**
    * The alias of the Amazon Lex bot.
    */
  var botAlias: BotAlias
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName
  /**
    * The text that the user entered (Amazon Lex interprets this text).
    */
  var inputText: Text
  /**
    * Request-specific information passed between Amazon Lex and a client application. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:. For more information, see Setting Request Attributes.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.undefined
  /**
    * Application-specific information passed between Amazon Lex and a client application. For more information, see Setting Session Attributes.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. At runtime, each request must contain the userID field. To decide the user ID to use for your application, consider the following factors.   The userID field must not contain any personally identifiable information of the user, for example, name, personal identification numbers, or other end user personal information.   If you want a user to start a conversation on one device and continue on another device, use a user-specific identifier.   If you want the same user to be able to have two independent conversations on two different devices, choose a device-specific identifier.   A user can't have two independent conversations with two different versions of the same bot. For example, a user can't have a conversation with the PROD and BETA versions of the same bot. If you anticipate that a user will need to have conversation with two different versions, for example, while testing, include the bot alias in the user ID to separate the two conversations.  
    */
  var userId: UserId
}

object PostTextRequest {
  @scala.inline
  def apply(
    botAlias: BotAlias,
    botName: BotName,
    inputText: Text,
    userId: UserId,
    requestAttributes: StringMap = null,
    sessionAttributes: StringMap = null
  ): PostTextRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias, botName = botName, inputText = inputText, userId = userId)
    if (requestAttributes != null) __obj.updateDynamic("requestAttributes")(requestAttributes)
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    __obj.asInstanceOf[PostTextRequest]
  }
}

