package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeUtteranceResponse extends StObject {
  
  /**
    * The prompt or statement to send to the user. This is based on the bot configuration and context. For example, if Amazon Lex V2 did not understand the user intent, it sends the clarificationPrompt configured for the bot. If the intent requires confirmation before taking the fulfillment action, it sends the confirmationPrompt. Another example: Suppose that the Lambda function successfully fulfilled the intent, and sent a message to convey to the user. Then Amazon Lex V2 sends that message in the response.
    */
  var audioStream: js.UndefOr[BlobStream] = js.undefined
  
  /**
    * Content type as specified in the responseContentType in the request.
    */
  var contentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the input mode to the operation was text or speech. 
    */
  var inputMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The text used to process the request. If the input was an audio stream, the inputTranscript field contains the text extracted from the audio stream. This is the text that is actually processed to recognize intents and slot values. You can use this information to determine if Amazon Lex V2 is correctly processing the audio that you send. The inputTranscript field is compressed with gzip and then base64 encoded. Before you can use the contents of the field, you must decode and decompress the contents. See the example for a simple function to decode and decompress the contents.
    */
  var inputTranscript: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance. Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in the utterance. The interpretations field is compressed with gzip and then base64 encoded. Before you can use the contents of the field, you must decode and decompress the contents. See the example for a simple function to decode and decompress the contents.
    */
  var interpretations: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of messages that were last sent to the user. The messages are ordered based on the order that you returned the messages from your Lambda function or the order that the messages are defined in the bot. The messages field is compressed with gzip and then base64 encoded. Before you can use the contents of the field, you must decode and decompress the contents. See the example for a simple function to decode and decompress the contents.
    */
  var messages: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The bot member that recognized the utterance.
    */
  var recognizedBotMember: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The attributes sent in the request. The requestAttributes field is compressed with gzip and then base64 encoded. Before you can use the contents of the field, you must decode and decompress the contents.
    */
  var requestAttributes: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the session in use.
    */
  var sessionId: js.UndefOr[SessionId] = js.undefined
  
  /**
    * Represents the current state of the dialog between the user and the bot. Use this to determine the progress of the conversation and what the next action might be. The sessionState field is compressed with gzip and then base64 encoded. Before you can use the contents of the field, you must decode and decompress the contents. See the example for a simple function to decode and decompress the contents.
    */
  var sessionState: js.UndefOr[NonEmptyString] = js.undefined
}
object RecognizeUtteranceResponse {
  
  inline def apply(): RecognizeUtteranceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeUtteranceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeUtteranceResponse] (val x: Self) extends AnyVal {
    
    inline def setAudioStream(value: BlobStream): Self = StObject.set(x, "audioStream", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamUndefined: Self = StObject.set(x, "audioStream", js.undefined)
    
    inline def setContentType(value: NonEmptyString): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setInputMode(value: NonEmptyString): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
    
    inline def setInputTranscript(value: NonEmptyString): Self = StObject.set(x, "inputTranscript", value.asInstanceOf[js.Any])
    
    inline def setInputTranscriptUndefined: Self = StObject.set(x, "inputTranscript", js.undefined)
    
    inline def setInterpretations(value: NonEmptyString): Self = StObject.set(x, "interpretations", value.asInstanceOf[js.Any])
    
    inline def setInterpretationsUndefined: Self = StObject.set(x, "interpretations", js.undefined)
    
    inline def setMessages(value: NonEmptyString): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setRecognizedBotMember(value: NonEmptyString): Self = StObject.set(x, "recognizedBotMember", value.asInstanceOf[js.Any])
    
    inline def setRecognizedBotMemberUndefined: Self = StObject.set(x, "recognizedBotMember", js.undefined)
    
    inline def setRequestAttributes(value: NonEmptyString): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionState(value: NonEmptyString): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
