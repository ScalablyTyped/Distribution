package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignVersionsResponse extends js.Object {
  var CampaignsResponse: typings.awsDashSdk.clientsPinpointMod.CampaignsResponse = js.native
}

object GetCampaignVersionsResponse {
  @scala.inline
  def apply(CampaignsResponse: CampaignsResponse): GetCampaignVersionsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignVersionsResponse]
  }
}

