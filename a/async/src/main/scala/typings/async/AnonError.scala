package typings.async

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.undefined
  var interval: Double | (js.Function1[/* retryCount */ Double, Double])
  var times: Double
}

object AnonError {
  @scala.inline
  def apply(
    interval: Double | (js.Function1[/* retryCount */ Double, Double]),
    times: Double,
    errorFilter: /* error */ Error => Boolean = null
  ): AnonError = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    __obj.asInstanceOf[AnonError]
  }
}

