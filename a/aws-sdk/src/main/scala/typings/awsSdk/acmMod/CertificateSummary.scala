package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateSummary extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the certificate. This is of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  /**
    * Fully qualified domain name (FQDN), such as www.example.com or example.com, for the certificate.
    */
  var DomainName: js.UndefOr[DomainNameString] = js.native
}

object CertificateSummary {
  @scala.inline
  def apply(CertificateArn: Arn = null, DomainName: DomainNameString = null): CertificateSummary = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateSummary]
  }
}

