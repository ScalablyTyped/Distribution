package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCampaignRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: Arn
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  /**
    * The ARN of a new solution version to deploy.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}

object UpdateCampaignRequest {
  @scala.inline
  def apply(campaignArn: Arn, minProvisionedTPS: Int | Double = null, solutionVersionArn: Arn = null): UpdateCampaignRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn)
    if (minProvisionedTPS != null) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    __obj.asInstanceOf[UpdateCampaignRequest]
  }
}

