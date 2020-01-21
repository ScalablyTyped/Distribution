package typings.awesomplete

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArg0 extends js.Object {
  def replace(arg0: RegExp, arg1: String): Unit
}

object AnonArg0 {
  @scala.inline
  def apply(replace: (RegExp, String) => Unit): AnonArg0 = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
  
    __obj.asInstanceOf[AnonArg0]
  }
}

