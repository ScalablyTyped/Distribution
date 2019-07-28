package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInputRequest extends js.Object {
  /**
    * Unique ID of the input
    */
  var InputId: __string
}

object DescribeInputRequest {
  @scala.inline
  def apply(InputId: __string): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId)
  
    __obj.asInstanceOf[DescribeInputRequest]
  }
}

