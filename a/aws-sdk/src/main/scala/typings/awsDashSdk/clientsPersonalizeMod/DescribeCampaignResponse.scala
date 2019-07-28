package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCampaignResponse extends js.Object {
  /**
    * The properties of the campaign.
    */
  var campaign: js.UndefOr[Campaign] = js.undefined
}

object DescribeCampaignResponse {
  @scala.inline
  def apply(campaign: Campaign = null): DescribeCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (campaign != null) __obj.updateDynamic("campaign")(campaign)
    __obj.asInstanceOf[DescribeCampaignResponse]
  }
}

