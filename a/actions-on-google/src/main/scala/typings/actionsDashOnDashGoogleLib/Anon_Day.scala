package typings
package actionsDashOnDashGoogleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Day extends js.Object {
  var day: scala.Double
  var month: scala.Double
  var year: scala.Double
}

object Anon_Day {
  @scala.inline
  def apply(day: scala.Double, month: scala.Double, year: scala.Double): Anon_Day = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("day")(day)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("year")(year)
    __obj.asInstanceOf[Anon_Day]
  }
}

