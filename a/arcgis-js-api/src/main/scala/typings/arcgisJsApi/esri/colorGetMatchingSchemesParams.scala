package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorGetMatchingSchemesParams extends Object {
  /**
    * An array of colors used to match with schemes for the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var colors: js.Array[Color_]
  /**
    * The geometry type of the layer for which the color scheme will be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var geometryType: String
  /**
    * The name of the theme from which to get color schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var theme: String
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.  This is required for 3D visualizations.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates whether 3D volumetric symbols will be used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object colorGetMatchingSchemesParams {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    theme: String,
    view: SceneView = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): colorGetMatchingSchemesParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), theme = theme.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetMatchingSchemesParams]
  }
}

