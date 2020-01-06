package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStackSummaryRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object DescribeStackSummaryRequest {
  @scala.inline
  def apply(StackId: String): DescribeStackSummaryRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStackSummaryRequest]
  }
}

