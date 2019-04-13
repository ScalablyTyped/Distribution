package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to stop.
    */
  var relationalDatabaseName: ResourceName
  /**
    * The name of your new database snapshot to be created before stopping your database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
}

object StopRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, relationalDatabaseSnapshotName: ResourceName = null): StopRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (relationalDatabaseSnapshotName != null) __obj.updateDynamic("relationalDatabaseSnapshotName")(relationalDatabaseSnapshotName)
    __obj.asInstanceOf[StopRelationalDatabaseRequest]
  }
}

