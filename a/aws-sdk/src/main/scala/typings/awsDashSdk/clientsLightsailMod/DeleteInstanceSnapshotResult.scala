package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your delete instance snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DeleteInstanceSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): DeleteInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DeleteInstanceSnapshotResult]
  }
}

