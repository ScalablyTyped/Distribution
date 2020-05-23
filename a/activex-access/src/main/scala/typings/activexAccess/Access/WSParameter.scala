package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WSParameter extends js.Object {
  @JSName("Access.WSParameter_typekey")
  var AccessDotWSParameter_typekey: WSParameter
  val Name: String
  val Parent: js.Any
  val Type: Double
  def IsMemberSafe(dispid: Double): Boolean
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
}

