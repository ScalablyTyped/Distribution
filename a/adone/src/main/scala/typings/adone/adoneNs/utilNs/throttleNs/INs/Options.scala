package typings.adone.adoneNs.utilNs.throttleNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[Double] = js.undefined
  var drop: js.UndefOr[Boolean] = js.undefined
  var dropLast: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var onDone: js.UndefOr[js.Function0[Unit]] = js.undefined
  var ordered: js.UndefOr[Boolean] = js.undefined
  var waitForReturn: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: Int | Double = null,
    drop: js.UndefOr[Boolean] = js.undefined,
    dropLast: js.UndefOr[Boolean] = js.undefined,
    interval: Int | Double = null,
    onDone: () => Unit = null,
    ordered: js.UndefOr[Boolean] = js.undefined,
    waitForReturn: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (!js.isUndefined(dropLast)) __obj.updateDynamic("dropLast")(dropLast)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(js.Any.fromFunction0(onDone))
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (!js.isUndefined(waitForReturn)) __obj.updateDynamic("waitForReturn")(waitForReturn)
    __obj.asInstanceOf[Options]
  }
}

