package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`text-area`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`text-box`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.date
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.number
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.unsupported
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputField extends Accessor {
  /**
    * The field's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#description)
    */
  val description: String = js.native
  /**
    * The input value's domain. This is used to constrain the allowable values of the layer.
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
    * The type of editor used when working with `string` fields. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * text-box | An HTML textbox used to capture input.
    * text-area | An HTML textarea used to capture input.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#editorType)
    *
    * @default text-box
    */
  val editorType: `text-box` | `text-area` = js.native
  /**
    * If the input field's value is invalid, this property returns validation error code. Otherwise, it is `null`.
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
    * A hint for the field's value. This property is rendered as a tooltip.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#hint)
    */
  val hint: String = js.native
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
    * The type of input field. Possible values are listed below.
    *
    * Value | Description
    * ------|------------
    * number | Input represents a number.
    * text |   Input represents text.
    * date | Input represents a date.
    * unsupported | The field represents an unsupported value. A `blob` field type is an example of this.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#type)
    */
  val `type`: number | text | date | unsupported = js.native
  /**
    * When `true`, the input value is valid. Otherwise, it is invalid.
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
    * When `true`, the field is displayed. Otherwise, it is hidden.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputField.html#visible)
    */
  val visible: Boolean = js.native
}

@JSGlobal("__esri.InputField")
@js.native
object InputField extends TopLevel[InputFieldConstructor]

