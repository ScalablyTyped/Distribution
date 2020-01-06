package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Campaign extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign. 
    */
  var campaignArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.native
  /**
    * The date and time (in Unix format) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  var latestCampaignUpdate: js.UndefOr[CampaignUpdateSummary] = js.native
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.native
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of a specific version of the solution.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.native
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}

object Campaign {
  @scala.inline
  def apply(
    campaignArn: Arn = null,
    creationDateTime: _Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    latestCampaignUpdate: CampaignUpdateSummary = null,
    minProvisionedTPS: Int | Double = null,
    name: Name = null,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): Campaign = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (latestCampaignUpdate != null) __obj.updateDynamic("latestCampaignUpdate")(latestCampaignUpdate.asInstanceOf[js.Any])
    if (minProvisionedTPS != null) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Campaign]
  }
}

