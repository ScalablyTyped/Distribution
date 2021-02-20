package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentParameter extends StObject {
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var entityTypeDisplayName: js.UndefOr[String] = js.native
  
  var isList: js.UndefOr[Boolean] = js.native
  
  var mandatory: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var prompts: js.UndefOr[js.Array[String]] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentParameter {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentParameter]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentParameterMutableBuilder[Self <: GoogleCloudDialogflowV2IntentParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEntityTypeDisplayName(value: String): Self = StObject.set(x, "entityTypeDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeDisplayNameUndefined: Self = StObject.set(x, "entityTypeDisplayName", js.undefined)
    
    @scala.inline
    def setIsList(value: Boolean): Self = StObject.set(x, "isList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsListUndefined: Self = StObject.set(x, "isList", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandatoryUndefined: Self = StObject.set(x, "mandatory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPrompts(value: js.Array[String]): Self = StObject.set(x, "prompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptsUndefined: Self = StObject.set(x, "prompts", js.undefined)
    
    @scala.inline
    def setPromptsVarargs(value: String*): Self = StObject.set(x, "prompts", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
