package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInsightRequest extends js.Object {
  /**
    * One or more attributes used to filter the findings included in the insight. Only findings that match the criteria defined in the filters are included in the insight.
    */
  var Filters: AwsSecurityFindingFilters
  /**
    * The attribute used as the aggregator to group related findings for the insight.
    */
  var GroupByAttribute: NonEmptyString
  /**
    * The name of the custom insight to create.
    */
  var Name: NonEmptyString
}

object CreateInsightRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters, GroupByAttribute: NonEmptyString, Name: NonEmptyString): CreateInsightRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters, GroupByAttribute = GroupByAttribute, Name = Name)
  
    __obj.asInstanceOf[CreateInsightRequest]
  }
}

