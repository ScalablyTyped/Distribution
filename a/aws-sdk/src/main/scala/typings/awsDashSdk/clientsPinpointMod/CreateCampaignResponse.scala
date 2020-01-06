package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCampaignResponse extends js.Object {
  var CampaignResponse: typings.awsDashSdk.clientsPinpointMod.CampaignResponse = js.native
}

object CreateCampaignResponse {
  @scala.inline
  def apply(CampaignResponse: CampaignResponse): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCampaignResponse]
  }
}

