package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentTrainingPhrase extends StObject {
  
  var name: js.UndefOr[String] = js.native
  
  var parts: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]] = js.native
  
  var timesAddedCount: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[GoogleCloudDialogflowV2IntentTrainingPhraseType] = js.native
}
object GoogleCloudDialogflowV2IntentTrainingPhrase {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentTrainingPhrase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrase]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentTrainingPhraseMutableBuilder[Self <: GoogleCloudDialogflowV2IntentTrainingPhrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParts(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrasePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    @scala.inline
    def setTimesAddedCount(value: Double): Self = StObject.set(x, "timesAddedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimesAddedCountUndefined: Self = StObject.set(x, "timesAddedCount", js.undefined)
    
    @scala.inline
    def setType(value: GoogleCloudDialogflowV2IntentTrainingPhraseType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
