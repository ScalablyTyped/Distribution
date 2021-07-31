package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.arcgisJsApiStrings.unsupported
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputField
  extends StObject
     with Accessor {
  
  /**
    * The field's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#description)
    */
  val description: String = js.native
  
  /**
    * The input value's domain.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#domain)
    */
  val domain: CodedValueDomain | RangeDomain = js.native
  
  /**
    * When true, the field can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#editable)
    */
  val editable: Boolean = js.native
  
  /**
    * The type of editor used when working with `string` fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#editorType)
    */
  val editorType: `text-box` | `text-area` = js.native
  
  /**
    * If the input field's value is invalid, this property returns validation error code.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#error)
    */
  val error: String = js.native
  
  /**
    * A user-friendly formatted error message based on the [validation error code](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#error).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#errorMessage)
    */
  val errorMessage: String = js.native
  
  /**
    * The group this input field belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#group)
    */
  val group: InputFieldGroup = js.native
  
  /**
    * A hint for the field's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#hint)
    */
  val hint: String = js.native
  
  /**
    * For date inputs, this enables the time input part.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#includeTime)
    */
  val includeTime: String = js.native
  
  /**
    * The field's label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#label)
    */
  val label: String = js.native
  
  /**
    * Restricts the input length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#maxLength)
    */
  val maxLength: Double = js.native
  
  /**
    * Restricts the input length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#minLength)
    */
  val minLength: Double = js.native
  
  /**
    * The associated field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#name)
    */
  val name: String = js.native
  
  /**
    * Indicates whether the field is required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#required)
    */
  val required: Boolean = js.native
  
  /**
    * The type of input field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#type)
    */
  val `type`: number | text | date | unsupported = js.native
  
  /**
    * When `true`, the input value is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#valid)
    */
  val valid: Boolean = js.native
  
  /**
    * The input's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#value)
    */
  val value: Double | String | js.Any = js.native
  
  /**
    * When `true`, the field is displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#visible)
    */
  val visible: Boolean = js.native
}
