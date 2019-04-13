package typings
package awsDashSdkLib.clientsRedshiftMod

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
    CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.undefined,
    ElapsedTimeInSeconds: js.UndefOr[Long] = js.undefined,
    EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.undefined,
    ProgressInMegaBytes: js.UndefOr[Long] = js.undefined,
    SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.undefined,
    Status: String = null
  ): RestoreStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CurrentRestoreRateInMegaBytesPerSecond)) __obj.updateDynamic("CurrentRestoreRateInMegaBytesPerSecond")(CurrentRestoreRateInMegaBytesPerSecond)
    if (!js.isUndefined(ElapsedTimeInSeconds)) __obj.updateDynamic("ElapsedTimeInSeconds")(ElapsedTimeInSeconds)
    if (!js.isUndefined(EstimatedTimeToCompletionInSeconds)) __obj.updateDynamic("EstimatedTimeToCompletionInSeconds")(EstimatedTimeToCompletionInSeconds)
    if (!js.isUndefined(ProgressInMegaBytes)) __obj.updateDynamic("ProgressInMegaBytes")(ProgressInMegaBytes)
    if (!js.isUndefined(SnapshotSizeInMegaBytes)) __obj.updateDynamic("SnapshotSizeInMegaBytes")(SnapshotSizeInMegaBytes)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[RestoreStatus]
  }
}

