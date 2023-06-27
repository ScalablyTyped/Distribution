package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TessellatedMesh extends StObject {
  
  /**
  		 * The indices of the triangles that connect vertices together; each consecutive triplet of indices denotes a triangle.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
  		 */
  var indices: js.Array[Double]
  
  /**
  		 * The vertices that make up the mesh.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#TessellatedMesh)
  		 */
  var vertices: js.Array[MeshVertex]
}
object TessellatedMesh {
  
  inline def apply(indices: js.Array[Double], vertices: js.Array[MeshVertex]): TessellatedMesh = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[TessellatedMesh]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TessellatedMesh] (val x: Self) extends AnyVal {
    
    inline def setIndices(value: js.Array[Double]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: Double*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setVertices(value: js.Array[MeshVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesVarargs(value: MeshVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
