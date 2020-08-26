package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportingWidgetDefaults extends Object {
  /**
    * An object containing properties specific for customizing the [FeatureForm](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureForm: js.UndefOr[SupportingWidgetDefaultsFeatureForm] = js.native
  /**
    * An object containing properties specific for customizing the [FeatureTemplates](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var featureTemplates: js.UndefOr[SupportingWidgetDefaultsFeatureTemplates] = js.native
  /**
    * An object containing properties specific for customizng the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var sketch: js.UndefOr[SupportingWidgetDefaultsSketch] = js.native
}

object SupportingWidgetDefaults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaults = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaults]
  }
  @scala.inline
  implicit class SupportingWidgetDefaultsOps[Self <: SupportingWidgetDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeatureForm(value: SupportingWidgetDefaultsFeatureForm): Self = this.set("featureForm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureForm: Self = this.set("featureForm", js.undefined)
    @scala.inline
    def setFeatureTemplates(value: SupportingWidgetDefaultsFeatureTemplates): Self = this.set("featureTemplates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureTemplates: Self = this.set("featureTemplates", js.undefined)
    @scala.inline
    def setSketch(value: SupportingWidgetDefaultsSketch): Self = this.set("sketch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSketch: Self = this.set("sketch", js.undefined)
  }
  
}

