package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceSnapshotResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the results of your create instances snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateInstanceSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateInstanceSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateInstanceSnapshotResult]
  }
}

