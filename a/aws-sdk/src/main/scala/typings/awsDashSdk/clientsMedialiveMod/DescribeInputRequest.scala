package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInputRequest extends js.Object {
  /**
    * Unique ID of the input
    */
  var InputId: __string = js.native
}

object DescribeInputRequest {
  @scala.inline
  def apply(InputId: __string): DescribeInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeInputRequest]
  }
}

