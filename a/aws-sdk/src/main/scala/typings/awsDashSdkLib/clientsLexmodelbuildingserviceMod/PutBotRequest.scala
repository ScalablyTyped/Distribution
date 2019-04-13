package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBotRequest extends js.Object {
  /**
    * When Amazon Lex can't understand the user's input in context, it tries to elicit the information a few times. After that, Amazon Lex sends the message defined in abortStatement to the user, and then aborts the conversation. To set the number of retries, use the valueElicitationPrompt field for the slot type.  For example, in a pizza ordering bot, Amazon Lex might ask a user "What type of crust would you like?" If the user's response is not one of the expected responses (for example, "thin crust, "deep dish," etc.), Amazon Lex tries to elicit a correct response a few more times.  For example, in a pizza ordering application, OrderPizza might be one of the intents. This intent might require the CrustType slot. You specify the valueElicitationPrompt field when you create the CrustType slot.
    */
  var abortStatement: js.UndefOr[Statement] = js.undefined
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: Boolean
  /**
    * When Amazon Lex doesn't understand the user's intent, it uses this message to get clarification. To specify how many times Amazon Lex should repeate the clarification prompt, use the maxAttempts field. If Amazon Lex still doesn't understand, it sends the message in the abortStatement field.  When you create a clarification prompt, make sure that it suggests the correct response from the user. for example, for a bot that orders pizza and drinks, you might create this clarification prompt: "What would you like to do? You can say 'Order a pizza' or 'Order a drink.'"
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
  var createVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. A user interaction session remains active for the amount of time specified. If no conversation occurs during this time, the session expires and Amazon Lex deletes any data provided before the timeout. For example, suppose that a user chooses the OrderPizza intent, but gets sidetracked halfway through placing an order. If the user doesn't complete the order within the specified time, Amazon Lex discards the slot information that it gathered, and the user must start over. If you don't include the idleSessionTTLInSeconds element in a PutBot operation request, Amazon Lex uses the default value. This is also true if the request replaces an existing bot. The default is 300 seconds (5 minutes).
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  /**
    * An array of Intent objects. Each intent represents a command that a user can express. For example, a pizza ordering bot might support an OrderPizza intent. For more information, see how-it-works.
    */
  var intents: js.UndefOr[IntentList] = js.undefined
  /**
    *  Specifies the target locale for the bot. Any intent used in the bot must be compatible with the locale of the bot.  The default is en-US.
    */
  var locale: Locale
  /**
    * The name of the bot. The name is not case sensitive. 
    */
  var name: BotName
  /**
    * If you set the processBehavior element to BUILD, Amazon Lex builds the bot so that it can be run. If you set the element to SAVE Amazon Lex saves the bot, but doesn't build it.  If you don't specify this value, the default value is BUILD.
    */
  var processBehavior: js.UndefOr[ProcessBehavior] = js.undefined
  /**
    * The Amazon Polly voice ID that you want Amazon Lex to use for voice interactions with the user. The locale configured for the voice must match the locale of the bot. For more information, see Available Voices in the Amazon Polly Developer Guide.
    */
  var voiceId: js.UndefOr[String] = js.undefined
}

object PutBotRequest {
  @scala.inline
  def apply(
    childDirected: Boolean,
    locale: Locale,
    name: BotName,
    abortStatement: Statement = null,
    checksum: String = null,
    clarificationPrompt: Prompt = null,
    createVersion: js.UndefOr[Boolean] = js.undefined,
    description: Description = null,
    idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
    intents: IntentList = null,
    processBehavior: ProcessBehavior = null,
    voiceId: String = null
  ): PutBotRequest = {
    val __obj = js.Dynamic.literal(childDirected = childDirected, locale = locale.asInstanceOf[js.Any], name = name)
    if (abortStatement != null) __obj.updateDynamic("abortStatement")(abortStatement)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (clarificationPrompt != null) __obj.updateDynamic("clarificationPrompt")(clarificationPrompt)
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(idleSessionTTLInSeconds)) __obj.updateDynamic("idleSessionTTLInSeconds")(idleSessionTTLInSeconds)
    if (intents != null) __obj.updateDynamic("intents")(intents)
    if (processBehavior != null) __obj.updateDynamic("processBehavior")(processBehavior.asInstanceOf[js.Any])
    if (voiceId != null) __obj.updateDynamic("voiceId")(voiceId)
    __obj.asInstanceOf[PutBotRequest]
  }
}

