package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var errorFilter: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Boolean]] = js.undefined
  var interval: scala.Double | (js.Function1[/* retryCount */ scala.Double, scala.Double])
  var times: scala.Double
}

object Anon_Error {
  @scala.inline
  def apply(
    interval: scala.Double | (js.Function1[/* retryCount */ scala.Double, scala.Double]),
    times: scala.Double,
    errorFilter: /* error */ stdLib.Error => scala.Boolean = null
  ): Anon_Error = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times)
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction1(errorFilter))
    __obj.asInstanceOf[Anon_Error]
  }
}

