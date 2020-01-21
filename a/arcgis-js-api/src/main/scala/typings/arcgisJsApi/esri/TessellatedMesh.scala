package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TessellatedMesh extends Object {
  /**
    * The indices of the triangles that connect vertices together; each consecutive triplet of indices denotes a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var indices: js.Array[Double]
  /**
    * The vertices that make up the mesh. Each element is a module:esri/views/2d/layers/BaseLayerViewGL2D#MeshVertex.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var vertices: js.Array[MeshVertex]
}

object TessellatedMesh {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    indices: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    vertices: js.Array[MeshVertex]
  ): TessellatedMesh = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), indices = indices.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TessellatedMesh]
  }
}

