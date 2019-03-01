package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModeNumber extends js.Object {
  var mode: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ModeNumber {
  @scala.inline
  def apply(mode: scala.Int | scala.Double = null): Anon_ModeNumber = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ModeNumber]
  }
}

