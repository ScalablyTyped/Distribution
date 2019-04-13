package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutIntentResponse extends js.Object {
  /**
    * Checksum of the $LATESTversion of the intent created or updated.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * After the Lambda function specified in thefulfillmentActivityintent fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.undefined
  /**
    * If defined in the intent, Amazon Lex prompts the user to confirm the intent before fulfilling it.
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.undefined
  var createVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * If defined in the intent, Amazon Lex invokes this Lambda function for each user input.
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.undefined
  /**
    * If defined in the intent, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.undefined
  /**
    * If defined in the intent, Amazon Lex invokes this Lambda function to fulfill the intent after the user provides all of the information required by the intent.
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.undefined
  /**
    * The date that the intent was updated. When you create a resource, the creation date and last update dates are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.undefined
  /**
    * A unique identifier for the built-in intent that this intent is based on.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.undefined
  /**
    * If the user answers "no" to the question defined in confirmationPrompt Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.undefined
  /**
    *  An array of sample utterances that are configured for the intent. 
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.undefined
  /**
    * An array of intent slots that are configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.undefined
  /**
    * The version of the intent. For a new intent, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object PutIntentResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    conclusionStatement: Statement = null,
    confirmationPrompt: Prompt = null,
    createVersion: js.UndefOr[Boolean] = js.undefined,
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
  ): PutIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (conclusionStatement != null) __obj.updateDynamic("conclusionStatement")(conclusionStatement)
    if (confirmationPrompt != null) __obj.updateDynamic("confirmationPrompt")(confirmationPrompt)
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion)
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
    __obj.asInstanceOf[PutIntentResponse]
  }
}

