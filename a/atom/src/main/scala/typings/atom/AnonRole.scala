package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRole extends js.Object {
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object AnonRole {
  @scala.inline
  def apply(
    maintainHistory: js.UndefOr[Boolean] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): AnonRole = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRole]
  }
}

