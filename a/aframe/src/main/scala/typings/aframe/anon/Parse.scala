package typings.aframe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parse extends js.Object {
  def parse(value: String): js.Object
  def stringify(data: js.Object): String
}

object Parse {
  @scala.inline
  def apply(parse: String => js.Object, stringify: js.Object => String): Parse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Parse]
  }
}

