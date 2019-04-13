package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRelationalDatabaseFromSnapshotResult extends js.Object {
  /**
    * An object describing the result of your create relational database from snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object CreateRelationalDatabaseFromSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateRelationalDatabaseFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotResult]
  }
}

