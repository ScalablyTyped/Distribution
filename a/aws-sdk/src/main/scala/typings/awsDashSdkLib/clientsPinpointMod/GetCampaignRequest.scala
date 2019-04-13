package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the campaign.
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

