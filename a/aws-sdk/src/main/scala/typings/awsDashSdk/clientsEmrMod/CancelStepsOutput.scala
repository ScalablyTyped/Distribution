package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStepsOutput extends js.Object {
  /**
    * A list of CancelStepsInfo, which shows the status of specified cancel requests for each StepID specified.
    */
  var CancelStepsInfoList: js.UndefOr[typings.awsDashSdk.clientsEmrMod.CancelStepsInfoList] = js.native
}

object CancelStepsOutput {
  @scala.inline
  def apply(CancelStepsInfoList: CancelStepsInfoList = null): CancelStepsOutput = {
    val __obj = js.Dynamic.literal()
    if (CancelStepsInfoList != null) __obj.updateDynamic("CancelStepsInfoList")(CancelStepsInfoList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStepsOutput]
  }
}

