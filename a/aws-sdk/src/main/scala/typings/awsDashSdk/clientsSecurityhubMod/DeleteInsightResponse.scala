package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInsightResponse extends js.Object {
  /**
    * The ARN of the insight that was deleted.
    */
  var InsightArn: NonEmptyString
}

object DeleteInsightResponse {
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn)
  
    __obj.asInstanceOf[DeleteInsightResponse]
  }
}

