package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbol3DLayerOutline extends AnonymousAccessor {
  /**
    * The color of the outline. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var color: Color
  /**
    * The width of the outline in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var size: scala.Double
}

object FillSymbol3DLayerOutline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    size: scala.Double,
    get: /* propertyName */ java.lang.String => _ = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, FillSymbol3DLayerOutline]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], FillSymbol3DLayerOutline]) = null,
    watch: (/* path */ java.lang.String | js.Array[java.lang.String], /* callback */ WatchCallback, /* sync */ js.UndefOr[scala.Boolean]) => WatchHandle = null
  ): FillSymbol3DLayerOutline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[FillSymbol3DLayerOutline]
  }
}

