package typings
package arangodbLib.atArangodbFoxxQueuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobOptions extends js.Object {
  var backOff: js.UndefOr[(js.Function1[/* failureCount */ scala.Double, scala.Double]) | scala.Double] = js.undefined
  var delayUntil: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var failure: js.UndefOr[JobCallback] = js.undefined
  var maxFailures: js.UndefOr[scala.Double] = js.undefined
  var repeatDelay: js.UndefOr[scala.Double] = js.undefined
  var repeatTimes: js.UndefOr[scala.Double] = js.undefined
  var repeatUntil: js.UndefOr[scala.Double | stdLib.Date] = js.undefined
  var success: js.UndefOr[JobCallback] = js.undefined
}

object JobOptions {
  @scala.inline
  def apply(
    backOff: (js.Function1[/* failureCount */ scala.Double, scala.Double]) | scala.Double = null,
    delayUntil: scala.Double | stdLib.Date = null,
    failure: JobCallback = null,
    maxFailures: scala.Int | scala.Double = null,
    repeatDelay: scala.Int | scala.Double = null,
    repeatTimes: scala.Int | scala.Double = null,
    repeatUntil: scala.Double | stdLib.Date = null,
    success: JobCallback = null
  ): JobOptions = {
    val __obj = js.Dynamic.literal()
    if (backOff != null) __obj.updateDynamic("backOff")(backOff.asInstanceOf[js.Any])
    if (delayUntil != null) __obj.updateDynamic("delayUntil")(delayUntil.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (repeatDelay != null) __obj.updateDynamic("repeatDelay")(repeatDelay.asInstanceOf[js.Any])
    if (repeatTimes != null) __obj.updateDynamic("repeatTimes")(repeatTimes.asInstanceOf[js.Any])
    if (repeatUntil != null) __obj.updateDynamic("repeatUntil")(repeatUntil.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[JobOptions]
  }
}

