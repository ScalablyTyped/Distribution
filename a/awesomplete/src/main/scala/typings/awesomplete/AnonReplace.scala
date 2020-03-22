package typings.awesomplete

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReplace extends js.Object {
  def replace(arg0: RegExp, arg1: String): Unit
}

object AnonReplace {
  @scala.inline
  def apply(replace: (RegExp, String) => Unit): AnonReplace = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
  
    __obj.asInstanceOf[AnonReplace]
  }
}

