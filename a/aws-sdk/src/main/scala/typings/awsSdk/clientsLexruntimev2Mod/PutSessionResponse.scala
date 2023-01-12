package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSessionResponse extends StObject {
  
  /**
    * If the requested content type was audio, the audio version of the message to convey to the user.
    */
  var audioStream: js.UndefOr[BlobStream] = js.undefined
  
  /**
    * The type of response. Same as the type specified in the responseContentType field in the request.
    */
  var contentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of messages that were last sent to the user. The messages are ordered based on how you return the messages from you Lambda function or the order that the messages are defined in the bot.
    */
  var messages: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Request-specific information passed between the client application and Amazon Lex V2. These are the same as the requestAttribute parameter in the call to the PutSession operation.
    */
  var requestAttributes: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the session that received the data.
    */
  var sessionId: js.UndefOr[SessionId] = js.undefined
  
  /**
    * Represents the current state of the dialog between the user and the bot. Use this to determine the progress of the conversation and what the next action may be.
    */
  var sessionState: js.UndefOr[NonEmptyString] = js.undefined
}
object PutSessionResponse {
  
  inline def apply(): PutSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setAudioStream(value: BlobStream): Self = StObject.set(x, "audioStream", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamUndefined: Self = StObject.set(x, "audioStream", js.undefined)
    
    inline def setContentType(value: NonEmptyString): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setMessages(value: NonEmptyString): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setRequestAttributes(value: NonEmptyString): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionState(value: NonEmptyString): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
