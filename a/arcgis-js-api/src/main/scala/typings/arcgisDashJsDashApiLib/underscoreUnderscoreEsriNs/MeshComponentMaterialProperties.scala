package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshComponentMaterialProperties
  extends stdLib.Object {
  /**
    * the material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshComponent.html#material)
    */
  var color: js.UndefOr[ValueMeshColorProperties | ImageMeshColorProperties] = js.undefined
}

object MeshComponentMaterialProperties {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    color: ValueMeshColorProperties | ImageMeshColorProperties = null
  ): MeshComponentMaterialProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshComponentMaterialProperties]
  }
}

