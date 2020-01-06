package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop.
    */
  var HumanLoopName: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopName = js.native
}

object DescribeHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DescribeHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeHumanLoopRequest]
  }
}

