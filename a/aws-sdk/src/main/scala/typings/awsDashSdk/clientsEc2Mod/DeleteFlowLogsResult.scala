package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFlowLogsResult extends js.Object {
  /**
    * Information about the flow logs that could not be deleted successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.undefined
}

object DeleteFlowLogsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): DeleteFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful)
    __obj.asInstanceOf[DeleteFlowLogsResult]
  }
}

