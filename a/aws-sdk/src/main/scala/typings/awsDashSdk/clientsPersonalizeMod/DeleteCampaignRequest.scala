package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to delete.
    */
  var campaignArn: Arn
}

object DeleteCampaignRequest {
  @scala.inline
  def apply(campaignArn: Arn): DeleteCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn)
  
    __obj.asInstanceOf[DeleteCampaignRequest]
  }
}

