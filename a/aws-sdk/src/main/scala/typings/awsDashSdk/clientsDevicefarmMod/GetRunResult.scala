package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRunResult extends js.Object {
  /**
    * The run to get results from.
    */
  var run: js.UndefOr[Run] = js.native
}

object GetRunResult {
  @scala.inline
  def apply(run: Run = null): GetRunResult = {
    val __obj = js.Dynamic.literal()
    if (run != null) __obj.updateDynamic("run")(run.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRunResult]
  }
}

