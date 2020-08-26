package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesResponse extends js.Object {
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[typings.awsSdk.acmMod.CertificateSummaryList] = js.native
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmMod.NextToken] = js.native
}

object ListCertificatesResponse {
  @scala.inline
  def apply(): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  @scala.inline
  implicit class ListCertificatesResponseOps[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateSummaryListVarargs(value: CertificateSummary*): Self = this.set("CertificateSummaryList", js.Array(value :_*))
    @scala.inline
    def setCertificateSummaryList(value: CertificateSummaryList): Self = this.set("CertificateSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateSummaryList: Self = this.set("CertificateSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

