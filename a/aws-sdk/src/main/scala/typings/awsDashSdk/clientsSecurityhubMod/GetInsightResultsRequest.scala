package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInsightResultsRequest extends js.Object {
  /**
    * The ARN of the insight whose results you want to see.
    */
  var InsightArn: NonEmptyString
}

object GetInsightResultsRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): GetInsightResultsRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn)
  
    __obj.asInstanceOf[GetInsightResultsRequest]
  }
}

