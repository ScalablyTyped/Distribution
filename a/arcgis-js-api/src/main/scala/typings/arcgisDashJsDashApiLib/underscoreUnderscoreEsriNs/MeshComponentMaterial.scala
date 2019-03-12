package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshComponentMaterial extends AnonymousAccessor {
  /**
    * the material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var color: ValueMeshColor | ImageMeshColor
}

object MeshComponentMaterial {
  @scala.inline
  def apply(
    color: ValueMeshColor | ImageMeshColor,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    get: /* propertyName */ java.lang.String => _ = null,
    set: (js.Function2[/* propertyName */ java.lang.String, /* value */ js.Any, MeshComponentMaterial]) with (js.Function1[/* props */ arcgisDashJsDashApiLib.HashMap[_], MeshComponentMaterial]) = null,
    watch: (/* path */ java.lang.String | js.Array[java.lang.String], /* callback */ WatchCallback, /* sync */ js.UndefOr[scala.Boolean]) => WatchHandle = null
  ): MeshComponentMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(set)
    if (watch != null) __obj.updateDynamic("watch")(js.Any.fromFunction3(watch))
    __obj.asInstanceOf[MeshComponentMaterial]
  }
}

