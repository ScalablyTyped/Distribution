package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetIntentResponse extends js.Object {
  /**
    * Checksum of the intent.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * After the Lambda function specified in the fulfillmentActivity element fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.undefined
  /**
    * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For more information, see PutIntent. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information, see PutIntent. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
  /**
    * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. For more information, see PutIntent.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
  /**
    * Describes how the intent is fulfilled. For more information, see PutIntent. 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
  /**
    * The date that the intent was updated. When you create a resource, the creation date and the last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.undefined
  /**
    * A unique identifier for a built-in intent.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
  /**
    * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.undefined
  /**
    * An array of sample utterances configured for the intent.
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
  /**
    * An array of intent slots configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.undefined
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object GetIntentResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    conclusionStatement: Statement = null,
    confirmationPrompt: Prompt = null,
    createdDate: Timestamp = null,
    description: Description = null,
    dialogCodeHook: CodeHook = null,
    followUpPrompt: FollowUpPrompt = null,
    fulfillmentActivity: FulfillmentActivity = null,
    lastUpdatedDate: Timestamp = null,
    name: IntentName = null,
    parentIntentSignature: BuiltinIntentSignature = null,
    rejectionStatement: Statement = null,
    sampleUtterances: IntentUtteranceList = null,
    slots: SlotList = null,
    version: Version = null
  ): GetIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (conclusionStatement != null) __obj.updateDynamic("conclusionStatement")(conclusionStatement)
    if (confirmationPrompt != null) __obj.updateDynamic("confirmationPrompt")(confirmationPrompt)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (dialogCodeHook != null) __obj.updateDynamic("dialogCodeHook")(dialogCodeHook)
    if (followUpPrompt != null) __obj.updateDynamic("followUpPrompt")(followUpPrompt)
    if (fulfillmentActivity != null) __obj.updateDynamic("fulfillmentActivity")(fulfillmentActivity)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parentIntentSignature != null) __obj.updateDynamic("parentIntentSignature")(parentIntentSignature)
    if (rejectionStatement != null) __obj.updateDynamic("rejectionStatement")(rejectionStatement)
    if (sampleUtterances != null) __obj.updateDynamic("sampleUtterances")(sampleUtterances)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetIntentResponse]
  }
}

