package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleRunResult extends js.Object {
  /**
    * Information about the scheduled run.
    */
  var run: js.UndefOr[Run] = js.undefined
}

object ScheduleRunResult {
  @scala.inline
  def apply(run: Run = null): ScheduleRunResult = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[ScheduleRunResult]
  }
}

