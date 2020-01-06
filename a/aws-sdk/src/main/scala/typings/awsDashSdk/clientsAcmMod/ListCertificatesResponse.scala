package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResponse extends js.Object {
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[typings.awsDashSdk.clientsAcmMod.CertificateSummaryList] = js.native
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAcmMod.NextToken] = js.native
}

object ListCertificatesResponse {
  @scala.inline
  def apply(CertificateSummaryList: CertificateSummaryList = null, NextToken: NextToken = null): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateSummaryList != null) __obj.updateDynamic("CertificateSummaryList")(CertificateSummaryList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesResponse]
  }
}

