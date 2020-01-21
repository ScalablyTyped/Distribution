package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSkipImmediate extends js.Object {
  var skipImmediate: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object AnonSkipImmediate {
  @scala.inline
  def apply(skipImmediate: js.UndefOr[Boolean] = js.undefined, timezone: String = null): AnonSkipImmediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipImmediate)) __obj.updateDynamic("skipImmediate")(skipImmediate.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSkipImmediate]
  }
}

