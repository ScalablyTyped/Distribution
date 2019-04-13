package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCertificateResponse extends js.Object {
  /**
    * The description of the certificate.
    */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.undefined
}

object DescribeCertificateResponse {
  @scala.inline
  def apply(certificateDescription: CertificateDescription = null): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateDescription != null) __obj.updateDynamic("certificateDescription")(certificateDescription)
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
}

