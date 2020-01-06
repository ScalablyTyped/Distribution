package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ReferenceDataSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.BucketARN] = js.native
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[typings.awsDashSdk.clientsKinesisanalyticsv2Mod.FileKey] = js.native
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(BucketARN: BucketARN = null, FileKey: FileKey = null): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
    if (BucketARN != null) __obj.updateDynamic("BucketARN")(BucketARN.asInstanceOf[js.Any])
    if (FileKey != null) __obj.updateDynamic("FileKey")(FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
}

