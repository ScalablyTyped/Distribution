package typings.asn1js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsIndefiniteForm extends js.Object {
  
  var isIndefiniteForm: js.UndefOr[Boolean] = js.native
  
  var length: Double = js.native
  
  var longFormUsed: js.UndefOr[Boolean] = js.native
}
object IsIndefiniteForm {
  
  @scala.inline
  def apply(length: Double): IsIndefiniteForm = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIndefiniteForm]
  }
  
  @scala.inline
  implicit class IsIndefiniteFormOps[Self <: IsIndefiniteForm] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIndefiniteForm(value: Boolean): Self = this.set("isIndefiniteForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsIndefiniteForm: Self = this.set("isIndefiniteForm", js.undefined)
    
    @scala.inline
    def setLongFormUsed(value: Boolean): Self = this.set("longFormUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongFormUsed: Self = this.set("longFormUsed", js.undefined)
  }
}
