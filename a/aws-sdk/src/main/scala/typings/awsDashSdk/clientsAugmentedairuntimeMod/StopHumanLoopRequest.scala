package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop you want to stop.
    */
  var HumanLoopName: typings.awsDashSdk.clientsAugmentedairuntimeMod.HumanLoopName = js.native
}

object StopHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): StopHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopHumanLoopRequest]
  }
}

