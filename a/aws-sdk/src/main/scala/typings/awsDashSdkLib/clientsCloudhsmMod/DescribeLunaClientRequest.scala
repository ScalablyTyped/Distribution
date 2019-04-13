package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLunaClientRequest extends js.Object {
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[CertificateFingerprint] = js.undefined
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[ClientArn] = js.undefined
}

object DescribeLunaClientRequest {
  @scala.inline
  def apply(CertificateFingerprint: CertificateFingerprint = null, ClientArn: ClientArn = null): DescribeLunaClientRequest = {
    val __obj = js.Dynamic.literal()
    if (CertificateFingerprint != null) __obj.updateDynamic("CertificateFingerprint")(CertificateFingerprint)
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn)
    __obj.asInstanceOf[DescribeLunaClientRequest]
  }
}

