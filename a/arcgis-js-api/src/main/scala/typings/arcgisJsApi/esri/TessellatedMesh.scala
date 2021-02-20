package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TessellatedMesh extends Object {
  
  /**
    * The indices of the triangles that connect vertices together; each consecutive triplet of indices denotes a triangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var indices: js.Array[Double] = js.native
  
  /**
    * The vertices that make up the mesh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
    */
  var vertices: js.Array[MeshVertex] = js.native
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
  
  @scala.inline
  implicit class TessellatedMeshMutableBuilder[Self <: TessellatedMesh] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[MeshVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: MeshVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
