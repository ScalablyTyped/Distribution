package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database snapshot that you are deleting.
    */
  var relationalDatabaseSnapshotName: ResourceName
}

object DeleteRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(relationalDatabaseSnapshotName: ResourceName): DeleteRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName)
  
    __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
  }
}

