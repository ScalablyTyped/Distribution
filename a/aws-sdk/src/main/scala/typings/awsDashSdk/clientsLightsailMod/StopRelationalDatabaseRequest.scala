package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRelationalDatabaseRequest extends js.Object {
  /**
    * The name of your database to stop.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The name of your new database snapshot to be created before stopping your database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
}

object StopRelationalDatabaseRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, relationalDatabaseSnapshotName: ResourceName = null): StopRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    if (relationalDatabaseSnapshotName != null) __obj.updateDynamic("relationalDatabaseSnapshotName")(relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRelationalDatabaseRequest]
  }
}

