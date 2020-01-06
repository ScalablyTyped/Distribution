package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.NextToken] = js.native
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.native
}

object ListWebsiteCertificateAuthoritiesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, WebsiteCertificateAuthorities: WebsiteCaSummaryList = null): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WebsiteCertificateAuthorities != null) __obj.updateDynamic("WebsiteCertificateAuthorities")(WebsiteCertificateAuthorities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
}

