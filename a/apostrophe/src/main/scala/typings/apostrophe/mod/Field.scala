package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends js.Object {
  
  var choices: js.UndefOr[js.Array[SelectChoice]] = js.native
  
  var help: js.UndefOr[String] = js.native
  
  var label: String = js.native
  
  var name: String = js.native
  
  var options: js.UndefOr[AposObject] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var schema: js.UndefOr[js.Array[Field]] = js.native
  
  var titleField: js.UndefOr[String] = js.native
  
  var `type`: String = js.native
  
  var widgetType: js.UndefOr[String] = js.native
}
object Field {
  
  @scala.inline
  def apply(label: String, name: String, `type`: String): Field = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChoicesVarargs(value: SelectChoice*): Self = this.set("choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[SelectChoice]): Self = this.set("choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelp: Self = this.set("help", js.undefined)
    
    @scala.inline
    def setOptions(value: AposObject): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSchemaVarargs(value: Field*): Self = this.set("schema", js.Array(value :_*))
    
    @scala.inline
    def setSchema(value: js.Array[Field]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setTitleField(value: String): Self = this.set("titleField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleField: Self = this.set("titleField", js.undefined)
    
    @scala.inline
    def setWidgetType(value: String): Self = this.set("widgetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidgetType: Self = this.set("widgetType", js.undefined)
  }
}
