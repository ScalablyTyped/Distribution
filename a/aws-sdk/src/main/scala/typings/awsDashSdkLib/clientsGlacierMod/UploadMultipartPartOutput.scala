package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadMultipartPartOutput extends js.Object {
  /**
    * The SHA256 tree hash that Amazon S3 Glacier computed for the uploaded part.
    */
  var checksum: js.UndefOr[java.lang.String] = js.undefined
}

object UploadMultipartPartOutput {
  @scala.inline
  def apply(checksum: java.lang.String = null): UploadMultipartPartOutput = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    __obj.asInstanceOf[UploadMultipartPartOutput]
  }
}

