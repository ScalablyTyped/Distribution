package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessObjectProperty extends js.Object {
  
  @JSName("Access.AccessObjectProperty_typekey")
  var AccessDotAccessObjectProperty_typekey: AccessObjectProperty = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  var Value: js.Any = js.native
  
  val _Value: js.Any = js.native
}
object AccessObjectProperty {
  
  @scala.inline
  def apply(
    AccessDotAccessObjectProperty_typekey: AccessObjectProperty,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): AccessObjectProperty = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.AccessObjectProperty_typekey")(AccessDotAccessObjectProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessObjectProperty]
  }
  
  @scala.inline
  implicit class AccessObjectPropertyOps[Self <: AccessObjectProperty] (val x: Self) extends AnyVal {
    
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
    def setAccessDotAccessObjectProperty_typekey(value: AccessObjectProperty): Self = this.set("Access.AccessObjectProperty_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_Value(value: js.Any): Self = this.set("_Value", value.asInstanceOf[js.Any])
  }
}
