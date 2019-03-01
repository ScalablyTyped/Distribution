package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The opacity of the highlight halo. This will be multiplied with the opacity specified in `color`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    *
    * @default 1
    */
  var haloOpacity: js.UndefOr[scala.Double] = js.undefined
}

object SceneViewHighlightOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: Color = null,
    fillOpacity: scala.Int | scala.Double = null,
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    haloOpacity: scala.Int | scala.Double = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, SceneViewHighlightOptions]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], SceneViewHighlightOptions]) = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): SceneViewHighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (get != null) __obj.updateDynamic("get")(get)
    if (haloOpacity != null) __obj.updateDynamic("haloOpacity")(haloOpacity.asInstanceOf[js.Any])
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[SceneViewHighlightOptions]
  }
}

