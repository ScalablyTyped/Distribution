package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Campaign extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign. 
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
  /**
    * The date and time (in Unix format) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The date and time (in Unix format) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.undefined
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of a specific version of the solution.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object Campaign {
  @scala.inline
  def apply(
    campaignArn: Arn = null,
    creationDateTime: _Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    latestCampaignUpdate: CampaignUpdateSummary = null,
    minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined,
    name: Name = null,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (latestCampaignUpdate != null) __obj.updateDynamic("latestCampaignUpdate")(latestCampaignUpdate)
    if (!js.isUndefined(minProvisionedTPS)) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS)
    if (name != null) __obj.updateDynamic("name")(name)
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Campaign]
  }
}

