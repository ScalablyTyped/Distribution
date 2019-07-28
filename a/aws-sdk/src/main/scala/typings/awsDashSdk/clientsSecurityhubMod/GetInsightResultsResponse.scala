package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInsightResultsResponse extends js.Object {
  /**
    * The insight results returned by the operation.
    */
  var InsightResults: typings.awsDashSdk.clientsSecurityhubMod.InsightResults
}

object GetInsightResultsResponse {
  @scala.inline
  def apply(InsightResults: InsightResults): GetInsightResultsResponse = {
    val __obj = js.Dynamic.literal(InsightResults = InsightResults)
  
    __obj.asInstanceOf[GetInsightResultsResponse]
  }
}

