package typings.awsDashSdk.clientsAcmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificateAuthoritiesResponse extends js.Object {
  /**
    * Summary information about each certificate authority you have created.
    */
  var CertificateAuthorities: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.CertificateAuthorities] = js.undefined
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAcmpcaMod.NextToken] = js.undefined
}

object ListCertificateAuthoritiesResponse {
  @scala.inline
  def apply(CertificateAuthorities: CertificateAuthorities = null, NextToken: NextToken = null): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorities != null) __obj.updateDynamic("CertificateAuthorities")(CertificateAuthorities)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
}

