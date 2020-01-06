package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMultipartUploadsOutput extends js.Object {
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of in-progress multipart uploads.
    */
  var UploadsList: js.UndefOr[typings.awsDashSdk.clientsGlacierMod.UploadsList] = js.native
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(Marker: String = null, UploadsList: UploadsList = null): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (UploadsList != null) __obj.updateDynamic("UploadsList")(UploadsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
}

