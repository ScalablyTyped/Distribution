package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerTlsCertificateRenewalSummary extends js.Object {
  /**
    * Contains information about the validation of each domain name in the certificate, as it pertains to Lightsail's managed renewal. This is different from the initial validation that occurs as a result of the RequestCertificate request.
    */
  var domainValidationOptions: js.UndefOr[LoadBalancerTlsCertificateDomainValidationOptionList] = js.undefined
  /**
    * The status of Lightsail's managed renewal of the certificate. Valid values are listed below.
    */
  var renewalStatus: js.UndefOr[LoadBalancerTlsCertificateRenewalStatus] = js.undefined
}

object LoadBalancerTlsCertificateRenewalSummary {
  @scala.inline
  def apply(
    domainValidationOptions: LoadBalancerTlsCertificateDomainValidationOptionList = null,
    renewalStatus: LoadBalancerTlsCertificateRenewalStatus = null
  ): LoadBalancerTlsCertificateRenewalSummary = {
    val __obj = js.Dynamic.literal()
    if (domainValidationOptions != null) __obj.updateDynamic("domainValidationOptions")(domainValidationOptions)
    if (renewalStatus != null) __obj.updateDynamic("renewalStatus")(renewalStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerTlsCertificateRenewalSummary]
  }
}

