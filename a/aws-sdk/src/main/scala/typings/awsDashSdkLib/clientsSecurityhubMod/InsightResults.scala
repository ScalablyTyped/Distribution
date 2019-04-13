package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsightResults extends js.Object {
  /**
    * The attribute by which the findings are grouped for the insight's whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttribute: NonEmptyString
  /**
    * The ARN of the insight whose results are returned by the GetInsightResults operation.
    */
  var InsightArn: NonEmptyString
  /**
    * The list of insight result values returned by the GetInsightResults operation.
    */
  var ResultValues: InsightResultValueList
}

object InsightResults {
  @scala.inline
  def apply(GroupByAttribute: NonEmptyString, InsightArn: NonEmptyString, ResultValues: InsightResultValueList): InsightResults = {
    val __obj = js.Dynamic.literal(GroupByAttribute = GroupByAttribute, InsightArn = InsightArn, ResultValues = ResultValues)
  
    __obj.asInstanceOf[InsightResults]
  }
}

