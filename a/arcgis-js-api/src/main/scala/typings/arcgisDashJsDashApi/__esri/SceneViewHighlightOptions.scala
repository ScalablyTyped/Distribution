package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHighlightOptions extends AnonymousAccessor {
  /**
    * The color of the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default #00ffff
    */
  var color: js.UndefOr[Color] = js.undefined
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
  var haloColor: js.UndefOr[Color] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
}

object SceneViewHighlightOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color = null,
    fillOpacity: Int | Double = null,
    get: /* propertyName */ String => _ = null,
    haloColor: Color = null,
    haloOpacity: Int | Double = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, SceneViewHighlightOptions]) with (js.Function1[/* props */ HashMap[_], SceneViewHighlightOptions]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): SceneViewHighlightOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (haloColor != null) __obj.updateDynamic("haloColor")(haloColor)
    if (haloOpacity != null) __obj.updateDynamic("haloOpacity")(haloOpacity.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[SceneViewHighlightOptions]
  }
}

