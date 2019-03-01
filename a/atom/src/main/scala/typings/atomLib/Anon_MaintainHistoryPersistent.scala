package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaintainHistoryPersistent extends js.Object {
  var maintainHistory: js.UndefOr[scala.Boolean] = js.undefined
  var persistent: js.UndefOr[scala.Boolean] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_MaintainHistoryPersistent {
  @scala.inline
  def apply(
    maintainHistory: js.UndefOr[scala.Boolean] = js.undefined,
    persistent: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null
  ): Anon_MaintainHistoryPersistent = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory)
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent)
    if (role != null) __obj.updateDynamic("role")(role)
    __obj.asInstanceOf[Anon_MaintainHistoryPersistent]
  }
}

