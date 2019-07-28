package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database snapshot for which to get information.
    */
  var relationalDatabaseSnapshotName: ResourceName
}

object GetRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): GetRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName)
  
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotRequest]
  }
}

