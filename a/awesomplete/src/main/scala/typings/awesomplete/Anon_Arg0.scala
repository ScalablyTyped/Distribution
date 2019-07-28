package typings.awesomplete

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arg0 extends js.Object {
  def replace(arg0: RegExp, arg1: String): Unit
}

object Anon_Arg0 {
  @scala.inline
  def apply(replace: (RegExp, String) => Unit): Anon_Arg0 = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
  
    __obj.asInstanceOf[Anon_Arg0]
  }
}

