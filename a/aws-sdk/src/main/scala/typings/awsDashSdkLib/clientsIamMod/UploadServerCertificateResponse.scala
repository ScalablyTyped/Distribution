package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadServerCertificateResponse extends js.Object {
  /**
    * The meta information of the uploaded server certificate without its certificate body, certificate chain, and private key.
    */
  var ServerCertificateMetadata: js.UndefOr[ServerCertificateMetadata] = js.undefined
}

object UploadServerCertificateResponse {
  @scala.inline
  def apply(ServerCertificateMetadata: ServerCertificateMetadata = null): UploadServerCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (ServerCertificateMetadata != null) __obj.updateDynamic("ServerCertificateMetadata")(ServerCertificateMetadata)
    __obj.asInstanceOf[UploadServerCertificateResponse]
  }
}

