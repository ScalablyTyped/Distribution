package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceDataSyncS3Destination extends js.Object {
  /**
    * The ARN of an encryption key for a destination in Amazon S3. Must belong to the same Region as the destination Amazon S3 bucket.
    */
  var AWSKMSKeyARN: js.UndefOr[ResourceDataSyncAWSKMSKeyARN] = js.native
  /**
    * The name of the Amazon S3 bucket where the aggregated data is stored.
    */
  var BucketName: ResourceDataSyncS3BucketName = js.native
  /**
    * An Amazon S3 prefix for the bucket.
    */
  var Prefix: js.UndefOr[ResourceDataSyncS3Prefix] = js.native
  /**
    * The AWS Region with the Amazon S3 bucket targeted by the Resource Data Sync.
    */
  var Region: ResourceDataSyncS3Region = js.native
  /**
    * A supported sync format. The following format is currently supported: JsonSerDe
    */
  var SyncFormat: ResourceDataSyncS3Format = js.native
}

object ResourceDataSyncS3Destination {
  @scala.inline
  def apply(
    BucketName: ResourceDataSyncS3BucketName,
    Region: ResourceDataSyncS3Region,
    SyncFormat: ResourceDataSyncS3Format,
    AWSKMSKeyARN: ResourceDataSyncAWSKMSKeyARN = null,
    Prefix: ResourceDataSyncS3Prefix = null
  ): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName.asInstanceOf[js.Any], Region = Region.asInstanceOf[js.Any], SyncFormat = SyncFormat.asInstanceOf[js.Any])
    if (AWSKMSKeyARN != null) __obj.updateDynamic("AWSKMSKeyARN")(AWSKMSKeyARN.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
}

