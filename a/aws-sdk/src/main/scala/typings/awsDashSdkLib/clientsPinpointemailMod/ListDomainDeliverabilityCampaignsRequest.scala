package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainDeliverabilityCampaignsRequest extends js.Object {
  /**
    * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less than or equal to 30 days after the value of the StartDate parameter.
    */
  var EndDate: Timestamp
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of a campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The maximum number of results to include in response to a single call to the ListDomainDeliverabilityCampaigns operation. If the number of results is larger than the number that you specify in this parameter, the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
  /**
    * The first day, in Unix time format, that you want to obtain deliverability data for.
    */
  var StartDate: Timestamp
  /**
    * The domain to obtain deliverability data for.
    */
  var SubscribedDomain: Domain
}

object ListDomainDeliverabilityCampaignsRequest {
  @scala.inline
  def apply(
    EndDate: Timestamp,
    StartDate: Timestamp,
    SubscribedDomain: Domain,
    NextToken: NextToken = null,
    PageSize: js.UndefOr[MaxItems] = js.undefined
  ): ListDomainDeliverabilityCampaignsRequest = {
    val __obj = js.Dynamic.literal(EndDate = EndDate, StartDate = StartDate, SubscribedDomain = SubscribedDomain)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(PageSize)) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
  }
}

