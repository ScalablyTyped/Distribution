package typings.awsLambda.triggerLexV2Mod

import typings.awsLambda.anon.DialogAction
import typings.awsLambda.awsLambdaStrings.DTMF
import typings.awsLambda.awsLambdaStrings.DialogCodeHook
import typings.awsLambda.awsLambdaStrings.FulfillmentCodeHook
import typings.awsLambda.awsLambdaStrings.Speech
import typings.awsLambda.awsLambdaStrings.Text
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Event extends StObject {
  
  var bot: LexV2Bot
  
  var inputMode: DTMF | Speech | Text
  
  var inputTranscript: String
  
  var interpretations: js.Array[LexV2Interpretation]
  
  var invocationSource: DialogCodeHook | FulfillmentCodeHook
  
  var messageVersion: String
  
  var proposedNextState: DialogAction
  
  var requestAttributes: js.UndefOr[Record[String, String]] = js.undefined
  
  var responseContentType: String
  
  var sessionId: String
  
  var sessionState: LexV2SessionState
  
  var transcriptions: js.Array[LexV2Transcription]
}
object LexV2Event {
  
  inline def apply(
    bot: LexV2Bot,
    inputMode: DTMF | Speech | Text,
    inputTranscript: String,
    interpretations: js.Array[LexV2Interpretation],
    invocationSource: DialogCodeHook | FulfillmentCodeHook,
    messageVersion: String,
    proposedNextState: DialogAction,
    responseContentType: String,
    sessionId: String,
    sessionState: LexV2SessionState,
    transcriptions: js.Array[LexV2Transcription]
  ): LexV2Event = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], inputMode = inputMode.asInstanceOf[js.Any], inputTranscript = inputTranscript.asInstanceOf[js.Any], interpretations = interpretations.asInstanceOf[js.Any], invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion.asInstanceOf[js.Any], proposedNextState = proposedNextState.asInstanceOf[js.Any], responseContentType = responseContentType.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionState = sessionState.asInstanceOf[js.Any], transcriptions = transcriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Event]
  }
  
  extension [Self <: LexV2Event](x: Self) {
    
    inline def setBot(value: LexV2Bot): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
    
    inline def setInputMode(value: DTMF | Speech | Text): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
    
    inline def setInputTranscript(value: String): Self = StObject.set(x, "inputTranscript", value.asInstanceOf[js.Any])
    
    inline def setInterpretations(value: js.Array[LexV2Interpretation]): Self = StObject.set(x, "interpretations", value.asInstanceOf[js.Any])
    
    inline def setInterpretationsVarargs(value: LexV2Interpretation*): Self = StObject.set(x, "interpretations", js.Array(value*))
    
    inline def setInvocationSource(value: DialogCodeHook | FulfillmentCodeHook): Self = StObject.set(x, "invocationSource", value.asInstanceOf[js.Any])
    
    inline def setMessageVersion(value: String): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
    
    inline def setProposedNextState(value: DialogAction): Self = StObject.set(x, "proposedNextState", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributes(value: Record[String, String]): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResponseContentType(value: String): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionState(value: LexV2SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setTranscriptions(value: js.Array[LexV2Transcription]): Self = StObject.set(x, "transcriptions", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionsVarargs(value: LexV2Transcription*): Self = StObject.set(x, "transcriptions", js.Array(value*))
  }
}
