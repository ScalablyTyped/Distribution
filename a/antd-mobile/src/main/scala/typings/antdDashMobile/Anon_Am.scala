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
    val __obj = js.Dynamic.literal(day = day, hour = hour, minute = minute, month = month, year = year)
    if (am != null) __obj.updateDynamic("am")(am)
    if (pm != null) __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Anon_Am]
  }
}

