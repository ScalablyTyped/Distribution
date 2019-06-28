package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string
}

object GetCampaignRequest {
  @scala.inline
  def apply(ApplicationId: __string, CampaignId: __string): GetCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId)
  
    __obj.asInstanceOf[GetCampaignRequest]
  }
}

