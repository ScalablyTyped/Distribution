package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaults extends Object {
  /**
    * An object containing properties specific for customizing the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureForm: js.UndefOr[SupportingWidgetDefaultsFeatureForm] = js.undefined
  /**
    * An object containing properties specific for customizing the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureTemplates: js.UndefOr[SupportingWidgetDefaultsFeatureTemplates] = js.undefined
  /**
    * An object containing properties specific for customizng the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var sketch: js.UndefOr[SupportingWidgetDefaultsSketch] = js.undefined
}

object SupportingWidgetDefaults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    featureForm: SupportingWidgetDefaultsFeatureForm = null,
    featureTemplates: SupportingWidgetDefaultsFeatureTemplates = null,
    sketch: SupportingWidgetDefaultsSketch = null
  ): SupportingWidgetDefaults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (featureForm != null) __obj.updateDynamic("featureForm")(featureForm)
    if (featureTemplates != null) __obj.updateDynamic("featureTemplates")(featureTemplates)
    if (sketch != null) __obj.updateDynamic("sketch")(sketch)
    __obj.asInstanceOf[SupportingWidgetDefaults]
  }
}

