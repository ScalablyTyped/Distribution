package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainDeliverabilityCampaignsResponse extends js.Object {
  /**
    * An array of responses, one for each campaign that used the domain to send email during the specified time range.
    */
  var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of the campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPinpointemailMod.NextToken] = js.undefined
}

object ListDomainDeliverabilityCampaignsResponse {
  @scala.inline
  def apply(DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList, NextToken: NextToken = null): ListDomainDeliverabilityCampaignsResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaigns = DomainDeliverabilityCampaigns)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
  }
}

