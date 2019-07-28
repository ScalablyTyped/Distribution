package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebsiteCertificateAuthoritiesResponse extends js.Object {
  /**
    * The pagination token used to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.NextToken] = js.undefined
  /**
    * Information about the certificates.
    */
  var WebsiteCertificateAuthorities: js.UndefOr[WebsiteCaSummaryList] = js.undefined
}

object ListWebsiteCertificateAuthoritiesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, WebsiteCertificateAuthorities: WebsiteCaSummaryList = null): ListWebsiteCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WebsiteCertificateAuthorities != null) __obj.updateDynamic("WebsiteCertificateAuthorities")(WebsiteCertificateAuthorities)
    __obj.asInstanceOf[ListWebsiteCertificateAuthoritiesResponse]
  }
}

