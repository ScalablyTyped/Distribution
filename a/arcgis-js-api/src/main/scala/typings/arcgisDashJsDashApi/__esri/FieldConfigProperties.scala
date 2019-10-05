package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldConfigProperties extends js.Object {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The field's domain. This is used to constrain the allowable values of the layer.
    * > This only applies to relevant field types. For example, [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) only applies to `numeric` and `date` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#domain)
    */
  var domain: js.UndefOr[CodedValueDomainProperties | RangeDomainProperties] = js.undefined
  /**
    * Indicates whether the field can be edited.
    * > This does not change the underlying service's field and whether it can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#editable)
    *
    * @default true
    */
  var editable: js.UndefOr[Boolean] = js.undefined
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
  var editorType: js.UndefOr[String] = js.undefined
  /**
    * This property is rendered as a tooltip in the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget. It displays a hint for the attribute field's value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#hint)
    */
  var hint: js.UndefOr[String] = js.undefined
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Restricts the input length.
    * > This only applies to `numeric` and `text` field types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#maxLength)
    *
    * @default -1
    */
  var maxLength: js.UndefOr[Double] = js.undefined
  /**
    * The field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether the field is required.
    * > This cannot change the underlying service's field requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#required)
    *
    * @default false
    */
  var required: js.UndefOr[Boolean] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that controls this field's visibility. The field will only display if this expression is `true`.  [![featureFormFieldVisibility](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureform-fieldvisilbility.png)](https://developers.arcgis.com/javascript/latest/sample-code/sandbox/sandbox.html?sample=editing-featureform-fieldvisibility)
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}

object FieldConfigProperties {
  @scala.inline
  def apply(
    description: String = null,
    domain: CodedValueDomainProperties | RangeDomainProperties = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    editorType: String = null,
    hint: String = null,
    label: String = null,
    maxLength: Int | Double = null,
    name: String = null,
    required: js.UndefOr[Boolean] = js.undefined,
    visibilityExpression: String = null
  ): FieldConfigProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (editorType != null) __obj.updateDynamic("editorType")(editorType)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (label != null) __obj.updateDynamic("label")(label)
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (visibilityExpression != null) __obj.updateDynamic("visibilityExpression")(visibilityExpression)
    __obj.asInstanceOf[FieldConfigProperties]
  }
}

