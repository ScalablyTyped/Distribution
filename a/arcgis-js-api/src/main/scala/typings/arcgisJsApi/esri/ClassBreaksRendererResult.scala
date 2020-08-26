package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreaksRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var basemapId: String = js.native
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var basemapTheme: String = js.native
  /**
    * This object describes class breaks generated from data in a layer for a given field with a specified classification method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var classBreaksResult: ClassBreaksResult = js.native
  /**
    * The color scheme used for the class breaks.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var colorScheme: ColorScheme = js.native
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var defaultValuesUsed: Boolean = js.native
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#ClassBreaksRendererResult)
    */
  var renderer: ClassBreaksRenderer = js.native
}

object ClassBreaksRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    classBreaksResult: ClassBreaksResult,
    colorScheme: ColorScheme,
    constructor: js.Function,
    defaultValuesUsed: Boolean,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: ClassBreaksRenderer
  ): ClassBreaksRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], classBreaksResult = classBreaksResult.asInstanceOf[js.Any], colorScheme = colorScheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], defaultValuesUsed = defaultValuesUsed.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreaksRendererResult]
  }
  @scala.inline
  implicit class ClassBreaksRendererResultOps[Self <: ClassBreaksRendererResult] (val x: Self) extends AnyVal {
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
    def setBasemapId(value: String): Self = this.set("basemapId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemapTheme(value: String): Self = this.set("basemapTheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassBreaksResult(value: ClassBreaksResult): Self = this.set("classBreaksResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValuesUsed(value: Boolean): Self = this.set("defaultValuesUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: ClassBreaksRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
  }
  
}

