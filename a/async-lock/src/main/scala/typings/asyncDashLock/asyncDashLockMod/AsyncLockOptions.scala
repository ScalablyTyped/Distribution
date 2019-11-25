package typings.asyncDashLock.asyncDashLockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncLockOptions extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var domainReentrant: js.UndefOr[Boolean] = js.undefined
  var maxPending: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AsyncLockOptions {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    domainReentrant: js.UndefOr[Boolean] = js.undefined,
    maxPending: Int | Double = null,
    timeout: Int | Double = null
  ): AsyncLockOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(domainReentrant)) __obj.updateDynamic("domainReentrant")(domainReentrant.asInstanceOf[js.Any])
    if (maxPending != null) __obj.updateDynamic("maxPending")(maxPending.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLockOptions]
  }
}

