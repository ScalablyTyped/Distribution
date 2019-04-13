package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCampaignRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var WriteCampaignRequest: awsDashSdkLib.clientsPinpointMod.WriteCampaignRequest
}

object CreateCampaignRequest {
  @scala.inline
  def apply(ApplicationId: __string, WriteCampaignRequest: WriteCampaignRequest): CreateCampaignRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, WriteCampaignRequest = WriteCampaignRequest)
  
    __obj.asInstanceOf[CreateCampaignRequest]
  }
}

