package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ReferenceDataSource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[BucketARN] = js.undefined
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[FileKey] = js.undefined
}

object S3ReferenceDataSource {
  @scala.inline
  def apply(BucketARN: BucketARN = null, FileKey: FileKey = null): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
    if (BucketARN != null) __obj.updateDynamic("BucketARN")(BucketARN)
    if (FileKey != null) __obj.updateDynamic("FileKey")(FileKey)
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
}

