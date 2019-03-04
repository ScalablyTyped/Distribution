package typings
package androiduixLib.PageStackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateSaved extends js.Object {
  var extra: js.UndefOr[js.Any] = js.undefined
  var pageId: java.lang.String
}

object StateSaved {
  @scala.inline
  def apply(pageId: java.lang.String, extra: js.Any = null): StateSaved = {
    val __obj = js.Dynamic.literal(pageId = pageId)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    __obj.asInstanceOf[StateSaved]
  }
}

