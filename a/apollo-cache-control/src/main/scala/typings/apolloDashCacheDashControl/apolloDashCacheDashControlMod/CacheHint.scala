package typings.apolloDashCacheDashControl.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheHint extends js.Object {
  var maxAge: js.UndefOr[Double] = js.undefined
  var scope: js.UndefOr[CacheScope] = js.undefined
}

object CacheHint {
  @scala.inline
  def apply(maxAge: Int | Double = null, scope: CacheScope = null): CacheHint = {
    val __obj = js.Dynamic.literal()
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheHint]
  }
}

