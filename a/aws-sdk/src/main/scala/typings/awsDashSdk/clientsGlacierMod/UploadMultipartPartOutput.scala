package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadMultipartPartOutput extends js.Object {
  /**
    * The SHA256 tree hash that Amazon S3 Glacier computed for the uploaded part.
    */
  var checksum: js.UndefOr[String] = js.native
}

object UploadMultipartPartOutput {
  @scala.inline
  def apply(checksum: String = null): UploadMultipartPartOutput = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadMultipartPartOutput]
  }
}

