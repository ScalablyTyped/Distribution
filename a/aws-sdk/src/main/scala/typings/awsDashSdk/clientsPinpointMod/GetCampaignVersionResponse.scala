package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignVersionResponse extends js.Object {
  var CampaignResponse: typings.awsDashSdk.clientsPinpointMod.CampaignResponse = js.native
}

object GetCampaignVersionResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
}

