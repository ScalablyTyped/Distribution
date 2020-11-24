package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessField extends js.Object {
  
  @JSName("Access.AccessField_typekey")
  var AccessDotAccessField_typekey: AccessField = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Value: js.Any = js.native
}
object AccessField {
  
  @scala.inline
  def apply(AccessDotAccessField_typekey: AccessField, IsMemberSafe: Double => Boolean, Value: js.Any): AccessField = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessField_typekey")(AccessDotAccessField_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessField]
  }
  
  @scala.inline
  implicit class AccessFieldOps[Self <: AccessField] (val x: Self) extends AnyVal {
    
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
    def setAccessDotAccessField_typekey(value: AccessField): Self = this.set("Access.AccessField_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
