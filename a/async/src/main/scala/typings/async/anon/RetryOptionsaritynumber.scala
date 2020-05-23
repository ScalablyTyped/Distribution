package typings.async.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined async.async.RetryOptions & {  arity ? :number} */
trait RetryOptionsaritynumber extends js.Object {
  var arity: js.UndefOr[Double] = js.undefined
  var errorFilter: js.UndefOr[js.Function1[/* error */ typings.std.Error, Boolean]] = js.undefined
  var interval: js.UndefOr[Double | (js.Function1[/* retryCount */ Double, Double])] = js.undefined
  var times: js.UndefOr[Double] = js.undefined
}

object RetryOptionsaritynumber {
  @scala.inline
  def apply(
    arity: js.UndefOr[Double] = js.undefined,
    errorFilter: /* error */ typings.std.Error => Boolean = null,
    interval: Double | (js.Function1[/* retryCount */ Double, Double]) = null,
    times: js.UndefOr[Double] = js.undefined
  ): RetryOptionsaritynumber = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arity)) __obj.updateDynamic("arity")(arity.get.asInstanceOf[js.Any])
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(times)) __obj.updateDynamic("times")(times.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryOptionsaritynumber]
  }
}

