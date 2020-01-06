package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContributorInsightsOutput extends js.Object {
  /**
    * List of names of the associated Alpine rules.
    */
  var ContributorInsightsRuleList: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ContributorInsightsRuleList] = js.native
  /**
    * Current Status contributor insights.
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.ContributorInsightsStatus] = js.native
  /**
    * Returns information about the last failure that encountered. The most common exceptions for a FAILED status are:   LimitExceededException - Per-account Amazon CloudWatch Contributor Insights rule limit reached. Please disable Contributor Insights for other tables/indexes OR disable Contributor Insights rules before retrying.   AccessDeniedException - Amazon CloudWatch Contributor Insights rules cannot be modified due to insufficient permissions.   AccessDeniedException - Failed to create service-linked role for Contributor Insights due to insufficient permissions.   InternalServerError - Failed to create Amazon CloudWatch Contributor Insights rules. Please retry request.  
    */
  var FailureException: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.FailureException] = js.native
  /**
    * The name of the global secondary index being described.
    */
  var IndexName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.IndexName] = js.native
  /**
    * Timestamp of the last time the status was changed.
    */
  var LastUpdateDateTime: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.LastUpdateDateTime] = js.native
  /**
    * The name of the table being described.
    */
  var TableName: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableName] = js.native
}

object DescribeContributorInsightsOutput {
  @scala.inline
  def apply(
    ContributorInsightsRuleList: ContributorInsightsRuleList = null,
    ContributorInsightsStatus: ContributorInsightsStatus = null,
    FailureException: FailureException = null,
    IndexName: IndexName = null,
    LastUpdateDateTime: LastUpdateDateTime = null,
    TableName: TableName = null
  ): DescribeContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    if (ContributorInsightsRuleList != null) __obj.updateDynamic("ContributorInsightsRuleList")(ContributorInsightsRuleList.asInstanceOf[js.Any])
    if (ContributorInsightsStatus != null) __obj.updateDynamic("ContributorInsightsStatus")(ContributorInsightsStatus.asInstanceOf[js.Any])
    if (FailureException != null) __obj.updateDynamic("FailureException")(FailureException.asInstanceOf[js.Any])
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (LastUpdateDateTime != null) __obj.updateDynamic("LastUpdateDateTime")(LastUpdateDateTime.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContributorInsightsOutput]
  }
}

