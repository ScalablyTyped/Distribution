package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignVersionRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign.
    */
  var CampaignId: __string
  /**
    * The unique version number (Version property) for the campaign version.
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

