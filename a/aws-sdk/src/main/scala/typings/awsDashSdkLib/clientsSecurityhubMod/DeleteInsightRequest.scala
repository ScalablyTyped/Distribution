package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInsightRequest extends js.Object {
  /**
    * The ARN of the insight to delete.
    */
  var InsightArn: NonEmptyString
}

object DeleteInsightRequest {
  @scala.inline
  def apply(InsightArn: NonEmptyString): DeleteInsightRequest = {
    val __obj = js.Dynamic.literal(InsightArn = InsightArn)
  
    __obj.asInstanceOf[DeleteInsightRequest]
  }
}

