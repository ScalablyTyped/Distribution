package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Obj extends js.Object {
  def parse(str: String): js.Any
  def stringify(obj: js.Any): String
}

object Anon_Obj {
  @scala.inline
  def apply(parse: String => js.Any, stringify: js.Any => String): Anon_Obj = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Anon_Obj]
  }
}

