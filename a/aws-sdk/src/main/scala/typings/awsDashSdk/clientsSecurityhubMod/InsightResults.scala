package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightResults extends js.Object {
  /**
    * The attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttribute: NonEmptyString = js.native
  /**
    * The ARN of the insight whose results are returned by the GetInsightResults operation.
    */
  var InsightArn: NonEmptyString = js.native
  /**
    * The list of insight result values returned by the GetInsightResults operation.
    */
  var ResultValues: InsightResultValueList = js.native
}

object InsightResults {
  @scala.inline
  def apply(GroupByAttribute: NonEmptyString, InsightArn: NonEmptyString, ResultValues: InsightResultValueList): InsightResults = {
    val __obj = js.Dynamic.literal(GroupByAttribute = GroupByAttribute.asInstanceOf[js.Any], InsightArn = InsightArn.asInstanceOf[js.Any], ResultValues = ResultValues.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InsightResults]
  }
}

