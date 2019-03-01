package typings
package angularDashUiDashBootstrapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: js.UndefOr[java.lang.String] = js.undefined
  var `datetime-local`: js.UndefOr[java.lang.String] = js.undefined
  var month: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(
    date: java.lang.String = null,
    `datetime-local`: java.lang.String = null,
    month: java.lang.String = null
  ): Anon_Date = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (`datetime-local` != null) __obj.updateDynamic("datetime-local")(`datetime-local`)
    if (month != null) __obj.updateDynamic("month")(month)
    __obj.asInstanceOf[Anon_Date]
  }
}

