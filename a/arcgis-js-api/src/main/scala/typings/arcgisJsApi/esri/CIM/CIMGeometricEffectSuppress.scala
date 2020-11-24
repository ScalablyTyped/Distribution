package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMGeometricEffectSuppress
  extends CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * A value indicating whether to invert the suppression process. If this value is true, portions of the stroke symbol between control points are kept and all other portions are suppressed.
    */
  var invert: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the portion of the stroke symbol between control points should be suppressed. Sections that are suppressed draw with no symbol.
    */
  var suppress: js.UndefOr[Boolean] = js.native
  
  @JSName("type")
  var type_CIMGeometricEffectSuppress: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectSuppress = js.native
}
object CIMGeometricEffectSuppress {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectSuppress): CIMGeometricEffectSuppress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMGeometricEffectSuppress]
  }
  
  @scala.inline
  implicit class CIMGeometricEffectSuppressOps[Self <: CIMGeometricEffectSuppress] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectSuppress): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setSuppress(value: Boolean): Self = this.set("suppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppress: Self = this.set("suppress", js.undefined)
  }
}
