package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInsightResultsRequest extends js.Object {
  /**
    * The ARN of the insight whose results you want to see.
    */
  var InsightArn: NonEmptyString = js.native
}

object GetInsightResultsRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): GetInsightResultsRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInsightResultsRequest]
  }
}

