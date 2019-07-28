package typings.acl.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(msg: String): js.Any
}

object Logger {
  @scala.inline
  def apply(debug: String => js.Any): Logger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug))
  
    __obj.asInstanceOf[Logger]
  }
}

