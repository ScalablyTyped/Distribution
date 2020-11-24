package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectAddControlPoints
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The value below which a control point will be placed. The maximum amount of deflection from one segment to another at a vertex. Angle values between 180 and 360 are interpreted the same as values between 0 and 180. Angle values of 180 and 360 are the same as 0.
    */
  var angleTolerance: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectAddControlPoints: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectAddControlPoints = js.native
}
object CIMGeometricEffectAddControlPoints {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectAddControlPoints): CIMGeometricEffectAddControlPoints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectAddControlPoints]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectAddControlPointsOps[Self <: CIMGeometricEffectAddControlPoints] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectAddControlPoints): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleTolerance(value: Double): Self = this.set("angleTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngleTolerance: Self = this.set("angleTolerance", js.undefined)
  }
}
