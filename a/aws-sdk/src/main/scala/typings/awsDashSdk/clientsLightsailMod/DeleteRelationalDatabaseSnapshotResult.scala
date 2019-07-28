package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRelationalDatabaseSnapshotResult extends js.Object {
  /**
    * An object describing the result of your delete relational database snapshot request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DeleteRelationalDatabaseSnapshotResult {
  @scala.inline
  def apply(operations: OperationList = null): DeleteRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotResult]
  }
}

