package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshVertexAttributesProperties extends StObject {
  
  /**
  		 * **Since: 4.9**	 A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var color: js.UndefOr[js.typedarray.Uint8Array | js.Array[Double] | js.typedarray.Uint8ClampedArray] = js.undefined
  
  /**
  		 * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var normal: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.undefined
  
  /**
  		 * A flat array of vertex positions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var position: js.UndefOr[js.typedarray.Float64Array | js.Array[Double] | js.typedarray.Float32Array] = js.undefined
  
  /**
  		 * **Since: 4.11**	A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var tangent: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.undefined
  
  /**
  		 * A flat array of vertex uv coordinates (2 elements per vertex).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
  		 */
  var uv: js.UndefOr[js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array] = js.undefined
}
object MeshVertexAttributesProperties {
  
  inline def apply(): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshVertexAttributesProperties] (val x: Self) extends AnyVal {
    
    inline def setColor(value: js.typedarray.Uint8Array | js.Array[Double] | js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setNormal(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setNormalVarargs(value: Double*): Self = StObject.set(x, "normal", js.Array(value*))
    
    inline def setPosition(value: js.typedarray.Float64Array | js.Array[Double] | js.typedarray.Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value*))
    
    inline def setTangent(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    inline def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
    
    inline def setTangentVarargs(value: Double*): Self = StObject.set(x, "tangent", js.Array(value*))
    
    inline def setUv(value: js.typedarray.Float32Array | js.Array[Double] | js.typedarray.Float64Array): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    inline def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
    
    inline def setUvVarargs(value: Double*): Self = StObject.set(x, "uv", js.Array(value*))
  }
}
