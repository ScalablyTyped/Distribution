package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewHighlightOptions extends AnonymousAccessor {
  /**
    * The color of the highlight fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color_] = js.undefined
  /**
    * The opacity of the fill (area within the halo). This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 0.25
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The color of the halo surrounding the highlight. If no `haloColor` is provided, then the halo will be colored with the specified `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with any opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
}

object MapViewHighlightOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color_ = null,
    fillOpacity: js.UndefOr[Double] = js.undefined,
    get: /* propertyName */ String => _ = null,
    haloColor: Color_ = null,
    haloOpacity: js.UndefOr[Double] = js.undefined,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, MapViewHighlightOptions]) with (js.Function1[/* props */ HashMap[_], MapViewHighlightOptions]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): MapViewHighlightOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor.asInstanceOf[js.Any])
    if (!js.isUndefined(haloOpacity)) __obj.updateDynamic("haloOpacity")(haloOpacity.get.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[MapViewHighlightOptions]
  }
}

