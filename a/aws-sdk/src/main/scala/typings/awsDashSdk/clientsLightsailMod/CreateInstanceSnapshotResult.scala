package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your create instances snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object CreateInstanceSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstanceSnapshotResult]
  }
}

