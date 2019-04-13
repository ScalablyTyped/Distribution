package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseSnapshotResult extends js.Object {
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined
}

object GetRelationalDatabaseSnapshotResult {
  @scala.inline
  def apply(relationalDatabaseSnapshot: RelationalDatabaseSnapshot = null): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (relationalDatabaseSnapshot != null) __obj.updateDynamic("relationalDatabaseSnapshot")(relationalDatabaseSnapshot)
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
}

