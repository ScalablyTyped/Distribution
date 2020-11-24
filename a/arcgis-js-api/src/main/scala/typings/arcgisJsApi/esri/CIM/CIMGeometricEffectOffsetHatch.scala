package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectOffsetHatch
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The length of the offset hatch.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The spacing of the offset hatch.
    */
  var spacing: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetHatch: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch = js.native
}
object CIMGeometricEffectOffsetHatch {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch): CIMGeometricEffectOffsetHatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectOffsetHatch]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectOffsetHatchOps[Self <: CIMGeometricEffectOffsetHatch] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetHatch): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
  }
}
