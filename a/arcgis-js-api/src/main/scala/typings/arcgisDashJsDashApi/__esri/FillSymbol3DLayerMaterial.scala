package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillSymbol3DLayerMaterial extends AnonymousAccessor {
  /**
    * The color of the fill. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color] = js.undefined
  /**
    * Specifies how the material `color` is applied to the geometry color/texture information. This property applies only to [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbols.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the material `color` to the desaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the material `color`.
    * multiply | Multiplies geometry/texture color value with the material `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    *
    * @default multiply
    */
  var colorMixMode: js.UndefOr[String] = js.undefined
}

object FillSymbol3DLayerMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color = null,
    colorMixMode: String = null,
    get: /* propertyName */ String => _ = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, FillSymbol3DLayerMaterial]) with (js.Function1[/* props */ HashMap[_], FillSymbol3DLayerMaterial]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): FillSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color)
    if (colorMixMode != null) __obj.updateDynamic("colorMixMode")(colorMixMode)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[FillSymbol3DLayerMaterial]
  }
}

