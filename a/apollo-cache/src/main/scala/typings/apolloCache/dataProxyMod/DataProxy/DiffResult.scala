package typings.apolloCache.dataProxyMod.DataProxy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffResult[T] extends js.Object {
  var complete: js.UndefOr[Boolean] = js.undefined
  var result: js.UndefOr[T] = js.undefined
}

object DiffResult {
  @scala.inline
  def apply[T](complete: js.UndefOr[Boolean] = js.undefined, result: T = null): DiffResult[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.get.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffResult[T]]
  }
}

