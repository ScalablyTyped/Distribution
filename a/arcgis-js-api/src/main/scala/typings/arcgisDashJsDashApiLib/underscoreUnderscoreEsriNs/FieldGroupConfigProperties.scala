package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldGroupConfigProperties extends js.Object {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The field configurations belonging to a group. For an example of grouped field configurations, please refer to the [Update Feature Attributes](https://developers.arcgis.com/javascript/latest/sample-code/editing-groupedfeatureform/index.html) sample.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties]] = js.undefined
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that controls this field's visibility. The field will only display if this expression is `true`.  [![featureFormFieldVisibility](https://developers.arcgis.com/javascript/assets/img/apiref/widgets/featureform-fieldvisilbility.png)](https://developers.arcgis.com/javascript/latest/sample-code/sandbox/sandbox.html?sample=editing-featureform-fieldvisibility)
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[java.lang.String] = js.undefined
}

object FieldGroupConfigProperties {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    fieldConfig: js.Array[FieldConfigProperties] = null,
    label: java.lang.String = null,
    visibilityExpression: java.lang.String = null
  ): FieldGroupConfigProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fieldConfig != null) __obj.updateDynamic("fieldConfig")(fieldConfig)
    if (label != null) __obj.updateDynamic("label")(label)
    if (visibilityExpression != null) __obj.updateDynamic("visibilityExpression")(visibilityExpression)
    __obj.asInstanceOf[FieldGroupConfigProperties]
  }
}

