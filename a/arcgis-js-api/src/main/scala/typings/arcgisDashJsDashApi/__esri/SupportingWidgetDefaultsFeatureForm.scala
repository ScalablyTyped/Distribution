package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsFeatureForm extends Object {
  /**
    * An array of [FieldConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html) objects to use within the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html).
    * > Any [field configurations](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html) set within the [layerInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos) property will be overridden if it is set here in the [supportingWidgetDefaults](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.undefined
  /**
    * String indicating the [groupDisplay](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html#groupDisplay) and how they will be displayed to the end user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupDisplay: js.UndefOr[String] = js.undefined
}

object SupportingWidgetDefaultsFeatureForm {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    fieldConfig: js.Array[FieldConfig] = null,
    groupDisplay: String = null
  ): SupportingWidgetDefaultsFeatureForm = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (fieldConfig != null) __obj.updateDynamic("fieldConfig")(fieldConfig)
    if (groupDisplay != null) __obj.updateDynamic("groupDisplay")(groupDisplay)
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureForm]
  }
}

