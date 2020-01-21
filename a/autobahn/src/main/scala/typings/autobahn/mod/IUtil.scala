package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtil extends js.Object {
  def assert(condition: Boolean, message: String): Unit
}

object IUtil {
  @scala.inline
  def apply(assert: (Boolean, String) => Unit): IUtil = {
    val __obj = js.Dynamic.literal(assert = js.Any.fromFunction2(assert))
  
    __obj.asInstanceOf[IUtil]
  }
}

