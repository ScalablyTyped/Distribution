package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignUpdateSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the campaign update was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * If a campaign update fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The date and time (in Unix time) that the campaign update was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Specifies the requested minimum provisioned transactions (recommendations) per second that Amazon Personalize will support.
    */
  var minProvisionedTPS: js.UndefOr[TransactionsPerSecond] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the deployed solution version.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the campaign update. A campaign update can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object CampaignUpdateSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    minProvisionedTPS: Int | Double = null,
    solutionVersionArn: Arn = null,
    status: Status = null
  ): CampaignUpdateSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (minProvisionedTPS != null) __obj.updateDynamic("minProvisionedTPS")(minProvisionedTPS.asInstanceOf[js.Any])
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CampaignUpdateSummary]
  }
}

