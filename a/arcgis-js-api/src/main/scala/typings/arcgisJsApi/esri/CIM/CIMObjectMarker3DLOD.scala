package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMObjectMarker3DLOD extends StObject {
  
  /**
    * The total number of triangles in the geometry of this level of detail.
    */
  var faceCount: js.UndefOr[Double] = js.native
  
  /**
    * The URI of the binary reference containing the "web resource" for this level of detail.
    */
  var modelURI: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD = js.native
}
object CIMObjectMarker3DLOD {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD): CIMObjectMarker3DLOD = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMObjectMarker3DLOD]
  }
  
  @scala.inline
  implicit class CIMObjectMarker3DLODMutableBuilder[Self <: CIMObjectMarker3DLOD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFaceCount(value: Double): Self = StObject.set(x, "faceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceCountUndefined: Self = StObject.set(x, "faceCount", js.undefined)
    
    @scala.inline
    def setModelURI(value: String): Self = StObject.set(x, "modelURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelURIUndefined: Self = StObject.set(x, "modelURI", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
