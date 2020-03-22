package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParse extends js.Object {
  def parse(value: String): js.Object
  def stringify(data: js.Object): String
}

object AnonParse {
  @scala.inline
  def apply(parse: String => js.Object, stringify: js.Object => String): AnonParse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
  
    __obj.asInstanceOf[AnonParse]
  }
}

