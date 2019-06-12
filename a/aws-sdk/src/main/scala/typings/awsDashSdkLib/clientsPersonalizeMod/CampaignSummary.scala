package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var campaignArn: js.UndefOr[Arn] = js.undefined
  /**
    * The date and time (in Unix time) that the campaign was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * If a campaign fails, the reason behind the failure.
    */
  var failureReason: js.UndefOr[FailureReason] = js.undefined
  /**
    * The date and time (in Unix time) that the campaign was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the campaign.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The status of the campaign. A campaign can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}

object CampaignSummary {
  @scala.inline
  def apply(
    campaignArn: Arn = null,
    creationDateTime: _Date = null,
    failureReason: FailureReason = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    status: Status = null
  ): CampaignSummary = {
    val __obj = js.Dynamic.literal()
    if (campaignArn != null) __obj.updateDynamic("campaignArn")(campaignArn)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[CampaignSummary]
  }
}

