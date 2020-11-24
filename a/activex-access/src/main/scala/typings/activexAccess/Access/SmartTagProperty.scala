package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartTagProperty extends js.Object {
  
  @JSName("Access.SmartTagProperty_typekey")
  var AccessDotSmartTagProperty_typekey: SmartTagProperty = js.native
  
  def Delete(): Unit = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var Name: String = js.native
  
  var Value: String = js.native
}
object SmartTagProperty {
  
  @scala.inline
  def apply(
    AccessDotSmartTagProperty_typekey: SmartTagProperty,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String
  ): SmartTagProperty = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SmartTagProperty_typekey")(AccessDotSmartTagProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartTagProperty]
  }
  
  @scala.inline
  implicit class SmartTagPropertyOps[Self <: SmartTagProperty] (val x: Self) extends AnyVal {
    
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
    def setAccessDotSmartTagProperty_typekey(value: SmartTagProperty): Self = this.set("Access.SmartTagProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
