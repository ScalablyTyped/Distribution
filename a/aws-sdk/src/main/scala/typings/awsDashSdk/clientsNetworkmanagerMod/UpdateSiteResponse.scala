package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSiteResponse extends js.Object {
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.Site] = js.native
}

object UpdateSiteResponse {
  @scala.inline
  def apply(Site: Site = null): UpdateSiteResponse = {
    val __obj = js.Dynamic.literal()
    if (Site != null) __obj.updateDynamic("Site")(Site.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteResponse]
  }
}

