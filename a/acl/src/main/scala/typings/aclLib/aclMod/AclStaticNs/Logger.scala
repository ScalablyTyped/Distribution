package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def debug(msg: java.lang.String): js.Any
}

object Logger {
  @scala.inline
  def apply(debug: js.Function1[java.lang.String, js.Any]): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Logger]
  }
}

