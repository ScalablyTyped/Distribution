package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCreateSphereParamsMaterial extends Object {
  /**
    * The material color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#createSphere)
    */
  var color: js.UndefOr[
    ValueMeshColor | ImageMeshColor | String | HTMLImageElement | HTMLCanvasElement | js.Array[Double]
  ] = js.undefined
}

object MeshCreateSphereParamsMaterial {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    color: ValueMeshColor | ImageMeshColor | String | HTMLImageElement | HTMLCanvasElement | js.Array[Double] = null
  ): MeshCreateSphereParamsMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCreateSphereParamsMaterial]
  }
}

