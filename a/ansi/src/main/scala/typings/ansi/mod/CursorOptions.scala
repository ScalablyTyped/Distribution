package typings.ansi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorOptions extends js.Object {
  var buffering: Boolean
  var enabled: Boolean
}

object CursorOptions {
  @scala.inline
  def apply(buffering: Boolean, enabled: Boolean): CursorOptions = {
    val __obj = js.Dynamic.literal(buffering = buffering.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorOptions]
  }
}

