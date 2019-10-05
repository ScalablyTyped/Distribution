package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
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
    * The type of editor to use for `string` field types. Possible values are in the table below.
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
  var editorType: String = js.native
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
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that controls this field's visibility. The field will only display if this expression is `true`.  [![featureFormFieldVisibility](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureform-fieldvisilbility.png)](https://developers.arcgis.com/javascript/latest/sample-code/sandbox/sandbox.html?sample=editing-featureform-fieldvisibility)
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: String = js.native
}

@JSGlobal("__esri.FieldConfig")
@js.native
object FieldConfig extends TopLevel[FieldConfigConstructor]

