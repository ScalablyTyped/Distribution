package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldConfig extends Accessor {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#description)
    */
  var description: String = js.native
  /**
    * The field's domain. This is used to constrain the allowable values of the layer.
    * > This only applies to relevant field types. For example, [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) only applies to `numeric` and `date` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#domain)
    */
  var domain: CodedValueDomain | RangeDomain = js.native
  /**
    * Indicates whether the field can be edited.
    * > This does not change the underlying service's field and whether it can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editable)
    *
    * @default true
    */
  var editable: Boolean = js.native
  /**
    * The type of editor to use for `string` field types. Possible values are in the table below. Starting with version 4.16, the preferred way to set the editor type is via [TextAreaInput](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html) or [TextBoxInput](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextBoxInput.html) classes set within the [field element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) of a FeatureForm's [template](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#formTemplate).
    *
    * Value | Description
    * ------|------------
    * text-box | An HTML textbox will be used to capture input.
    * text-area | An HTML textarea will be used to capture input.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editorType)
    *
    * @default "text-box"
    */
  var editorType: `text-box` | `text-area` = js.native
  /**
    * This property is rendered as a tooltip in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget. It displays a hint for the attribute field's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#hint)
    */
  var hint: String = js.native
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#label)
    */
  var label: String = js.native
  /**
    * Restricts the input length.
    * > This only applies to `numeric` and `text` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#maxLength)
    *
    * @default -1
    */
  var maxLength: Double = js.native
  /**
    * Restricts the input length.
    * > This only applies to `numeric` and `text` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#minLength)
    *
    * @default -1
    */
  var minLength: Double = js.native
  /**
    * The field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#name)
    */
  var name: String = js.native
  /**
    * Indicates whether the field is required.
    * > This cannot change the underlying service's field requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#required)
    *
    * @default false
    */
  var required: Boolean = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true` and the element is visible, the element must have a valid value in order for the feature to be created or edited. When the expression evaluates to `false` the element is not required. If no expression is provided, the default behavior is that the element is not required. If the referenced field is non-nullable, the required expression is ignored and the element is always required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#requiredExpression)
    */
  var requiredExpression: String = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true`, the element is displayed. When the expression evaluates to `false` the element is not displayed. If no expression is provided, the default behavior is that the element is displayed. Care must be taken when defining a visibility expression for a non-nullable field i.e. to make sure that such fields either have default values or are made visible to users so that they can provide a value before submitting the form.
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: String = js.native
}

