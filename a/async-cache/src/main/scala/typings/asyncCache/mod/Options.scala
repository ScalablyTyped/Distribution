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
    max: js.UndefOr[Double] = js.undefined,
    maxAge: js.UndefOr[Double] = js.undefined,
    noDisposeOnSet: js.UndefOr[Boolean] = js.undefined,
    stale: js.UndefOr[Boolean] = js.undefined,
    updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal(load = js.Any.fromFunction2(load))
    if (dispose != null) __obj.updateDynamic("dispose")(js.Any.fromFunction2(dispose))
    if (length != null) __obj.updateDynamic("length")(js.Any.fromFunction2(length))
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noDisposeOnSet)) __obj.updateDynamic("noDisposeOnSet")(noDisposeOnSet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stale)) __obj.updateDynamic("stale")(stale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updateAgeOnGet)) __obj.updateDynamic("updateAgeOnGet")(updateAgeOnGet.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

