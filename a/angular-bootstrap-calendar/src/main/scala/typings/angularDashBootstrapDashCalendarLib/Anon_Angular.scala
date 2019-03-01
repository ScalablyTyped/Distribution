package typings
package angularDashBootstrapDashCalendarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angular extends js.Object {
  var angular: angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IFormats
  var moment: angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IFormats
}

object Anon_Angular {
  @scala.inline
  def apply(
    angular: angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IFormats,
    moment: angularDashBootstrapDashCalendarLib.angularMod.bootstrapNs.calendarNs.IFormats
  ): Anon_Angular = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angular")(angular)
    __obj.updateDynamic("moment")(moment)
    __obj.asInstanceOf[Anon_Angular]
  }
}

