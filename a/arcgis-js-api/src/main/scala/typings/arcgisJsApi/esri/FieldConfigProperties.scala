package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldConfigProperties extends StObject {
  
  /**
    * The field's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The field's domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#domain)
    */
  var domain: js.UndefOr[CodedValueDomainProperties | RangeDomainProperties] = js.native
  
  /**
    * Indicates whether the field can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editable)
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * The type of editor to use for `string` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editorType)
    */
  var editorType: js.UndefOr[`text-box` | `text-area`] = js.native
  
  /**
    * This property is rendered as a tooltip in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#hint)
    */
  var hint: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether date fields should display input for editing time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#includeTime)
    */
  var includeTime: js.UndefOr[Boolean] = js.native
  
  /**
    * The field's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#label)
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Restricts the input length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#maxLength)
    */
  var maxLength: js.UndefOr[Double] = js.native
  
  /**
    * Restricts the input length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#minLength)
    */
  var minLength: js.UndefOr[Double] = js.native
  
  /**
    * The field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the field is required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#required)
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#requiredExpression)
    */
  var requiredExpression: js.UndefOr[String] = js.native
  
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#visibilityExpression)
    */
  var visibilityExpression: js.UndefOr[String] = js.native
}
object FieldConfigProperties {
  
  @scala.inline
  def apply(): FieldConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfigProperties]
  }
  
  @scala.inline
  implicit class FieldConfigPropertiesMutableBuilder[Self <: FieldConfigProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDomain(value: CodedValueDomainProperties | RangeDomainProperties): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditorType(value: `text-box` | `text-area`): Self = StObject.set(x, "editorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditorTypeUndefined: Self = StObject.set(x, "editorType", js.undefined)
    
    @scala.inline
    def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    @scala.inline
    def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExpression(value: String): Self = StObject.set(x, "requiredExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredExpressionUndefined: Self = StObject.set(x, "requiredExpression", js.undefined)
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityExpressionUndefined: Self = StObject.set(x, "visibilityExpression", js.undefined)
  }
}
