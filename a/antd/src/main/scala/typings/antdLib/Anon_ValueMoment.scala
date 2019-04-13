package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueMoment extends js.Object {
  var value: js.UndefOr[momentLib.momentMod.Moment]
}

object Anon_ValueMoment {
  @scala.inline
  def apply(value: momentLib.momentMod.Moment = null): Anon_ValueMoment = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_ValueMoment]
  }
}

