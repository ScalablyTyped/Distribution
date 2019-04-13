package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstancesFromSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your create instances from snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateInstancesFromSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateInstancesFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateInstancesFromSnapshotResult]
  }
}

