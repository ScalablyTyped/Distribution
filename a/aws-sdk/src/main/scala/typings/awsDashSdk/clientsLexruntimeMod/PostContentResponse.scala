package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostContentResponse extends js.Object {
  /**
    * The prompt (or statement) to convey to the user. This is based on the bot configuration and context. For example, if Amazon Lex did not understand the user intent, it sends the clarificationPrompt configured for the bot. If the intent requires confirmation before taking the fulfillment action, it sends the confirmationPrompt. Another example: Suppose that the Lambda function successfully fulfilled the intent, and sent a message to convey to the user. Then Amazon Lex sends that message in the response. 
    */
  var audioStream: js.UndefOr[BlobStream] = js.undefined
  /**
    * Content type as specified in the Accept HTTP header in the request.
    */
  var contentType: js.UndefOr[HttpContentType] = js.undefined
  /**
    * Identifies the current state of the user interaction. Amazon Lex returns one of the following values as dialogState. The client can optionally use this information to customize the user interface.     ElicitIntent - Amazon Lex wants to elicit the user's intent. Consider the following examples:   For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent from this utterance, it will return this dialog state.     ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response.  For example, Amazon Lex wants user confirmation before fulfilling an intent. Instead of a simple "yes" or "no" response, a user might respond with additional information. For example, "yes, but make it a thick crust pizza" or "no, I want to order a drink." Amazon Lex can process such additional information (in these examples, update the crust type slot or change the intent from OrderPizza to OrderDrink).     ElicitSlot - Amazon Lex is expecting the value of a slot for the current intent.   For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.     Fulfilled - Conveys that the Lambda function has successfully fulfilled the intent.     ReadyForFulfillment - Conveys that the client has to fulfill the request.     Failed - Conveys that the conversation with the user failed.   This can happen for various reasons, including that the user does not provide an appropriate response to prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or if the Lambda function fails to fulfill the intent.   
    */
  var dialogState: js.UndefOr[DialogState] = js.undefined
  /**
    * The text used to process the request. If the input was an audio stream, the inputTranscript field contains the text extracted from the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this information to determine if Amazon Lex is correctly processing the audio that you send.
    */
  var inputTranscript: js.UndefOr[String] = js.undefined
  /**
    * Current user intent that Amazon Lex is aware of.
    */
  var intentName: js.UndefOr[IntentName] = js.undefined
  /**
    * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function. If the intent is not configured with a Lambda function, or if the Lambda function returned Delegate as the dialogAction.type its response, Amazon Lex decides on the next course of action and selects an appropriate message from the bot's configuration based on the current interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message. When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex returns one message from each group in the response. The message field is an escaped JSON string containing the messages. For more information about the structure of the JSON string returned, see msg-prompts-formats. If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
    */
  var message: js.UndefOr[Text] = js.undefined
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.undefined
  /**
    *  Map of key/value pairs representing the session-specific context information. 
    */
  var sessionAttributes: js.UndefOr[String] = js.undefined
  /**
    *  If the dialogState value is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value. 
    */
  var slotToElicit: js.UndefOr[String] = js.undefined
  /**
    * Map of zero or more intent slots (name/value pairs) Amazon Lex detected from the user input during the conversation. Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var slots: js.UndefOr[String] = js.undefined
}

object PostContentResponse {
  @scala.inline
  def apply(
    audioStream: BlobStream = null,
    contentType: HttpContentType = null,
    dialogState: DialogState = null,
    inputTranscript: String = null,
    intentName: IntentName = null,
    message: Text = null,
    messageFormat: MessageFormatType = null,
    sessionAttributes: String = null,
    slotToElicit: String = null,
    slots: String = null
  ): PostContentResponse = {
    val __obj = js.Dynamic.literal()
    if (audioStream != null) __obj.updateDynamic("audioStream")(audioStream.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (dialogState != null) __obj.updateDynamic("dialogState")(dialogState.asInstanceOf[js.Any])
    if (inputTranscript != null) __obj.updateDynamic("inputTranscript")(inputTranscript)
    if (intentName != null) __obj.updateDynamic("intentName")(intentName)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageFormat != null) __obj.updateDynamic("messageFormat")(messageFormat.asInstanceOf[js.Any])
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes)
    if (slotToElicit != null) __obj.updateDynamic("slotToElicit")(slotToElicit)
    if (slots != null) __obj.updateDynamic("slots")(slots)
    __obj.asInstanceOf[PostContentResponse]
  }
}

