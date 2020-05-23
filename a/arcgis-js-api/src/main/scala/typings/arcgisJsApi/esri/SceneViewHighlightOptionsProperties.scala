package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHighlightOptionsProperties extends Object {
  /**
    * The color of the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * The opacity of the fill (area within the halo). This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 0.25
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * An optional color for the halo of the highlight. If unset, the `color` will be used for the halo.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
}

object SceneViewHighlightOptionsProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color_ | js.Array[Double] | String = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    haloColor: Color_ = null,
    haloOpacity: js.UndefOr[Double] = js.undefined
  ): SceneViewHighlightOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (!js.isUndefined(haloOpacity)) __obj.updateDynamic("haloOpacity")(haloOpacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHighlightOptionsProperties]
  }
}

