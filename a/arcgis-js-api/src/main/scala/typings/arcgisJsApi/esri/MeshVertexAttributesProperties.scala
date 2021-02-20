package typings.arcgisJsApi.esri

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Uint8Array
import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshVertexAttributesProperties extends Object {
  
  /**
    * **Since: 4.9**    A flat array of the vertex colors (4 elements per vertex ranging from 0 to 255).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var color: js.UndefOr[Uint8Array | js.Array[Double] | Uint8ClampedArray] = js.native
  
  /**
    * A flat array of the vertex normals (3 elements per vertex ranging from -1 to 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var normal: js.UndefOr[Float32Array | js.Array[Double] | Float64Array] = js.native
  
  /**
    * A flat array of vertex positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var position: js.UndefOr[Float64Array | js.Array[Double] | Float32Array] = js.native
  
  /**
    * **Since: 4.11**    A flat array of the vertex tangents (4 elements per vertex ranging from -1 to 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var tangent: js.UndefOr[Float32Array | js.Array[Double] | Float64Array] = js.native
  
  /**
    * A flat array of vertex uv coordinates (2 elements per vertex).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Mesh.html#vertexAttributes)
    */
  var uv: js.UndefOr[Float32Array | js.Array[Double] | Float64Array] = js.native
}
object MeshVertexAttributesProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MeshVertexAttributesProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MeshVertexAttributesProperties]
  }
  
  @scala.inline
  implicit class MeshVertexAttributesPropertiesMutableBuilder[Self <: MeshVertexAttributesProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Uint8Array | js.Array[Double] | Uint8ClampedArray): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    @scala.inline
    def setNormal(value: Float32Array | js.Array[Double] | Float64Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    @scala.inline
    def setNormalVarargs(value: Double*): Self = StObject.set(x, "normal", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: Float64Array | js.Array[Double] | Float32Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: Double*): Self = StObject.set(x, "position", js.Array(value :_*))
    
    @scala.inline
    def setTangent(value: Float32Array | js.Array[Double] | Float64Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
    
    @scala.inline
    def setTangentVarargs(value: Double*): Self = StObject.set(x, "tangent", js.Array(value :_*))
    
    @scala.inline
    def setUv(value: Float32Array | js.Array[Double] | Float64Array): Self = StObject.set(x, "uv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvUndefined: Self = StObject.set(x, "uv", js.undefined)
    
    @scala.inline
    def setUvVarargs(value: Double*): Self = StObject.set(x, "uv", js.Array(value :_*))
  }
}
