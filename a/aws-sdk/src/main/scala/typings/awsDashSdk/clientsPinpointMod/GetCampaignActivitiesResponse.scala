package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignActivitiesResponse extends js.Object {
  var ActivitiesResponse: typings.awsDashSdk.clientsPinpointMod.ActivitiesResponse = js.native
}

object GetCampaignActivitiesResponse {
  @scala.inline
  def apply(ActivitiesResponse: ActivitiesResponse): GetCampaignActivitiesResponse = {
    val __obj = js.Dynamic.literal(ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignActivitiesResponse]
  }
}

