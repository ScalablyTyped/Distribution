package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3KeyOutput extends js.Object {
  /**
    * The etag for the object.
    */
  var etag: js.UndefOr[S3Etag] = js.native
  /**
    * The S3 key.
    */
  var s3Key: js.UndefOr[S3Key] = js.native
}

object S3KeyOutput {
  @scala.inline
  def apply(etag: S3Etag = null, s3Key: S3Key = null): S3KeyOutput = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3KeyOutput]
  }
}

