package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3KeyOutput extends js.Object {
  /**
    * The etag for the object.
    */
  var etag: js.UndefOr[S3Etag] = js.undefined
  /**
    * The S3 key.
    */
  var s3Key: js.UndefOr[S3Key] = js.undefined
}

object S3KeyOutput {
  @scala.inline
  def apply(etag: S3Etag = null, s3Key: S3Key = null): S3KeyOutput = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (s3Key != null) __obj.updateDynamic("s3Key")(s3Key)
    __obj.asInstanceOf[S3KeyOutput]
  }
}

