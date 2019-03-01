package typings
package atAngularCommonLib.srcI18nLocaleUnderscoreDataUnderscoreApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  var hours: scala.Double
  var minutes: scala.Double
}

object Time {
  @scala.inline
  def apply(hours: scala.Double, minutes: scala.Double): Time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hours")(hours)
    __obj.updateDynamic("minutes")(minutes)
    __obj.asInstanceOf[Time]
  }
}

