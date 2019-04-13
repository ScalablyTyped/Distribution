package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightResultValue extends js.Object {
  /**
    * The number of findings returned for each GroupByAttributeValue.
    */
  var Count: Integer
  /**
    * The value of the attribute by which the findings are grouped for the insight's whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttributeValue: NonEmptyString
}

object InsightResultValue {
  @scala.inline
  def apply(Count: Integer, GroupByAttributeValue: NonEmptyString): InsightResultValue = {
    val __obj = js.Dynamic.literal(Count = Count, GroupByAttributeValue = GroupByAttributeValue)
  
    __obj.asInstanceOf[InsightResultValue]
  }
}

