package typings
package adoneLib.adoneNs.utilNs.throttleNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var drop: js.UndefOr[scala.Boolean] = js.undefined
  var dropLast: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[scala.Double] = js.undefined
  var onDone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  var waitForReturn: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    concurrency: scala.Int | scala.Double = null,
    drop: js.UndefOr[scala.Boolean] = js.undefined,
    dropLast: js.UndefOr[scala.Boolean] = js.undefined,
    interval: scala.Int | scala.Double = null,
    onDone: js.Function0[scala.Unit] = null,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    waitForReturn: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (concurrency != null) __obj.updateDynamic("concurrency")(concurrency.asInstanceOf[js.Any])
    if (!js.isUndefined(drop)) __obj.updateDynamic("drop")(drop)
    if (!js.isUndefined(dropLast)) __obj.updateDynamic("dropLast")(dropLast)
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (onDone != null) __obj.updateDynamic("onDone")(onDone)
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (!js.isUndefined(waitForReturn)) __obj.updateDynamic("waitForReturn")(waitForReturn)
    __obj.asInstanceOf[Options]
  }
}

