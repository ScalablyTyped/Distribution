package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotDetails extends js.Object {
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationVersionId
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.SnapshotName
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: awsDashSdkLib.clientsKinesisanalyticsv2Mod.SnapshotStatus
}

object SnapshotDetails {
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus,
    SnapshotCreationTimestamp: Timestamp = null
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId, SnapshotName = SnapshotName, SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    if (SnapshotCreationTimestamp != null) __obj.updateDynamic("SnapshotCreationTimestamp")(SnapshotCreationTimestamp)
    __obj.asInstanceOf[SnapshotDetails]
  }
}

