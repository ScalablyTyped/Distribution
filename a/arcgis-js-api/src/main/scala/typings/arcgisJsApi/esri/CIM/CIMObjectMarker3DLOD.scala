package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMObjectMarker3DLOD extends StObject {
  
  /**
  			 * The total number of triangles in the geometry of this level of detail.
  			 */
  var faceCount: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The URI of the binary reference containing the "web resource" for this level of detail.
  			 */
  var modelURI: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD
}
object CIMObjectMarker3DLOD {
  
  inline def apply(): CIMObjectMarker3DLOD = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMObjectMarker3DLOD")
    __obj.asInstanceOf[CIMObjectMarker3DLOD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMObjectMarker3DLOD] (val x: Self) extends AnyVal {
    
    inline def setFaceCount(value: Double): Self = StObject.set(x, "faceCount", value.asInstanceOf[js.Any])
    
    inline def setFaceCountUndefined: Self = StObject.set(x, "faceCount", js.undefined)
    
    inline def setModelURI(value: String): Self = StObject.set(x, "modelURI", value.asInstanceOf[js.Any])
    
    inline def setModelURIUndefined: Self = StObject.set(x, "modelURI", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
