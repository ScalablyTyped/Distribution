package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateCylinderParamsMaterial
  extends stdLib.Object {
  /**
    * The material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var color: ValueMeshColor | ImageMeshColor | java.lang.String | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | js.Array[scala.Double]
}

object MeshCreateCylinderParamsMaterial {
  @scala.inline
  def apply(
    color: ValueMeshColor | ImageMeshColor | java.lang.String | stdLib.HTMLImageElement | stdLib.HTMLCanvasElement | js.Array[scala.Double],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): MeshCreateCylinderParamsMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[MeshCreateCylinderParamsMaterial]
  }
}

