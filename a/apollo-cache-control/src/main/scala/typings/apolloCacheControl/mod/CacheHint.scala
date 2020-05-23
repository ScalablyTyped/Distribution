package typings.apolloCacheControl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheHint extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[CacheScope] = js.undefined
}

object CacheHint {
  @scala.inline
  def apply(maxAge: js.UndefOr[Double] = js.undefined, scope: CacheScope = null): CacheHint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheHint]
  }
}

