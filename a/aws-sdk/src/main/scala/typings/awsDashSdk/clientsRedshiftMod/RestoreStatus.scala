package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreStatus extends js.Object {
  /**
    * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup.
    */
  var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish.
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined
  /**
    * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore.
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.undefined
  /**
    * The number of megabytes that have been transferred from snapshot storage.
    */
  var ProgressInMegaBytes: js.UndefOr[Long] = js.undefined
  /**
    * The size of the set of snapshot data used to restore the cluster.
    */
  var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.undefined
  /**
    * The status of the restore action. Returns starting, restoring, completed, or failed.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object RestoreStatus {
  @scala.inline
  def apply(
    CurrentRestoreRateInMegaBytesPerSecond: Int | scala.Double = null,
    ElapsedTimeInSeconds: Int | scala.Double = null,
    EstimatedTimeToCompletionInSeconds: Int | scala.Double = null,
    ProgressInMegaBytes: Int | scala.Double = null,
    SnapshotSizeInMegaBytes: Int | scala.Double = null,
    Status: String = null
  ): RestoreStatus = {
    val __obj = js.Dynamic.literal()
    if (CurrentRestoreRateInMegaBytesPerSecond != null) __obj.updateDynamic("CurrentRestoreRateInMegaBytesPerSecond")(CurrentRestoreRateInMegaBytesPerSecond.asInstanceOf[js.Any])
    if (ElapsedTimeInSeconds != null) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds.asInstanceOf[js.Any])
    if (EstimatedTimeToCompletionInSeconds != null) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds.asInstanceOf[js.Any])
    if (ProgressInMegaBytes != null) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes.asInstanceOf[js.Any])
    if (SnapshotSizeInMegaBytes != null) __obj.updateDynamic("SnapshotSizeInMegaBytes")(SnapshotSizeInMegaBytes.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[RestoreStatus]
  }
}

