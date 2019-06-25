package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insight extends js.Object {
  /**
    * One or more attributes used to filter the findings included in the insight. Only findings that match the criteria defined in the filters are included in the insight.
    */
  var Filters: AwsSecurityFindingFilters
  /**
    * The attribute that the insight's findings are grouped by. This attribute is used as a findings aggregator for the purposes of viewing and managing multiple related findings under a single operand.
    */
  var GroupByAttribute: NonEmptyString
  /**
    * The ARN of a Security Hub insight.
    */
  var InsightArn: NonEmptyString
  /**
    * The name of a Security Hub insight.
    */
  var Name: NonEmptyString
}

object Insight {
  @scala.inline
  def apply(
    Filters: AwsSecurityFindingFilters,
    GroupByAttribute: NonEmptyString,
    InsightArn: NonEmptyString,
    Name: NonEmptyString
  ): Insight = {
    val __obj = js.Dynamic.literal(Filters = Filters, GroupByAttribute = GroupByAttribute, InsightArn = InsightArn, Name = Name)
  
    __obj.asInstanceOf[Insight]
  }
}

