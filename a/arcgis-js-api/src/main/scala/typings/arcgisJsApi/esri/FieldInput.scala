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
trait FieldInput
  extends StObject
     with Accessor
     with EditableInput {
  
  /**
  		 * The type of data displayed by the field input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#dataType)
  		 */
  val dataType: number | text | date | unsupported = js.native
  
  /**
  		 * The input value's domain.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#domain)
  		 */
  val domain: CodedValueDomain | RangeDomain = js.native
  
  /**
  		 * Indicates if the field is editable.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#editable)
  		 */
  val editable: Boolean = js.native
  
  /**
  		 * If the input field's value is invalid, this property returns a validation error code.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#error)
  		 */
  val error: String = js.native
  
  /**
  		 * The associated field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#field)
  		 */
  val field: Field = js.native
  
  /**
  		 * The group containing the field input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#group)
  		 */
  val group: GroupInput = js.native
  
  /**
  		 * A hint for the field's value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#hint)
  		 */
  val hint: String = js.native
  
  /**
  		 * Indicates whether date information is included for date inputs.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#includeDate)
  		 */
  val includeDate: Boolean = js.native
  
  /**
  		 * Indicates whether time information is included for date inputs.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#includeTime)
  		 */
  val includeTime: String = js.native
  
  /**
  		 * Indicates whether timestamp information is included for date inputs.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#includeTimestamp)
  		 */
  val includeTimestamp: Boolean = js.native
  
  /**
  		 * The type of editor used when working with `string` fields.
  		 *
  		 * @default text-box
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#inputType)
  		 */
  val inputType: `text-box` | `text-area` = js.native
  
  /**
  		 * The field's label.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#label)
  		 */
  val label: String = js.native
  
  /**
  		 * Restricts the input length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#maxLength)
  		 */
  val maxLength: Double = js.native
  
  /**
  		 * Restricts the input length.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#minLength)
  		 */
  val minLength: Double = js.native
  
  /**
  		 * The associated field name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#name)
  		 */
  val name: String = js.native
  
  /**
  		 * Indicates whether the field is required.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#required)
  		 */
  val required: Boolean = js.native
  
  /**
  		 * Indicates if the field's value can be submitted without introducing data validation issues.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#submittable)
  		 */
  val submittable: Boolean = js.native
  
  /**
  		 * The type of input.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#type)
  		 */
  val `type`: typings.arcgisJsApi.arcgisJsApiStrings.field = js.native
  
  /**
  		 * Indicates if the field is updating.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#updating)
  		 */
  val updating: Boolean = js.native
  
  /**
  		 * Indicates if the input value is valid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#valid)
  		 */
  val valid: Boolean = js.native
  
  /**
  		 * The field input's value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#value)
  		 */
  val value: Double | String | Null = js.native
  
  /**
  		 * Indicates if the field is visible.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldInput.html#visible)
  		 */
  val visible: Boolean = js.native
}
