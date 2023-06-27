package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexAttributes extends StObject {
  
  /**
  		 * The normal buffer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
  		 */
  var normal: js.UndefOr[js.typedarray.Float32Array] = js.undefined
  
  /**
  		 * The position buffer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
  		 */
  var position: js.typedarray.Float64Array
  
  /**
  		 * The tangent buffer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#VertexAttributes)
  		 */
  var tangent: js.UndefOr[js.typedarray.Float32Array] = js.undefined
}
object VertexAttributes {
  
  inline def apply(position: js.typedarray.Float64Array): VertexAttributes = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexAttributes] (val x: Self) extends AnyVal {
    
    inline def setNormal(value: js.typedarray.Float32Array): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "normal", js.undefined)
    
    inline def setPosition(value: js.typedarray.Float64Array): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTangent(value: js.typedarray.Float32Array): Self = StObject.set(x, "tangent", value.asInstanceOf[js.Any])
    
    inline def setTangentUndefined: Self = StObject.set(x, "tangent", js.undefined)
  }
}
