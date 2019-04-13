package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInsightRequest extends js.Object {
  /**
    * A collection of attributes that are applied to all active Security Hub-aggregated findings and that result in a subset of findings that are included in this insight.
    */
  var Filters: AwsSecurityFindingFilters
  /**
    * The attribute by which the insight's findings are grouped. This attribute is used as a findings aggregator for the purposes of viewing and managing multiple related findings under a single operand. 
    */
  var GroupByAttribute: NonEmptyString
  /**
    * The user-defined name that identifies the insight that you want to create.
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

