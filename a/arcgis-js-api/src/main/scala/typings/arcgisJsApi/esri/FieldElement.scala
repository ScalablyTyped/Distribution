package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.field
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldElement
  extends StObject
     with Element {
  
  /**
    * The [coded value domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [range domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#domain)
    */
  var domain: CodedValueDomain | RangeDomain = js.native
  
  /**
    * A Boolean determining whether users can edit this form element.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editable)
    */
  var editable: Boolean = js.native
  
  /**
    * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the FormTemplate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editableExpression)
    */
  var editableExpression: String = js.native
  
  /**
    * The field name as defined by the feature layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#fieldName)
    */
  var fieldName: String = js.native
  
  /**
    * Contains a hint used to help editors while editing fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#hint)
    */
  var hint: String = js.native
  
  /**
    * The input to use for the element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#input)
    */
  var input: TextBoxInput | TextAreaInput | DateTimePickerInput | BarcodeScannerInput | ComboBoxInput | RadioButtonsInput | SwitchInput = js.native
  
  /**
    * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#requiredExpression)
    */
  var requiredExpression: String = js.native
  
  /**
    * Indicates the type of form [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#type)
    */
  @JSName("type")
  val type_FieldElement: field = js.native
  
  /**
    * A reference to the [name](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html#name) of an [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos) of the [FormTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#valueExpression)
    */
  var valueExpression: String = js.native
}
