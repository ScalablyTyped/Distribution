package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Am extends js.Object {
  var am: js.UndefOr[java.lang.String] = js.undefined
  var day: java.lang.String
  var hour: java.lang.String
  var minute: java.lang.String
  var month: java.lang.String
  var pm: js.UndefOr[java.lang.String] = js.undefined
  var year: java.lang.String
}

object Anon_Am {
  @scala.inline
  def apply(
    day: java.lang.String,
    hour: java.lang.String,
    minute: java.lang.String,
    month: java.lang.String,
    year: java.lang.String,
    am: java.lang.String = null,
    pm: java.lang.String = null
  ): Anon_Am = {
    val __obj = js.Dynamic.literal(day = day, hour = hour, minute = minute, month = month, year = year)
    if (am != null) __obj.updateDynamic("am")(am)
    if (pm != null) __obj.updateDynamic("pm")(pm)
    __obj.asInstanceOf[Anon_Am]
  }
}

