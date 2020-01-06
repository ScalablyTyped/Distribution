package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceDataSyncRequest extends js.Object {
  /**
    * Amazon S3 configuration details for the sync.
    */
  var S3Destination: js.UndefOr[ResourceDataSyncS3Destination] = js.native
  /**
    * A name for the configuration.
    */
  var SyncName: ResourceDataSyncName = js.native
  /**
    * Specify information about the data sources to synchronize.
    */
  var SyncSource: js.UndefOr[ResourceDataSyncSource] = js.native
  /**
    * Specify SyncToDestination to create a resource data sync that synchronizes data from multiple AWS Regions to an Amazon S3 bucket. Specify SyncFromSource to synchronize data from multiple AWS accounts and Regions, as listed in AWS Organizations.
    */
  var SyncType: js.UndefOr[ResourceDataSyncType] = js.native
}

object CreateResourceDataSyncRequest {
  @scala.inline
  def apply(
    SyncName: ResourceDataSyncName,
    S3Destination: ResourceDataSyncS3Destination = null,
    SyncSource: ResourceDataSyncSource = null,
    SyncType: ResourceDataSyncType = null
  ): CreateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName.asInstanceOf[js.Any])
    if (S3Destination != null) __obj.updateDynamic("S3Destination")(S3Destination.asInstanceOf[js.Any])
    if (SyncSource != null) __obj.updateDynamic("SyncSource")(SyncSource.asInstanceOf[js.Any])
    if (SyncType != null) __obj.updateDynamic("SyncType")(SyncType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceDataSyncRequest]
  }
}

