package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectReverse
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * A value indicating whether the dynamic output of a previous geometric effect is to be flipped or not.
    */
  var reverse: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectReverse: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse = js.native
}
object CIMGeometricEffectReverse {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse): CIMGeometricEffectReverse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectReverse]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectReverseOps[Self <: CIMGeometricEffectReverse] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
  }
}
