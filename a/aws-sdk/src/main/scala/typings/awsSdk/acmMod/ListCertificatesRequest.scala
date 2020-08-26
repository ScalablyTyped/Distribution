package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificatesRequest extends js.Object {
  /**
    * Filter the certificate list by status value.
    */
  var CertificateStatuses: js.UndefOr[typings.awsSdk.acmMod.CertificateStatuses] = js.native
  /**
    * Filter the certificate list. For more information, see the Filters structure.
    */
  var Includes: js.UndefOr[Filters] = js.native
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.acmMod.MaxItems] = js.native
  /**
    * Use this parameter only when paginating results and only in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmMod.NextToken] = js.native
}

object ListCertificatesRequest {
  @scala.inline
  def apply(): ListCertificatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificatesRequest]
  }
  @scala.inline
  implicit class ListCertificatesRequestOps[Self <: ListCertificatesRequest] (val x: Self) extends AnyVal {
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
    def setCertificateStatusesVarargs(value: CertificateStatus*): Self = this.set("CertificateStatuses", js.Array(value :_*))
    @scala.inline
    def setCertificateStatuses(value: CertificateStatuses): Self = this.set("CertificateStatuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateStatuses: Self = this.set("CertificateStatuses", js.undefined)
    @scala.inline
    def setIncludes(value: Filters): Self = this.set("Includes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludes: Self = this.set("Includes", js.undefined)
    @scala.inline
    def setMaxItems(value: MaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

