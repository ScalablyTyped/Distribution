package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.local
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MeshLocalVertexSpaceProperties & {  type :'local'} */
trait MeshLocalVertexSpacePrope extends StObject {
  
  /**
  		 * Origin of the vertex space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshLocalVertexSpace.html#origin)
  		 */
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `type`: local
}
object MeshLocalVertexSpacePrope {
  
  inline def apply(): MeshLocalVertexSpacePrope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("local")
    __obj.asInstanceOf[MeshLocalVertexSpacePrope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeshLocalVertexSpacePrope] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: js.Array[Double]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setType(value: local): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
