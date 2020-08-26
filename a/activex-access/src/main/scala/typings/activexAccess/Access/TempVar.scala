package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempVar extends js.Object {
  @JSName("Access.TempVar_typekey")
  var AccessDotTempVar_typekey: TempVar = js.native
  val Name: String = js.native
  var Value: Double | String | Boolean = js.native
  var _Value: Double | String | Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object TempVar {
  @scala.inline
  def apply(
    AccessDotTempVar_typekey: TempVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Double | String | Boolean,
    _Value: Double | String | Boolean
  ): TempVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.TempVar_typekey")(AccessDotTempVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempVar]
  }
  @scala.inline
  implicit class TempVarOps[Self <: TempVar] (val x: Self) extends AnyVal {
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
    def setAccessDotTempVar_typekey(value: TempVar): Self = this.set("Access.TempVar_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double | String | Boolean): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Value(value: Double | String | Boolean): Self = this.set("_Value", value.asInstanceOf[js.Any])
  }
  
}

