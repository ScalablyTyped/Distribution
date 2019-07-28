package typings.agenda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SkipImmediate extends js.Object {
  var skipImmediate: js.UndefOr[Boolean] = js.undefined
  var timezone: js.UndefOr[String] = js.undefined
}

object Anon_SkipImmediate {
  @scala.inline
  def apply(skipImmediate: js.UndefOr[Boolean] = js.undefined, timezone: String = null): Anon_SkipImmediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipImmediate)) __obj.updateDynamic("skipImmediate")(skipImmediate)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Anon_SkipImmediate]
  }
}

