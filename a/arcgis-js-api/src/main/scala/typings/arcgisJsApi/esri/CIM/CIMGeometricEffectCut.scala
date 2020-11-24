package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectCut
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance from the beginning of a line that the display of the stroke starts. The beginning of the line is determined by the direction in which the line was digitized.
    */
  var beginCut: js.UndefOr[Double] = js.native
  
  /**
    * The distance from the end of a line that the display of the stroke ends. The end of the line is determined by the direction in which the line was digitized.
    */
  var endCut: js.UndefOr[Double] = js.native
  
  /**
    * A value indicating whether the effect should be applied in the opposite manner. This displays the stroke symbol only at the ends of the line and leaves the rest of the line unsymbolized.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * The distance around the middle of a line that the display of the stroke is interrupted.
    */
  var middleCut: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectCut: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut = js.native
}
object CIMGeometricEffectCut {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut): CIMGeometricEffectCut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectCut]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectCutOps[Self <: CIMGeometricEffectCut] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectCut): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginCut(value: Double): Self = this.set("beginCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginCut: Self = this.set("beginCut", js.undefined)
    
    @scala.inline
    def setEndCut(value: Double): Self = this.set("endCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndCut: Self = this.set("endCut", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setMiddleCut(value: Double): Self = this.set("middleCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleCut: Self = this.set("middleCut", js.undefined)
  }
}
