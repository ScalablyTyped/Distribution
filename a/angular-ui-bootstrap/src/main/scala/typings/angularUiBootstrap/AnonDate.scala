package typings.angularUiBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var `datetime-local`: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(date: String = null, `datetime-local`: String = null, month: String = null): AnonDate = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (`datetime-local` != null) __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

