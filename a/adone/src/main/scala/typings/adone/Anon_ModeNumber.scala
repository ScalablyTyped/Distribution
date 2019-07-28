package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ModeNumber extends js.Object {
  var mode: js.UndefOr[Double] = js.undefined
}

object Anon_ModeNumber {
  @scala.inline
  def apply(mode: Int | Double = null): Anon_ModeNumber = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ModeNumber]
  }
}

