package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database on which to base your new snapshot.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The name for your new database snapshot. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    relationalDatabaseSnapshotName: ResourceName,
    tags: TagList = null
  ): CreateRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any], relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseSnapshotRequest]
  }
}

