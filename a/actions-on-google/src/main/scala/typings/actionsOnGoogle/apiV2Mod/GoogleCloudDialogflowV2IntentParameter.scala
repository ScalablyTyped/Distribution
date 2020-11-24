package typings.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentParameter extends js.Object {
  
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
  implicit class GoogleCloudDialogflowV2IntentParameterOps[Self <: GoogleCloudDialogflowV2IntentParameter] (val x: Self) extends AnyVal {
    
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
    def setDefaultValue(value: String): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntityTypeDisplayName(value: String): Self = this.set("entityTypeDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypeDisplayName: Self = this.set("entityTypeDisplayName", js.undefined)
    
    @scala.inline
    def setIsList(value: Boolean): Self = this.set("isList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsList: Self = this.set("isList", js.undefined)
    
    @scala.inline
    def setMandatory(value: Boolean): Self = this.set("mandatory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandatory: Self = this.set("mandatory", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPromptsVarargs(value: String*): Self = this.set("prompts", js.Array(value :_*))
    
    @scala.inline
    def setPrompts(value: js.Array[String]): Self = this.set("prompts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrompts: Self = this.set("prompts", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
