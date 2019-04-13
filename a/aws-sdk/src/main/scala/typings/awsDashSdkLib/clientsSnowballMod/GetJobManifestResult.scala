package typings
package awsDashSdkLib.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobManifestResult extends js.Object {
  /**
    * The Amazon S3 presigned URL for the manifest file associated with the specified JobId value.
    */
  var ManifestURI: js.UndefOr[String] = js.undefined
}

object GetJobManifestResult {
  @scala.inline
  def apply(ManifestURI: String = null): GetJobManifestResult = {
    val __obj = js.Dynamic.literal()
    if (ManifestURI != null) __obj.updateDynamic("ManifestURI")(ManifestURI)
    __obj.asInstanceOf[GetJobManifestResult]
  }
}

