package typings
package asyncDashCacheLib.asyncDashCacheMod.AsyncCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends lruDashCacheLib.lruDashCacheMod.LRUCacheNs.Options[java.lang.String, T] {
  def load(
    key: java.lang.String,
    callback: js.Function3[
      /* error */ js.Any, 
      /* asyncValue */ T, 
      /* maxAge */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit
}

object Options {
  @scala.inline
  def apply[T](
    load: (java.lang.String, js.Function3[
      /* error */ js.Any, 
      /* asyncValue */ T, 
      /* maxAge */ js.UndefOr[scala.Double], 
      scala.Unit
    ]) => scala.Unit,
    dispose: (java.lang.String, T) => scala.Unit = null,
    length: (T, /* key */ js.UndefOr[java.lang.String]) => scala.Double = null,
    max: scala.Int | scala.Double = null,
    maxAge: scala.Int | scala.Double = null,
    noDisposeOnSet: js.UndefOr[scala.Boolean] = js.undefined,
    stale: js.UndefOr[scala.Boolean] = js.undefined,
    updateAgeOnGet: js.UndefOr[scala.Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (length != null) __obj.updateDynamic("length")(js.Any.fromFunction2(length))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet)
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale)
    if (!js.isUndefined(updateAgeOnGet)) __obj.updateDynamic("updateAgeOnGet")(updateAgeOnGet)
    __obj.asInstanceOf[Options[T]]
  }
}

