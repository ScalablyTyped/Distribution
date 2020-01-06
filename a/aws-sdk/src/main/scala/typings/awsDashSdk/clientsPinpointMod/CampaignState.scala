package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CampaignState extends js.Object {
  /**
    * The current status of the campaign, or the current status of a treatment that belongs to an A/B test campaign. If a campaign uses A/B testing, the campaign has a status of COMPLETED only if all campaign treatments have a status of COMPLETED.
    */
  var CampaignStatus: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.CampaignStatus] = js.native
}

object CampaignState {
  @scala.inline
  def apply(CampaignStatus: CampaignStatus = null): CampaignState = {
    val __obj = js.Dynamic.literal()
    if (CampaignStatus != null) __obj.updateDynamic("CampaignStatus")(CampaignStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignState]
  }
}

