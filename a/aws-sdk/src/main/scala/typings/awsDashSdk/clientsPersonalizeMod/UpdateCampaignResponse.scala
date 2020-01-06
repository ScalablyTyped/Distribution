package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCampaignResponse extends js.Object {
  /**
    * The same campaign ARN as given in the request.
    */
  var campaignArn: js.UndefOr[Arn] = js.native
}

object UpdateCampaignResponse {
  @scala.inline
  def apply(campaignArn: Arn = null): UpdateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignResponse]
  }
}

