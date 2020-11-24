package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMScaleDependentSizeVariation extends js.Object {
  
  /**
    * The scale the size is associated with.
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The size for the associated scale.
    */
  var size: js.UndefOr[Double] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation = js.native
}
object CIMScaleDependentSizeVariation {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation): CIMScaleDependentSizeVariation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMScaleDependentSizeVariation]
  }
  
  @scala.inline
  implicit class CIMScaleDependentSizeVariationOps[Self <: CIMScaleDependentSizeVariation] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMScaleDependentSizeVariation): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
