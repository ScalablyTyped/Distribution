package typings.antd

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ValueMoment extends js.Object {
  var value: js.UndefOr[Moment] = js.undefined
}

object Anon_ValueMoment {
  @scala.inline
  def apply(value: Moment = null): Anon_ValueMoment = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ValueMoment]
  }
}

