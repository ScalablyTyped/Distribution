package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateFromPolygonParams
  extends stdLib.Object {
  /**
    * The material to be used for the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createFromPolygon)
    */
  var material: js.UndefOr[MeshCreateFromPolygonParamsMaterial] = js.undefined
}

object MeshCreateFromPolygonParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    material: MeshCreateFromPolygonParamsMaterial = null
  ): MeshCreateFromPolygonParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[MeshCreateFromPolygonParams]
  }
}

