package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCampaignRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var WriteCampaignRequest: typings.awsDashSdk.clientsPinpointMod.WriteCampaignRequest
}

object CreateCampaignRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteCampaignRequest: WriteCampaignRequest): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteCampaignRequest = WriteCampaignRequest)
  
    __obj.asInstanceOf[CreateCampaignRequest]
  }
}

