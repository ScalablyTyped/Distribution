package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  def parse(value: String): js.Object
  def stringify(data: js.Object): String
}

object Anon_Data {
  @scala.inline
  def apply(parse: String => js.Object, stringify: js.Object => String): Anon_Data = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[Anon_Data]
  }
}

