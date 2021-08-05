package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentTrainingPhrase extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]] = js.undefined
  
  var timesAddedCount: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[GoogleCloudDialogflowV2IntentTrainingPhraseType] = js.undefined
}
object GoogleCloudDialogflowV2IntentTrainingPhrase {
  
  inline def apply(): GoogleCloudDialogflowV2IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrase]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentTrainingPhrase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParts(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    inline def setPartsVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrasePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    inline def setTimesAddedCount(value: Double): Self = StObject.set(x, "timesAddedCount", value.asInstanceOf[js.Any])
    
    inline def setTimesAddedCountUndefined: Self = StObject.set(x, "timesAddedCount", js.undefined)
    
    inline def setType(value: GoogleCloudDialogflowV2IntentTrainingPhraseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
