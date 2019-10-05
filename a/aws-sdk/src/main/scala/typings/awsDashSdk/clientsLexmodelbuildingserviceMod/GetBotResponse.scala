package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotResponse extends js.Object {
  /**
    * The message that Amazon Lex returns when the user elects to end the conversation without completing it. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.undefined
  /**
    * Checksum of the bot used to identify a specific revision of the bot's $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.undefined
  /**
    * The message Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * If status is FAILED, Amazon Lex explains why it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  /**
    * An array of intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentList] = js.undefined
  /**
    * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The target locale for the bot. 
    */
  var locale: js.UndefOr[Locale] = js.undefined
  /**
    * The name of the bot.
    */
  var name: js.UndefOr[BotName] = js.undefined
  /**
    * The status of the bot. If the bot is ready to run, the status is READY. If there was a problem with building the bot, the status is FAILED and the failureReason explains why the bot did not build. If the bot was saved but not built, the status is NOT BUILT.
    */
  var status: js.UndefOr[Status] = js.undefined
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.undefined
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
    */
  var voiceId: js.UndefOr[String] = js.undefined
}

object GetBotResponse {
  @scala.inline
  def apply(
    abortStatement: Statement = null,
    checksum: String = null,
    childDirected: js.UndefOr[scala.Boolean] = js.undefined,
    clarificationPrompt: Prompt = null,
    createdDate: Timestamp = null,
    description: Description = null,
    failureReason: String = null,
    idleSessionTTLInSeconds: Int | Double = null,
    intents: IntentList = null,
    lastUpdatedDate: Timestamp = null,
    locale: Locale = null,
    name: BotName = null,
    status: Status = null,
    version: Version = null,
    voiceId: String = null
  ): GetBotResponse = {
    val __obj = js.Dynamic.literal()
    if (abortStatement != null) __obj.updateDynamic("abortStatement")(abortStatement)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (!js.isUndefined(childDirected)) __obj.updateDynamic("childDirected")(childDirected)
    if (clarificationPrompt != null) __obj.updateDynamic("clarificationPrompt")(clarificationPrompt)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (idleSessionTTLInSeconds != null) __obj.updateDynamic("idleSessionTTLInSeconds")(idleSessionTTLInSeconds.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    if (voiceId != null) __obj.updateDynamic("voiceId")(voiceId)
    __obj.asInstanceOf[GetBotResponse]
  }
}

