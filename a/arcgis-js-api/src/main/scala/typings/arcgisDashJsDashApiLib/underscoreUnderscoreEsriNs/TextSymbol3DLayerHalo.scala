package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextSymbol3DLayerHalo extends AnonymousAccessor {
  /**
    * The color of the halo. This can be autocast with a named string, hex string, array of rgb or rgba values, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    *
    * @default black
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * The size of the halo in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#halo)
    *
    * @default 0
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object TextSymbol3DLayerHalo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: Color = null,
    get: js.Function1[/* propertyName */ java.lang.String, _] = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, TextSymbol3DLayerHalo]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], TextSymbol3DLayerHalo]) = null,
    size: scala.Int | scala.Double = null,
    watch: js.Function3[
      /* path */ java.lang.String | js.Array[java.lang.String], 
      /* callback */ WatchCallback, 
      /* sync */ js.UndefOr[scala.Boolean], 
      WatchHandle
    ] = null
  ): TextSymbol3DLayerHalo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (get != null) __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch)
    __obj.asInstanceOf[TextSymbol3DLayerHalo]
  }
}

