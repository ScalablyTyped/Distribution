package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSessionResponse extends js.Object {
  /**
    * The audio version of the message to convey to the user.
    */
  var audioStream: js.UndefOr[BlobStream] = js.undefined
  /**
    * Content type as specified in the Accept HTTP header in the request.
    */
  var contentType: js.UndefOr[HttpContentType] = js.undefined
  /**
    *     ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before fulfilling an intent.    ElicitIntent - Amazon Lex wants to elicit the user's intent.    ElicitSlot - Amazon Lex is expecting the value of a slot for the current intent.    Failed - Conveys that the conversation with the user has failed. This can happen for various reasons, including the user does not provide an appropriate response to prompts from the service, or if the Lambda function fails to fulfill the intent.    Fulfilled - Conveys that the Lambda function has sucessfully fulfilled the intent.    ReadyForFulfillment - Conveys that the client has to fulfill the intent.  
    */
  var dialogState: js.UndefOr[DialogState] = js.undefined
  /**
    * The name of the current intent.
    */
  var intentName: js.UndefOr[IntentName] = js.undefined
  /**
    * The next message that should be presented to the user.
    */
  var message: js.UndefOr[Text] = js.undefined
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.undefined
  /**
    * Map of key/value pairs representing session-specific context information.
    */
  var sessionAttributes: js.UndefOr[String] = js.undefined
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  /**
    * If the dialogState is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value.
    */
  var slotToElicit: js.UndefOr[String] = js.undefined
  /**
    * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation. Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy the default is ORIGINAL_VALUE. 
    */
  var slots: js.UndefOr[String] = js.undefined
}

object PutSessionResponse {
  @scala.inline
  def apply(
    audioStream: BlobStream = null,
    contentType: HttpContentType = null,
    dialogState: DialogState = null,
    intentName: IntentName = null,
    message: Text = null,
    messageFormat: MessageFormatType = null,
    sessionAttributes: String = null,
    sessionId: String = null,
    slotToElicit: String = null,
    slots: String = null
  ): PutSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (audioStream != null) __obj.updateDynamic("audioStream")(audioStream.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (dialogState != null) __obj.updateDynamic("dialogState")(dialogState.asInstanceOf[js.Any])
    if (intentName != null) __obj.updateDynamic("intentName")(intentName)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (slotToElicit != null) __obj.updateDynamic("slotToElicit")(slotToElicit)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[PutSessionResponse]
  }
}

