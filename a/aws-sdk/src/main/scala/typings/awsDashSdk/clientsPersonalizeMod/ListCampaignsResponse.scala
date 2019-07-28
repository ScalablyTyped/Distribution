package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCampaignsResponse extends js.Object {
  /**
    * A list of the campaigns.
    */
  var campaigns: js.UndefOr[Campaigns] = js.undefined
  /**
    * A token for getting the next set of campaigns (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCampaignsResponse {
  @scala.inline
  def apply(campaigns: Campaigns = null, nextToken: NextToken = null): ListCampaignsResponse = {
    val __obj = js.Dynamic.literal()
    if (campaigns != null) __obj.updateDynamic("campaigns")(campaigns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListCampaignsResponse]
  }
}

