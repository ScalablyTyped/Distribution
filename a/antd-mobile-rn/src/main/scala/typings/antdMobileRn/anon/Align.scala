package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Align extends js.Object {
  var align: String
  var direction: String
  var justify: String
  var wrap: String
}

object Align {
  @scala.inline
  def apply(align: String, direction: String, justify: String, wrap: String): Align = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], justify = justify.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
}

