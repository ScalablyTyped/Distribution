package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebsiteAuthorizationProvidersResponse extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.NextToken] = js.undefined
  /**
    * The website authorization providers.
    */
  var WebsiteAuthorizationProviders: js.UndefOr[WebsiteAuthorizationProvidersSummaryList] = js.undefined
}

object ListWebsiteAuthorizationProvidersResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    WebsiteAuthorizationProviders: WebsiteAuthorizationProvidersSummaryList = null
  ): ListWebsiteAuthorizationProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WebsiteAuthorizationProviders != null) __obj.updateDynamic("WebsiteAuthorizationProviders")(WebsiteAuthorizationProviders)
    __obj.asInstanceOf[ListWebsiteAuthorizationProvidersResponse]
  }
}

