package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Am extends js.Object {
  var am: js.UndefOr[String] = js.undefined
  var day: String
  var hour: String
  var minute: String
  var month: String
  var pm: js.UndefOr[String] = js.undefined
  var year: String
}

object Anon_Am {
  @scala.inline
  def apply(
    day: String,
    hour: String,
    minute: String,
    month: String,
    year: String,
    am: String = null,
    pm: String = null
  ): Anon_Am = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    if (am != null) __obj.updateDynamic("am")(am.asInstanceOf[js.Any])
    if (pm != null) __obj.updateDynamic("pm")(pm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Am]
  }
}

