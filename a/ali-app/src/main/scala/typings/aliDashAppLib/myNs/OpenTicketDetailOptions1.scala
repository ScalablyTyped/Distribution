package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTicketDetailOptions1
  extends BaseOptions[js.Any, js.Any] {
  var passId: java.lang.String
}

object OpenTicketDetailOptions1 {
  @scala.inline
  def apply(
    passId: java.lang.String,
    complete: /* res */ js.Any => scala.Unit = null,
    fail: js.Any => scala.Unit = null,
    success: js.Any => scala.Unit = null
  ): OpenTicketDetailOptions1 = {
    val __obj = js.Dynamic.literal(passId = passId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenTicketDetailOptions1]
  }
}

