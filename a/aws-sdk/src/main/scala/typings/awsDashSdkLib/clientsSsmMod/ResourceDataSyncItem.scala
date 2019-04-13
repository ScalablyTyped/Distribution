package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceDataSyncItem extends js.Object {
  /**
    * The status reported by the last sync.
    */
  var LastStatus: js.UndefOr[LastResourceDataSyncStatus] = js.undefined
  /**
    * The last time the sync operations returned a status of SUCCESSFUL (UTC).
    */
  var LastSuccessfulSyncTime: js.UndefOr[LastSuccessfulResourceDataSyncTime] = js.undefined
  /**
    * The status message details reported by the last sync.
    */
  var LastSyncStatusMessage: js.UndefOr[LastResourceDataSyncMessage] = js.undefined
  /**
    * The last time the configuration attempted to sync (UTC).
    */
  var LastSyncTime: js.UndefOr[LastResourceDataSyncTime] = js.undefined
  /**
    * Configuration information for the target Amazon S3 bucket.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.undefined
  /**
    * The date and time the configuration was created (UTC).
    */
  var SyncCreatedTime: js.UndefOr[ResourceDataSyncCreatedTime] = js.undefined
  /**
    * The name of the Resource Data Sync.
    */
  var SyncName: js.UndefOr[ResourceDataSyncName] = js.undefined
}

object ResourceDataSyncItem {
  @scala.inline
  def apply(
    LastStatus: LastResourceDataSyncStatus = null,
    LastSuccessfulSyncTime: LastSuccessfulResourceDataSyncTime = null,
    LastSyncStatusMessage: LastResourceDataSyncMessage = null,
    LastSyncTime: LastResourceDataSyncTime = null,
    S3Destination: ResourceDataSyncS3Destination = null,
    SyncCreatedTime: ResourceDataSyncCreatedTime = null,
    SyncName: ResourceDataSyncName = null
  ): ResourceDataSyncItem = {
    val __obj = js.Dynamic.literal()
    if (LastStatus != null) __obj.updateDynamic("LastStatus")(LastStatus.asInstanceOf[js.Any])
    if (LastSuccessfulSyncTime != null) __obj.updateDynamic("LastSuccessfulSyncTime")(LastSuccessfulSyncTime)
    if (LastSyncStatusMessage != null) __obj.updateDynamic("LastSyncStatusMessage")(LastSyncStatusMessage)
    if (LastSyncTime != null) __obj.updateDynamic("LastSyncTime")(LastSyncTime)
    if (S3Destination != null) __obj.updateDynamic("S3Destination")(S3Destination)
    if (SyncCreatedTime != null) __obj.updateDynamic("SyncCreatedTime")(SyncCreatedTime)
    if (SyncName != null) __obj.updateDynamic("SyncName")(SyncName)
    __obj.asInstanceOf[ResourceDataSyncItem]
  }
}

