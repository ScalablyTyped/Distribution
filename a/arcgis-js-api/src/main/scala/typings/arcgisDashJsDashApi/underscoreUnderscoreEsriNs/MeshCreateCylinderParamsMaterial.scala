package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateCylinderParamsMaterial extends Object {
  /**
    * The material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createCylinder)
    */
  var color: ValueMeshColor | ImageMeshColor | String | HTMLImageElement | HTMLCanvasElement | js.Array[Double]
}

object MeshCreateCylinderParamsMaterial {
  @scala.inline
  def apply(
    color: ValueMeshColor | ImageMeshColor | String | HTMLImageElement | HTMLCanvasElement | js.Array[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshCreateCylinderParamsMaterial = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[MeshCreateCylinderParamsMaterial]
  }
}

