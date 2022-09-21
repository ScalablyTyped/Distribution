package typings.awsLambda.lexV2Mod

import typings.awsLambda.anon.IntentString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexV2Transcription extends StObject {
  
  var resolvedContext: IntentString
  
  var resolvedSlots: LexV2Slots
  
  var transcription: String
  
  var transcriptionConfidence: Double
}
object LexV2Transcription {
  
  inline def apply(
    resolvedContext: IntentString,
    resolvedSlots: LexV2Slots,
    transcription: String,
    transcriptionConfidence: Double
  ): LexV2Transcription = {
    val __obj = js.Dynamic.literal(resolvedContext = resolvedContext.asInstanceOf[js.Any], resolvedSlots = resolvedSlots.asInstanceOf[js.Any], transcription = transcription.asInstanceOf[js.Any], transcriptionConfidence = transcriptionConfidence.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexV2Transcription]
  }
  
  extension [Self <: LexV2Transcription](x: Self) {
    
    inline def setResolvedContext(value: IntentString): Self = StObject.set(x, "resolvedContext", value.asInstanceOf[js.Any])
    
    inline def setResolvedSlots(value: LexV2Slots): Self = StObject.set(x, "resolvedSlots", value.asInstanceOf[js.Any])
    
    inline def setTranscription(value: String): Self = StObject.set(x, "transcription", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionConfidence(value: Double): Self = StObject.set(x, "transcriptionConfidence", value.asInstanceOf[js.Any])
  }
}
