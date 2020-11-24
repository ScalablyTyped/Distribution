package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMObjectMarker3D
  extends CIMMarker
     with CIMSymbolLayerType {
  
  /**
    * The array of levels of detail.
    */
  var LODs: js.UndefOr[js.Array[CIMObjectMarker3DLOD]] = js.native
  
  /**
    * The marker depth.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the model can be exported.
    */
  var isRestricted: js.UndefOr[Boolean] = js.native
  
  /**
    * The URI of the binary reference containing the "web resource".
    */
  var modelURI: js.UndefOr[String] = js.native
  
  /**
    * The representative image of the marker.
    */
  var thumbnail: js.UndefOr[String] = js.native
  
  /**
    * The color which defines the color that is applied to the marker.
    */
  var tintColor: js.UndefOr[js.Array[Double]] = js.native
  
  @JSName("type")
  var type_CIMObjectMarker3D: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D = js.native
  
  /**
    * A value indicating whether or not to ignore the marker anchor point and insert the model directly at the data point.
    */
  var useAnchorPoint: js.UndefOr[Boolean] = js.native
  
  /**
    * The marker width.
    */
  var width: js.UndefOr[Double] = js.native
}
object CIMObjectMarker3D {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D): CIMObjectMarker3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMObjectMarker3D]
  }
  
  @scala.inline
  implicit class CIMObjectMarker3DOps[Self <: CIMObjectMarker3D] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMObjectMarker3D): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLODsVarargs(value: CIMObjectMarker3DLOD*): Self = this.set("LODs", js.Array(value :_*))
    
    @scala.inline
    def setLODs(value: js.Array[CIMObjectMarker3DLOD]): Self = this.set("LODs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLODs: Self = this.set("LODs", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setIsRestricted(value: Boolean): Self = this.set("isRestricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRestricted: Self = this.set("isRestricted", js.undefined)
    
    @scala.inline
    def setModelURI(value: String): Self = this.set("modelURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelURI: Self = this.set("modelURI", js.undefined)
    
    @scala.inline
    def setThumbnail(value: String): Self = this.set("thumbnail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnail: Self = this.set("thumbnail", js.undefined)
    
    @scala.inline
    def setTintColorVarargs(value: Double*): Self = this.set("tintColor", js.Array(value :_*))
    
    @scala.inline
    def setTintColor(value: js.Array[Double]): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    
    @scala.inline
    def setUseAnchorPoint(value: Boolean): Self = this.set("useAnchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAnchorPoint: Self = this.set("useAnchorPoint", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
