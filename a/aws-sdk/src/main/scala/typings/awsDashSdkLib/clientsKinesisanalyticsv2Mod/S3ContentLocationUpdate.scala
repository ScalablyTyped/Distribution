package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ContentLocationUpdate extends js.Object {
  /**
    * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
  /**
    * The new file key for the object containing the application code.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
  /**
    * The new version of the object containing the application code.
    */
  var ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.undefined
}

object S3ContentLocationUpdate {
  @scala.inline
  def apply(
    BucketARNUpdate: BucketARN = null,
    FileKeyUpdate: FileKey = null,
    ObjectVersionUpdate: ObjectVersion = null
  ): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    if (BucketARNUpdate != null) __obj.updateDynamic("BucketARNUpdate")(BucketARNUpdate)
    if (FileKeyUpdate != null) __obj.updateDynamic("FileKeyUpdate")(FileKeyUpdate)
    if (ObjectVersionUpdate != null) __obj.updateDynamic("ObjectVersionUpdate")(ObjectVersionUpdate)
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
}

