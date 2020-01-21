package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificateAuthoritiesResponse extends js.Object {
  /**
    * Summary information about each certificate authority you have created.
    */
  var CertificateAuthorities: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthorities] = js.native
  /**
    * When the list is truncated, this value is present and should be used for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.native
}

object ListCertificateAuthoritiesResponse {
  @scala.inline
  def apply(CertificateAuthorities: CertificateAuthorities = null, NextToken: NextToken = null): ListCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorities != null) __obj.updateDynamic("CertificateAuthorities")(CertificateAuthorities.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificateAuthoritiesResponse]
  }
}

