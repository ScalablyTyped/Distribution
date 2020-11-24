package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnBoolean extends js.Object {
  
  @JSName("MSForms.ReturnBoolean_typekey")
  var MSFormsDotReturnBoolean_typekey: ReturnBoolean = js.native
  
  var Value: Boolean = js.native
}
object ReturnBoolean {
  
  @scala.inline
  def apply(MSFormsDotReturnBoolean_typekey: ReturnBoolean, Value: Boolean): ReturnBoolean = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ReturnBoolean_typekey")(MSFormsDotReturnBoolean_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnBoolean]
  }
  
  @scala.inline
  implicit class ReturnBooleanOps[Self <: ReturnBoolean] (val x: Self) extends AnyVal {
    
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
    def setMSFormsDotReturnBoolean_typekey(value: ReturnBoolean): Self = this.set("MSForms.ReturnBoolean_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
