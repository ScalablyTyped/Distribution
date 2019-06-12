package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn
}

object DescribeCampaignRequest {
  @scala.inline
  def apply(campaignArn: Arn): DescribeCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn)
  
    __obj.asInstanceOf[DescribeCampaignRequest]
  }
}

