package typings.async.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetryOptions extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.undefined
  var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
  var times: js.UndefOr[Double] = js.undefined
}

object RetryOptions {
  @scala.inline
  def apply(
    errorFilter: /* error */ Error => Boolean = null,
    interval: Double | (js.Function1[/* retryCount */ Double, Double]) = null,
    times: js.UndefOr[Double] = js.undefined
  ): RetryOptions = {
    val __obj = js.Dynamic.literal()
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptions]
  }
}

