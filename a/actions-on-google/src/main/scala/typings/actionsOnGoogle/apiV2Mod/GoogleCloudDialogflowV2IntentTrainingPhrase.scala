package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentTrainingPhrase extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2IntentTrainingPhraseOps[Self <: GoogleCloudDialogflowV2IntentTrainingPhrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPartsVarargs(value: GoogleCloudDialogflowV2IntentTrainingPhrasePart*): Self = this.set("parts", js.Array(value :_*))
    
    @scala.inline
    def setParts(value: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrasePart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParts: Self = this.set("parts", js.undefined)
    
    @scala.inline
    def setTimesAddedCount(value: Double): Self = this.set("timesAddedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimesAddedCount: Self = this.set("timesAddedCount", js.undefined)
    
    @scala.inline
    def setType(value: GoogleCloudDialogflowV2IntentTrainingPhraseType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
