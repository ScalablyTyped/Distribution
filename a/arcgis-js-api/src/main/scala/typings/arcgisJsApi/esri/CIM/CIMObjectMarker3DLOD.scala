package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMObjectMarker3DLOD extends js.Object {
  
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
  implicit class CIMObjectMarker3DLODOps[Self <: CIMObjectMarker3DLOD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3DLOD): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceCount(value: Double): Self = this.set("faceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceCount: Self = this.set("faceCount", js.undefined)
    
    @scala.inline
    def setModelURI(value: String): Self = this.set("modelURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelURI: Self = this.set("modelURI", js.undefined)
  }
}
