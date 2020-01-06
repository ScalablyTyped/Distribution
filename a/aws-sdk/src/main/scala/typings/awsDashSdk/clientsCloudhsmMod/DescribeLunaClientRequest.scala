package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLunaClientRequest extends js.Object {
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.CertificateFingerprint] = js.native
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.ClientArn] = js.native
}

object DescribeLunaClientRequest {
  @scala.inline
  def apply(CertificateFingerprint: CertificateFingerprint = null, ClientArn: ClientArn = null): DescribeLunaClientRequest = {
    val __obj = js.Dynamic.literal()
    if (CertificateFingerprint != null) __obj.updateDynamic("CertificateFingerprint")(CertificateFingerprint.asInstanceOf[js.Any])
    if (ClientArn != null) __obj.updateDynamic("ClientArn")(ClientArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLunaClientRequest]
  }
}

