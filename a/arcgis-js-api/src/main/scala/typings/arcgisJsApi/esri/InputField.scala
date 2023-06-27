package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Starting at version 4.27, this class is deprecated and should no longer be used.
	 *
	 * @deprecated since 4.27. Use {@link module:esri/widgets/FeatureForm/FieldInput} instead.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html)
	 */
trait InputField extends StObject {
  
  val description: String
  
  val domain: CodedValueDomain | RangeDomain
  
  val editable: Boolean
  
  val editorType: `text-box` | `text-area`
  
  val error: String
  
  val errorMessage: String
  
  val group: InputFieldGroup
  
  val hint: String
  
  val includeTime: Boolean
  
  val label: String
  
  val maxLength: Double
  
  val minLength: Double
  
  val name: String
  
  val required: Boolean
  
  val submittable: Boolean
  
  val `type`: Boolean
  
  val updating: Boolean
  
  val valid: Boolean
  
  val value: Double | String | Null
  
  val visible: Boolean
}
object InputField {
  
  inline def apply(
    description: String,
    domain: CodedValueDomain | RangeDomain,
    editable: Boolean,
    editorType: `text-box` | `text-area`,
    error: String,
    errorMessage: String,
    group: InputFieldGroup,
    hint: String,
    includeTime: Boolean,
    label: String,
    maxLength: Double,
    minLength: Double,
    name: String,
    required: Boolean,
    submittable: Boolean,
    `type`: Boolean,
    updating: Boolean,
    valid: Boolean,
    visible: Boolean
  ): InputField = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], editorType = editorType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any], includeTime = includeTime.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], submittable = submittable.asInstanceOf[js.Any], updating = updating.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], value = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputField] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: CodedValueDomain | RangeDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditorType(value: `text-box` | `text-area`): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: InputFieldGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setSubmittable(value: Boolean): Self = StObject.set(x, "submittable", value.asInstanceOf[js.Any])
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdating(value: Boolean): Self = StObject.set(x, "updating", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
