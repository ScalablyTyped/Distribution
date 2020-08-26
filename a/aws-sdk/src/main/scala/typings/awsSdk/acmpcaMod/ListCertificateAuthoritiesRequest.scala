package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCertificateAuthoritiesRequest extends js.Object {
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response on each page. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.acmpcaMod.MaxResults] = js.native
  /**
    * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of the NextToken parameter from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.acmpcaMod.NextToken] = js.native
}

object ListCertificateAuthoritiesRequest {
  @scala.inline
  def apply(): ListCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesRequest]
  }
  @scala.inline
  implicit class ListCertificateAuthoritiesRequestOps[Self <: ListCertificateAuthoritiesRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

