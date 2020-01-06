package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotDetails extends js.Object {
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId = js.native
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotName = js.native
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.SnapshotStatus = js.native
}

object SnapshotDetails {
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus,
    SnapshotCreationTimestamp: Timestamp = null
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    if (SnapshotCreationTimestamp != null) __obj.updateDynamic("SnapshotCreationTimestamp")(SnapshotCreationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
}

