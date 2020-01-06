package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInsightResponse extends js.Object {
  /**
    * The ARN of the insight created.
    */
  var InsightArn: NonEmptyString = js.native
}

object CreateInsightResponse {
  @scala.inline
  def apply(InsightArn: NonEmptyString): CreateInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateInsightResponse]
  }
}

