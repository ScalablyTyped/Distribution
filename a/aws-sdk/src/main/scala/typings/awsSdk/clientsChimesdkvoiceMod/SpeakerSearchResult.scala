package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerSearchResult extends StObject {
  
  /**
    * The confidence score in the speaker search analysis.
    */
  var ConfidenceScore: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.ConfidenceScore] = js.undefined
  
  /**
    * The voice profile ID.
    */
  var VoiceProfileId: js.UndefOr[NonEmptyString256] = js.undefined
}
object SpeakerSearchResult {
  
  inline def apply(): SpeakerSearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerSearchResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerSearchResult] (val x: Self) extends AnyVal {
    
    inline def setConfidenceScore(value: ConfidenceScore): Self = StObject.set(x, "ConfidenceScore", value.asInstanceOf[js.Any])
    
    inline def setConfidenceScoreUndefined: Self = StObject.set(x, "ConfidenceScore", js.undefined)
    
    inline def setVoiceProfileId(value: NonEmptyString256): Self = StObject.set(x, "VoiceProfileId", value.asInstanceOf[js.Any])
    
    inline def setVoiceProfileIdUndefined: Self = StObject.set(x, "VoiceProfileId", js.undefined)
  }
}
