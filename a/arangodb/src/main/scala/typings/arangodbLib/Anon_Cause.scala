package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cause extends js.Object {
  var cause: js.UndefOr[stdLib.Error] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
}

object Anon_Cause {
  @scala.inline
  def apply(cause: stdLib.Error = null, extra: js.Any = null): Anon_Cause = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    __obj.asInstanceOf[Anon_Cause]
  }
}

