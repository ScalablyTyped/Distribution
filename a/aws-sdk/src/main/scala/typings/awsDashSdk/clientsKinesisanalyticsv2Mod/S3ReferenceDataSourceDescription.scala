package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ReferenceDataSourceDescription extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.BucketARN
  /**
    * Amazon S3 object key name.
    */
  var FileKey: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FileKey
  /**
    * The ARN of the IAM role that Kinesis Data Analytics can assume to read the Amazon S3 object on your behalf to populate the in-application reference table.   Provided for backward compatibility. Applications that are created with the current API version have an application-level service execution role rather than a resource-level role. 
    */
  var ReferenceRoleARN: js.UndefOr[RoleARN] = js.undefined
}

object S3ReferenceDataSourceDescription {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey, ReferenceRoleARN: RoleARN = null): S3ReferenceDataSourceDescription = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, FileKey = FileKey)
    if (ReferenceRoleARN != null) __obj.updateDynamic("ReferenceRoleARN")(ReferenceRoleARN)
    __obj.asInstanceOf[S3ReferenceDataSourceDescription]
  }
}

