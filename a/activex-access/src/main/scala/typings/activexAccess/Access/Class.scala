package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  @JSName("Access.Class_typekey")
  var AccessDotClass_typekey: Class
}

object Class {
  @scala.inline
  def apply(AccessDotClass_typekey: Class): Class = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Access.Class_typekey")(AccessDotClass_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

