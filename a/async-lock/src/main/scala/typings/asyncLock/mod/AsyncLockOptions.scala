package typings.asyncLock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncLockOptions extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var domainReentrant: js.UndefOr[Boolean] = js.undefined
  var maxPending: js.UndefOr[Double] = js.undefined
  var skipQueue: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AsyncLockOptions {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    domainReentrant: js.UndefOr[Boolean] = js.undefined,
    maxPending: js.UndefOr[Double] = js.undefined,
    skipQueue: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): AsyncLockOptions = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(domainReentrant)) __obj.updateDynamic("domainReentrant")(domainReentrant.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPending)) __obj.updateDynamic("maxPending")(maxPending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipQueue)) __obj.updateDynamic("skipQueue")(skipQueue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncLockOptions]
  }
}

