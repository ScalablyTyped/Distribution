package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainDeliverabilityCampaignRequest extends js.Object {
  /**
    * The unique identifier for the campaign. The Deliverability dashboard automatically generates and assigns this identifier to a campaign.
    */
  var CampaignId: typings.awsDashSdk.clientsSesv2Mod.CampaignId = js.native
}

object GetDomainDeliverabilityCampaignRequest {
  @scala.inline
  def apply(CampaignId: CampaignId): GetDomainDeliverabilityCampaignRequest = {
    val __obj = js.Dynamic.literal(CampaignId = CampaignId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
  }
}

