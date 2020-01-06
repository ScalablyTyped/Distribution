package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReportInput extends js.Object {
  /**
    *  The ARN of the report to delete. 
    */
  var arn: NonEmptyString = js.native
}

object DeleteReportInput {
  @scala.inline
  def apply(arn: NonEmptyString): DeleteReportInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReportInput]
  }
}

