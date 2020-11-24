package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalConstructedValueBlockParams extends LocalBaseBlockParams {
  
  var isIndefiniteForm: js.UndefOr[scala.Boolean] = js.native
  
  var value: js.UndefOr[LocalValueBlock] = js.native
}
object LocalConstructedValueBlockParams {
  
  @scala.inline
  def apply(): LocalConstructedValueBlockParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalConstructedValueBlockParams]
  }
  
  @scala.inline
  implicit class LocalConstructedValueBlockParamsOps[Self <: LocalConstructedValueBlockParams] (val x: Self) extends AnyVal {
    
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
    def setIsIndefiniteForm(value: scala.Boolean): Self = this.set("isIndefiniteForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIndefiniteForm: Self = this.set("isIndefiniteForm", js.undefined)
    
    @scala.inline
    def setValue(value: LocalValueBlock): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
