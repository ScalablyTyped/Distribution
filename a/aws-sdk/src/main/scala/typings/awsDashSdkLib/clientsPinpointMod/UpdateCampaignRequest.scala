package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCampaignRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string
  var WriteCampaignRequest: awsDashSdkLib.clientsPinpointMod.WriteCampaignRequest
}

object UpdateCampaignRequest {
  @scala.inline
  def apply(ApplicationId: __string, CampaignId: __string, WriteCampaignRequest: WriteCampaignRequest): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId, WriteCampaignRequest = WriteCampaignRequest)
  
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
}

