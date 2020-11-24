package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectJog
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The angle of the jog in the line which is measured in degrees.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The length of the segment that forms the jog in the line.
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * The location of the center of the jog, as a percentage measured from the start of the input geometry.
    */
  var position: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectJog: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog = js.native
}
object CIMGeometricEffectJog {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog): CIMGeometricEffectJog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectJog]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectJogOps[Self <: CIMGeometricEffectJog] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectJog): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
