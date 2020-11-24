package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMColorSubstitution extends js.Object {
  
  /**
    * The new color that will replace the old color.
    */
  var newColor: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The old color (the color that will be substituted).
    */
  var oldColor: js.UndefOr[js.Array[Double]] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMColorSubstitution = js.native
}
object CIMColorSubstitution {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMColorSubstitution): CIMColorSubstitution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMColorSubstitution]
  }
  
  @scala.inline
  implicit class CIMColorSubstitutionOps[Self <: CIMColorSubstitution] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMColorSubstitution): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewColorVarargs(value: Double*): Self = this.set("newColor", js.Array(value :_*))
    
    @scala.inline
    def setNewColor(value: js.Array[Double]): Self = this.set("newColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewColor: Self = this.set("newColor", js.undefined)
    
    @scala.inline
    def setOldColorVarargs(value: Double*): Self = this.set("oldColor", js.Array(value :_*))
    
    @scala.inline
    def setOldColor(value: js.Array[Double]): Self = this.set("oldColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldColor: Self = this.set("oldColor", js.undefined)
  }
}
