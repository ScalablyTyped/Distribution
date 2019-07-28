package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRunResult extends js.Object {
  /**
    * The run that was stopped.
    */
  var run: js.UndefOr[Run] = js.undefined
}

object StopRunResult {
  @scala.inline
  def apply(run: Run = null): StopRunResult = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[StopRunResult]
  }
}

