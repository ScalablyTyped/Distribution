package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Source extends js.Object {
  /**
    * The taget processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.native
  /**
    * A hash of the object specified by s3Bucket and s3Key.
    */
  var etag: js.UndefOr[S3Etag] = js.native
  /**
    * The s3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.native
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}

object Source {
  @scala.inline
  def apply(
    architecture: Architecture = null,
    etag: S3Etag = null,
    s3Bucket: S3Bucket = null,
    s3Key: S3Key = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket.asInstanceOf[js.Any])
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

