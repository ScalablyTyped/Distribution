package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSitesResponse extends js.Object {
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The sites.
    */
  var Sites: js.UndefOr[SiteList] = js.native
}

object GetSitesResponse {
  @scala.inline
  def apply(NextToken: String = null, Sites: SiteList = null): GetSitesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sites != null) __obj.updateDynamic("Sites")(Sites.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSitesResponse]
  }
}

