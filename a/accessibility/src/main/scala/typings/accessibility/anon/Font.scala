package typings.accessibility.anon

import typings.accessibility.mod.SizeOrPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var font: SizeOrPosition
}

object Font {
  @scala.inline
  def apply(font: SizeOrPosition): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
}

