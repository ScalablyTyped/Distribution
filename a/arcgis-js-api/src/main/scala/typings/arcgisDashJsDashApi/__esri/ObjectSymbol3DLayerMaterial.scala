package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.HashMap
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSymbol3DLayerMaterial extends AnonymousAccessor {
  /**
    * The fill color of the object. If the object has textures, the textures will be multiplied with the color. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    *
    * @default white
    */
  var color: js.UndefOr[Color] = js.undefined
}

object ObjectSymbol3DLayerMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: Color = null,
    get: /* propertyName */ String => _ = null,
    set: (js.Function2[/* propertyName */ String, /* value */ js.Any, ObjectSymbol3DLayerMaterial]) with (js.Function1[/* props */ HashMap[_], ObjectSymbol3DLayerMaterial]) = null,
    watch: (/* path */ String | js.Array[String], /* callback */ WatchCallback, /* sync */ js.UndefOr[Boolean]) => WatchHandle = null
  ): ObjectSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[ObjectSymbol3DLayerMaterial]
  }
}

