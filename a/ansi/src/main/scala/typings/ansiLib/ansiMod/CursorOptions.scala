package typings
package ansiLib.ansiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorOptions extends js.Object {
  var buffering: scala.Boolean
  var enabled: scala.Boolean
}

object CursorOptions {
  @scala.inline
  def apply(buffering: scala.Boolean, enabled: scala.Boolean): CursorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buffering")(buffering)
    __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[CursorOptions]
  }
}

