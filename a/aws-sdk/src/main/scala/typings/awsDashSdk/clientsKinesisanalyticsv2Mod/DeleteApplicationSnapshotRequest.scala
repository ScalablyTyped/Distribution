package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
    */
  var SnapshotCreationTimestamp: Timestamp
  /**
    * The identifier for the snapshot delete.
    */
  var SnapshotName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotName
}

object DeleteApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotCreationTimestamp: Timestamp, SnapshotName: SnapshotName): DeleteApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, SnapshotCreationTimestamp = SnapshotCreationTimestamp, SnapshotName = SnapshotName)
  
    __obj.asInstanceOf[DeleteApplicationSnapshotRequest]
  }
}

