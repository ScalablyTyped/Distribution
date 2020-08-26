package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorGetMatchingSchemesParams extends Object {
  /**
    * An array of colors used to match with schemes for the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var colors: js.Array[Color_] = js.native
  /**
    * The geometry type of the layer for which the color scheme will be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var geometryType: String = js.native
  /**
    * The name of the theme from which to get color schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var theme: `high-to-low` | `above-and-below` | `centered-on` | extremes = js.native
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.  This is required for 3D visualizations.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.native
  /**
    * Indicates whether 3D volumetric symbols will be used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.native
}

object colorGetMatchingSchemesParams {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    theme: `high-to-low` | `above-and-below` | `centered-on` | extremes
  ): colorGetMatchingSchemesParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetMatchingSchemesParams]
  }
  @scala.inline
  implicit class colorGetMatchingSchemesParamsOps[Self <: colorGetMatchingSchemesParams] (val x: Self) extends AnyVal {
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
    def setColorsVarargs(value: Color_ *): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color_]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeometryType(value: String): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: `high-to-low` | `above-and-below` | `centered-on` | extremes): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: SceneView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setWorldScale(value: Boolean): Self = this.set("worldScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorldScale: Self = this.set("worldScale", js.undefined)
  }
  
}

