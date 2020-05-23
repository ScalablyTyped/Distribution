package typings.angularUiBootstrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date extends js.Object {
  var date: js.UndefOr[String] = js.undefined
  var `datetime-local`: js.UndefOr[String] = js.undefined
  var month: js.UndefOr[String] = js.undefined
}

object Date {
  @scala.inline
  def apply(date: String = null, `datetime-local`: String = null, month: String = null): Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (`datetime-local` != null) __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    if (month != null) __obj.updateDynamic("month")(month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
}

