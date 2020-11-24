package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectMove
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance to move the symbol along the X-axis of the feature geometry.
    */
  var offsetX: js.UndefOr[Double] = js.native
  
  /**
    * The distance to move the symbol along the Y-axis of the feature geometry.
    */
  var offsetY: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectMove: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove = js.native
}
object CIMGeometricEffectMove {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove): CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectMove]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectMoveOps[Self <: CIMGeometricEffectMove] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetX: Self = this.set("offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetY: Self = this.set("offsetY", js.undefined)
  }
}
