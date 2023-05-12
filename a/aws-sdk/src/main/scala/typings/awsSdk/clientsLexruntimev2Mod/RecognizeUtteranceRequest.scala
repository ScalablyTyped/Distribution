package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeUtteranceRequest extends StObject {
  
  /**
    * The alias identifier in use for the bot that should receive the request.
    */
  var botAliasId: BotAliasIdentifier
  
  /**
    * The identifier of the bot that should receive the request.
    */
  var botId: BotIdentifier
  
  /**
    * User input in PCM or Opus audio format or text format as described in the requestContentType parameter.
    */
  var inputStream: js.UndefOr[BlobStream] = js.undefined
  
  /**
    * The locale where the session is in use.
    */
  var localeId: LocaleId
  
  /**
    * Request-specific information passed between the client application and Amazon Lex V2  The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes for prefix x-amz-lex:. The requestAttributes field must be compressed using gzip and then base64 encoded before sending to Amazon Lex V2.
    */
  var requestAttributes: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * Indicates the format for audio input or that the content is text. The header must start with one of the following prefixes:   PCM format, audio data must be in little-endian byte order.   audio/l16; rate=16000; channels=1   audio/x-l16; sample-rate=16000; channel-count=1   audio/lpcm; sample-rate=8000; sample-size-bits=16; channel-count=1; is-big-endian=false     Opus format   audio/x-cbr-opus-with-preamble;preamble-size=0;bit-rate=256000;frame-size-milliseconds=4     Text format   text/plain; charset=utf-8    
    */
  var requestContentType: NonEmptyString
  
  /**
    * The message that Amazon Lex V2 returns in the response can be either text or speech based on the responseContentType value.   If the value is text/plain;charset=utf-8, Amazon Lex V2 returns text in the response.   If the value begins with audio/, Amazon Lex V2 returns speech in the response. Amazon Lex V2 uses Amazon Polly to generate the speech using the configuration that you specified in the responseContentType parameter. For example, if you specify audio/mpeg as the value, Amazon Lex V2 returns speech in the MPEG format.   If the value is audio/pcm, the speech returned is audio/pcm at 16 KHz in 16-bit, little-endian format.   The following are the accepted values:   audio/mpeg   audio/ogg   audio/pcm (16 KHz)   audio/ * (defaults to mpeg)   text/plain; charset=utf-8    
    */
  var responseContentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the session in use.
    */
  var sessionId: SessionId
  
  /**
    * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation with the user. The sessionState field must be compressed using gzip and then base64 encoded before sending to Amazon Lex V2.
    */
  var sessionState: js.UndefOr[SensitiveNonEmptyString] = js.undefined
}
object RecognizeUtteranceRequest {
  
  inline def apply(
    botAliasId: BotAliasIdentifier,
    botId: BotIdentifier,
    localeId: LocaleId,
    requestContentType: NonEmptyString,
    sessionId: SessionId
  ): RecognizeUtteranceRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], requestContentType = requestContentType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeUtteranceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizeUtteranceRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasIdentifier): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setInputStream(value: BlobStream): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    inline def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributes(value: SensitiveNonEmptyString): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setRequestContentType(value: NonEmptyString): Self = StObject.set(x, "requestContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentType(value: NonEmptyString): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionState(value: SensitiveNonEmptyString): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
