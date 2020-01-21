package typings.antd

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonValueMoment extends js.Object {
  var value: js.UndefOr[Moment] = js.undefined
}

object AnonValueMoment {
  @scala.inline
  def apply(value: Moment = null): AnonValueMoment = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonValueMoment]
  }
}

