package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignVersionRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the campaign.
    */
  var CampaignId: __string
  /**
    * The version of the campaign.
    */
  var Version: __string
}

object GetCampaignVersionRequest {
  @scala.inline
  def apply(ApplicationId: __string, CampaignId: __string, Version: __string): GetCampaignVersionRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId, Version = Version)
  
    __obj.asInstanceOf[GetCampaignVersionRequest]
  }
}

