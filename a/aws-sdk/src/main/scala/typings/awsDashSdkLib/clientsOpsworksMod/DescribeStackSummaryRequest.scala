package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSummaryRequest extends js.Object {
  /**
    * The stack ID.
    */
  var StackId: String
}

object DescribeStackSummaryRequest {
  @scala.inline
  def apply(StackId: String): DescribeStackSummaryRequest = {
    val __obj = js.Dynamic.literal(StackId = StackId)
  
    __obj.asInstanceOf[DescribeStackSummaryRequest]
  }
}

