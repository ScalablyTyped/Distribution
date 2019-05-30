package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInsightResponse extends js.Object {
  /**
    * The ARN of the insight created.
    */
  var InsightArn: NonEmptyString
}

object CreateInsightResponse {
  @scala.inline
  def apply(InsightArn: NonEmptyString): CreateInsightResponse = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn)
  
    __obj.asInstanceOf[CreateInsightResponse]
  }
}

