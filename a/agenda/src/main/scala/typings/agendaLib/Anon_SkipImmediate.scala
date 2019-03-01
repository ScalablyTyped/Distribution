package typings
package agendaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SkipImmediate extends js.Object {
  var skipImmediate: js.UndefOr[scala.Boolean] = js.undefined
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_SkipImmediate {
  @scala.inline
  def apply(skipImmediate: js.UndefOr[scala.Boolean] = js.undefined, timezone: java.lang.String = null): Anon_SkipImmediate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(skipImmediate)) __obj.updateDynamic("skipImmediate")(skipImmediate)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Anon_SkipImmediate]
  }
}

