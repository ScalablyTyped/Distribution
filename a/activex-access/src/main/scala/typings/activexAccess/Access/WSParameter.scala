package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WSParameter extends js.Object {
  @JSName("Access.WSParameter_typekey")
  var AccessDotWSParameter_typekey: WSParameter = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  val Type: Double = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object WSParameter {
  @scala.inline
  def apply(
    AccessDotWSParameter_typekey: WSParameter,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any,
    Type: Double
  ): WSParameter = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WSParameter_typekey")(AccessDotWSParameter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WSParameter]
  }
  @scala.inline
  implicit class WSParameterOps[Self <: WSParameter] (val x: Self) extends AnyVal {
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
    def setAccessDotWSParameter_typekey(value: WSParameter): Self = this.set("Access.WSParameter_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

