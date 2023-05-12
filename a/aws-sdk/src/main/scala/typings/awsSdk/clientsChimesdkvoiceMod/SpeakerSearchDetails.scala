package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerSearchDetails extends StObject {
  
  /**
    * The result value in the speaker search details.
    */
  var Results: js.UndefOr[SpeakerSearchResultList] = js.undefined
  
  /**
    * The status of a voice print generation operation, VoiceprintGenerationSuccess or VoiceprintGenerationFailure..
    */
  var VoiceprintGenerationStatus: js.UndefOr[NonEmptyString256] = js.undefined
}
object SpeakerSearchDetails {
  
  inline def apply(): SpeakerSearchDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerSearchDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerSearchDetails] (val x: Self) extends AnyVal {
    
    inline def setResults(value: SpeakerSearchResultList): Self = StObject.set(x, "Results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "Results", js.undefined)
    
    inline def setResultsVarargs(value: SpeakerSearchResult*): Self = StObject.set(x, "Results", js.Array(value*))
    
    inline def setVoiceprintGenerationStatus(value: NonEmptyString256): Self = StObject.set(x, "VoiceprintGenerationStatus", value.asInstanceOf[js.Any])
    
    inline def setVoiceprintGenerationStatusUndefined: Self = StObject.set(x, "VoiceprintGenerationStatus", js.undefined)
  }
}
