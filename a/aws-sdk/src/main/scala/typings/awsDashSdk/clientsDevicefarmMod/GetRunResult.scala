package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRunResult extends js.Object {
  /**
    * The run you wish to get results from.
    */
  var run: js.UndefOr[Run] = js.undefined
}

object GetRunResult {
  @scala.inline
  def apply(run: Run = null): GetRunResult = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(run)
    __obj.asInstanceOf[GetRunResult]
  }
}

