package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop that you want to stop.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object StopHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): StopHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopHumanLoopRequest]
  }
}

