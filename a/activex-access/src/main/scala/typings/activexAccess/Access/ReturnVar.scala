package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnVar extends js.Object {
  @JSName("Access.ReturnVar_typekey")
  var AccessDotReturnVar_typekey: ReturnVar = js.native
  val Name: String = js.native
  val Value: String | Double = js.native
  val _Value: String | Double = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object ReturnVar {
  @scala.inline
  def apply(
    AccessDotReturnVar_typekey: ReturnVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: String | Double,
    _Value: String | Double
  ): ReturnVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.ReturnVar_typekey")(AccessDotReturnVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnVar]
  }
  @scala.inline
  implicit class ReturnVarOps[Self <: ReturnVar] (val x: Self) extends AnyVal {
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
    def setAccessDotReturnVar_typekey(value: ReturnVar): Self = this.set("Access.ReturnVar_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String | Double): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Value(value: String | Double): Self = this.set("_Value", value.asInstanceOf[js.Any])
  }
  
}

