package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.CodedValueDomainPropertie
import typings.arcgisJsApi.anon.RangeDomainPropertiestype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldConfigProperties extends StObject {
  
  /**
  		 * The field's description.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field's domain.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#domain)
  		 */
  var domain: js.UndefOr[CodedValueDomainPropertie | RangeDomainPropertiestype] = js.undefined
  
  /**
  		 * Indicates whether the field can be edited.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editable)
  		 */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * This property is rendered as a tooltip in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#hint)
  		 */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether date fields should display input for editing time.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#includeTime)
  		 */
  var includeTime: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The field's label.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * Restricts the input length.
  		 *
  		 * @default -1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#maxLength)
  		 */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Restricts the input length.
  		 *
  		 * @default -1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#minLength)
  		 */
  var minLength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether the field is required.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#required)
  		 */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FeatureForm.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#requiredExpression)
  		 */
  var requiredExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FeatureForm.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#visibilityExpression)
  		 */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}
object FieldConfigProperties {
  
  inline def apply(): FieldConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldConfigProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldConfigProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDomain(value: CodedValueDomainPropertie | RangeDomainPropertiestype): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setIncludeTime(value: Boolean): Self = StObject.set(x, "includeTime", value.asInstanceOf[js.Any])
    
    inline def setIncludeTimeUndefined: Self = StObject.set(x, "includeTime", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredExpression(value: String): Self = StObject.set(x, "requiredExpression", value.asInstanceOf[js.Any])
    
    inline def setRequiredExpressionUndefined: Self = StObject.set(x, "requiredExpression", js.undefined)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setVisibilityExpression(value: String): Self = StObject.set(x, "visibilityExpression", value.asInstanceOf[js.Any])
    
    inline def setVisibilityExpressionUndefined: Self = StObject.set(x, "visibilityExpression", js.undefined)
  }
}
