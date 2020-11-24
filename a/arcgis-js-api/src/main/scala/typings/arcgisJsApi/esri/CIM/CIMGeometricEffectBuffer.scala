package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectBuffer
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance from the feature. This distance is either from the edge of the marker, the edge of the stroke or the edge of the polygon outline.
    */
  var size: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectBuffer: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer = js.native
}
object CIMGeometricEffectBuffer {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectBuffer]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectBufferOps[Self <: CIMGeometricEffectBuffer] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
