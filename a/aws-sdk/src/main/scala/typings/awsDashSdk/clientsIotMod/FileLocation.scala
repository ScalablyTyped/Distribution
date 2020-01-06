package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileLocation extends js.Object {
  /**
    * The location of the updated firmware in S3.
    */
  var s3Location: js.UndefOr[S3Location] = js.native
  /**
    * The stream that contains the OTA update.
    */
  var stream: js.UndefOr[Stream] = js.native
}

object FileLocation {
  @scala.inline
  def apply(s3Location: S3Location = null, stream: Stream = null): FileLocation = {
    val __obj = js.Dynamic.literal()
    if (s3Location != null) __obj.updateDynamic("s3Location")(s3Location.asInstanceOf[js.Any])
    if (stream != null) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileLocation]
  }
}

