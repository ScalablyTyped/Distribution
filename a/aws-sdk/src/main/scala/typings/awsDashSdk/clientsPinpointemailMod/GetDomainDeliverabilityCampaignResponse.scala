package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainDeliverabilityCampaignResponse extends js.Object {
  /**
    * An object that contains the deliverability data for the campaign.
    */
  var DomainDeliverabilityCampaign: typings.awsDashSdk.clientsPinpointemailMod.DomainDeliverabilityCampaign
}

object GetDomainDeliverabilityCampaignResponse {
  @scala.inline
  def apply(DomainDeliverabilityCampaign: DomainDeliverabilityCampaign): GetDomainDeliverabilityCampaignResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaign = DomainDeliverabilityCampaign)
  
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
  }
}

