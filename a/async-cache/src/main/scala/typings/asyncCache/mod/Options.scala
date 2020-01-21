package typings.asyncCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T]
  extends typings.lruCache.mod.Options[String, T] {
  def load(
    key: String,
    callback: js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]
  ): Unit
}

object Options {
  @scala.inline
  def apply[T](
    load: (String, js.Function3[/* error */ js.Any, /* asyncValue */ T, /* maxAge */ js.UndefOr[Double], Unit]) => Unit,
    dispose: (String, T) => Unit = null,
    length: (T, /* key */ js.UndefOr[String]) => Double = null,
    max: Int | Double = null,
    maxAge: Int | Double = null,
    noDisposeOnSet: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (length != null) __obj.updateDynamic("length")(js.Any.fromFunction2(length))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.asInstanceOf[js.Any])
    if (!js.isUndefined(updateAgeOnGet)) __obj.updateDynamic("updateAgeOnGet")(updateAgeOnGet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

