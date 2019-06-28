package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignState extends js.Object {
  /**
    * The status of the campaign, or the status of a treatment that belongs to an A/B test campaign. If a campaign uses A/B testing, the campaign has a status of COMPLETED only when all campaign treatments have a status of COMPLETED.
    */
  var CampaignStatus: js.UndefOr[CampaignStatus] = js.undefined
}

object CampaignState {
  @scala.inline
  def apply(CampaignStatus: CampaignStatus = null): CampaignState = {
    val __obj = js.Dynamic.literal()
    if (CampaignStatus != null) __obj.updateDynamic("CampaignStatus")(CampaignStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignState]
  }
}

