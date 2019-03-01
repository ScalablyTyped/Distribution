package typings
package asyncDashLockLib.asyncDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncLockOptions extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var domainReentrant: js.UndefOr[scala.Boolean] = js.undefined
  var maxPending: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object AsyncLockOptions {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    domainReentrant: js.UndefOr[scala.Boolean] = js.undefined,
    maxPending: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): AsyncLockOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise)
    if (!js.isUndefined(domainReentrant)) __obj.updateDynamic("domainReentrant")(domainReentrant)
    if (maxPending != null) __obj.updateDynamic("maxPending")(maxPending.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLockOptions]
  }
}

