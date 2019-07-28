package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInsightRequest extends js.Object {
  /**
    * The updated filters that define this insight.
    */
  var Filters: js.UndefOr[AwsSecurityFindingFilters] = js.undefined
  /**
    * The updated GroupBy attribute that defines this insight.
    */
  var GroupByAttribute: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The ARN of the insight that you want to update.
    */
  var InsightArn: NonEmptyString
  /**
    * The updated name for the insight.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}

object UpdateInsightRequest {
  @scala.inline
  def apply(
    InsightArn: NonEmptyString,
    Filters: AwsSecurityFindingFilters = null,
    GroupByAttribute: NonEmptyString = null,
    Name: NonEmptyString = null
  ): UpdateInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (GroupByAttribute != null) __obj.updateDynamic("GroupByAttribute")(GroupByAttribute)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateInsightRequest]
  }
}

