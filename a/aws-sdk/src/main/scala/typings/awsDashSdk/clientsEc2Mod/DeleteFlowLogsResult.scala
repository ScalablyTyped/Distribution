package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFlowLogsResult extends js.Object {
  /**
    * Information about the flow logs that could not be deleted successfully.
    */
  var Unsuccessful: js.UndefOr[UnsuccessfulItemSet] = js.native
}

object DeleteFlowLogsResult {
  @scala.inline
  def apply(Unsuccessful: UnsuccessfulItemSet = null): DeleteFlowLogsResult = {
    val __obj = js.Dynamic.literal()
    if (Unsuccessful != null) __obj.updateDynamic("Unsuccessful")(Unsuccessful.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFlowLogsResult]
  }
}

