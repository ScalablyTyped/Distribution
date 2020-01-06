package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightResultsResponse extends js.Object {
  /**
    * The insight results returned by the operation.
    */
  var InsightResults: typings.awsDashSdk.clientsSecurityhubMod.InsightResults = js.native
}

object GetInsightResultsResponse {
  @scala.inline
  def apply(InsightResults: InsightResults): GetInsightResultsResponse = {
    val __obj = js.Dynamic.literal(InsightResults = InsightResults.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInsightResultsResponse]
  }
}

