package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHumanLoopRequest extends js.Object {
  /**
    * The name of the human loop you want to delete.
    */
  var HumanLoopName: typings.awsSdk.augmentedairuntimeMod.HumanLoopName = js.native
}

object DeleteHumanLoopRequest {
  @scala.inline
  def apply(HumanLoopName: HumanLoopName): DeleteHumanLoopRequest = {
    val __obj = js.Dynamic.literal(HumanLoopName = HumanLoopName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHumanLoopRequest]
  }
}

