package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySnapshotResult extends js.Object {
  /**
    * A list of objects describing the API operation.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CopySnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CopySnapshotResult]
  }
}

