package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.BarcodeScannerInputProper
import typings.arcgisJsApi.anon.CodedValueDomainPropertie
import typings.arcgisJsApi.anon.ComboBoxInputPropertiesty
import typings.arcgisJsApi.anon.DateTimePickerInputProper
import typings.arcgisJsApi.anon.RadioButtonsInputProperti
import typings.arcgisJsApi.anon.RangeDomainPropertiestype
import typings.arcgisJsApi.anon.SwitchInputPropertiestype
import typings.arcgisJsApi.anon.TextAreaInputPropertiesty
import typings.arcgisJsApi.anon.TextBoxInputPropertiestyp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldElementProperties
  extends StObject
     with ElementProperties {
  
  /**
  		 * The [coded value domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [range domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) of the field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#domain)
  		 */
  var domain: js.UndefOr[CodedValueDomainPropertie | RangeDomainPropertiestype] = js.undefined
  
  /**
  		 * A Boolean determining whether users can edit this form element.
  		 *
  		 * @default true
  		 * @deprecated since version 4.26. Use [`editableExpression`](#editableExpression) instead. Assigning `editableExpression` values of `"true"` and `"false"` will have the same effect as assigning `true` and `false` to `editable`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editable)
  		 */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FormTemplate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editableExpression)
  		 */
  var editableExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * The field name as defined by the feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#fieldName)
  		 */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /**
  		 * Contains a hint used to help editors while editing fields.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#hint)
  		 */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
  		 * The input to use for the element.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#input)
  		 */
  var input: js.UndefOr[
    TextBoxInputPropertiestyp | TextAreaInputPropertiesty | DateTimePickerInputProper | BarcodeScannerInputProper | ComboBoxInputPropertiesty | RadioButtonsInputProperti | SwitchInputPropertiestype
  ] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#requiredExpression)
  		 */
  var requiredExpression: js.UndefOr[String] = js.undefined
  
  /**
  		 * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#valueExpression)
  		 */
  var valueExpression: js.UndefOr[String] = js.undefined
}
object FieldElementProperties {
  
  inline def apply(): FieldElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldElementProperties] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: CodedValueDomainPropertie | RangeDomainPropertiestype): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableExpression(value: String): Self = StObject.set(x, "editableExpression", value.asInstanceOf[js.Any])
    
    inline def setEditableExpressionUndefined: Self = StObject.set(x, "editableExpression", js.undefined)
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setInput(
      value: TextBoxInputPropertiestyp | TextAreaInputPropertiesty | DateTimePickerInputProper | BarcodeScannerInputProper | ComboBoxInputPropertiesty | RadioButtonsInputProperti | SwitchInputPropertiestype
    ): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setRequiredExpression(value: String): Self = StObject.set(x, "requiredExpression", value.asInstanceOf[js.Any])
    
    inline def setRequiredExpressionUndefined: Self = StObject.set(x, "requiredExpression", js.undefined)
    
    inline def setValueExpression(value: String): Self = StObject.set(x, "valueExpression", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionUndefined: Self = StObject.set(x, "valueExpression", js.undefined)
  }
}
