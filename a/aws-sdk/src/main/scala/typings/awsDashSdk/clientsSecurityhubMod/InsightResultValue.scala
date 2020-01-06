package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightResultValue extends js.Object {
  /**
    * The number of findings returned for each GroupByAttributeValue.
    */
  var Count: Integer = js.native
  /**
    * The value of the attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttributeValue: NonEmptyString = js.native
}

object InsightResultValue {
  @scala.inline
  def apply(Count: Integer, GroupByAttributeValue: NonEmptyString): InsightResultValue = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GroupByAttributeValue = GroupByAttributeValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightResultValue]
  }
}

