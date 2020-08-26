package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPermissionsRequest extends js.Object {
  /**
    * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the ListCertificateAuthorities action. This must be of the form: arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 You can get a private CA's ARN by running the ListCertificateAuthorities action.
    */
  var CertificateAuthorityArn: Arn = js.native
  /**
    * When paginating results, use this parameter to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.acmpcaMod.MaxResults] = js.native
  /**
    * When paginating results, use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.native
}

object ListPermissionsRequest {
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsRequest]
  }
  @scala.inline
  implicit class ListPermissionsRequestOps[Self <: ListPermissionsRequest] (val x: Self) extends AnyVal {
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
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

