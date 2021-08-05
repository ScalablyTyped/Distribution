package typings.arcgisJsApi.esri

import typings.std.Float32Array
import typings.std.Float64Array
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAttributes
  extends StObject
     with Object {
  
  /**
    * The normal buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var normal: js.UndefOr[Float32Array] = js.undefined
  
  /**
    * The position buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var position: Float64Array
  
  /**
    * The tangent buffer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
    */
  var tangent: js.UndefOr[Float32Array] = js.undefined
}
object VertexAttributes {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    position: Float64Array,
    propertyIsEnumerable: PropertyKey => Boolean
  ): VertexAttributes = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), position = position.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[VertexAttributes]
  }
  
  extension [Self <: VertexAttributes](x: Self) {
    
    inline def setNormal(value: Float32Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setPosition(value: Float64Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTangent(value: Float32Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    inline def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
  }
}
