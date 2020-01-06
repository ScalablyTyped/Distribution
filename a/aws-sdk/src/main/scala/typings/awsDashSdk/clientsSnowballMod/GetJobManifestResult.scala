package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobManifestResult extends js.Object {
  /**
    * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
    */
  var ManifestURI: js.UndefOr[String] = js.native
}

object GetJobManifestResult {
  @scala.inline
  def apply(ManifestURI: String = null): GetJobManifestResult = {
    val __obj = js.Dynamic.literal()
    if (ManifestURI != null) __obj.updateDynamic("ManifestURI")(ManifestURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobManifestResult]
  }
}

