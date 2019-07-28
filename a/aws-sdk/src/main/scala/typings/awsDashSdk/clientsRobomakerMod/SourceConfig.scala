package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceConfig extends js.Object {
  /**
    * The target processor architecture for the application.
    */
  var architecture: js.UndefOr[Architecture] = js.undefined
  /**
    * The Amazon S3 bucket name.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The s3 object key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
}

object SourceConfig {
  @scala.inline
  def apply(architecture: Architecture = null, s3Bucket: S3Bucket = null, s3Key: S3Key = null): SourceConfig = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket)
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key)
    __obj.asInstanceOf[SourceConfig]
  }
}

