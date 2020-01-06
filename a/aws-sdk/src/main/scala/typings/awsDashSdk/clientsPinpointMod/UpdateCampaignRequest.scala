package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCampaignRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string = js.native
  var WriteCampaignRequest: typings.awsDashSdk.clientsPinpointMod.WriteCampaignRequest = js.native
}

object UpdateCampaignRequest {
  @scala.inline
  def apply(ApplicationId: __string, CampaignId: __string, WriteCampaignRequest: WriteCampaignRequest): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], CampaignId = CampaignId.asInstanceOf[js.Any], WriteCampaignRequest = WriteCampaignRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
}

