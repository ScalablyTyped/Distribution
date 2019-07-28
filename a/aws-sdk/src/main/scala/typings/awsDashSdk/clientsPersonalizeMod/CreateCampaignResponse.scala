package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCampaignResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
}

object CreateCampaignResponse {
  @scala.inline
  def apply(campaignArn: Arn = null): CreateCampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn)
    __obj.asInstanceOf[CreateCampaignResponse]
  }
}

