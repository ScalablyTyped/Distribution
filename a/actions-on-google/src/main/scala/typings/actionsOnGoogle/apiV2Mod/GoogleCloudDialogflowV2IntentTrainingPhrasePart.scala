package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentTrainingPhrasePart extends StObject {
  
  var alias: js.UndefOr[String] = js.native
  
  var entityType: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var userDefined: js.UndefOr[Boolean] = js.native
}
object GoogleCloudDialogflowV2IntentTrainingPhrasePart {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentTrainingPhrasePartMutableBuilder[Self <: GoogleCloudDialogflowV2IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeUndefined: Self = StObject.set(x, "entityType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUserDefined(value: Boolean): Self = StObject.set(x, "userDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedUndefined: Self = StObject.set(x, "userDefined", js.undefined)
  }
}
