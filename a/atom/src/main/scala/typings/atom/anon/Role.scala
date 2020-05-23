package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Role extends js.Object {
  var maintainHistory: js.UndefOr[Boolean] = js.undefined
  var persistent: js.UndefOr[Boolean] = js.undefined
  var role: js.UndefOr[String] = js.undefined
}

object Role {
  @scala.inline
  def apply(
    maintainHistory: js.UndefOr[Boolean] = js.undefined,
    persistent: js.UndefOr[Boolean] = js.undefined,
    role: String = null
  ): Role = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maintainHistory)) __obj.updateDynamic("maintainHistory")(maintainHistory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(persistent)) __obj.updateDynamic("persistent")(persistent.get.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
}

