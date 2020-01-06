package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAction extends js.Object {
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString = js.native
}

object RemoveAction {
  @scala.inline
  def apply(MemberId: ResourceIdString): RemoveAction = {
    val __obj = js.Dynamic.literal(MemberId = MemberId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAction]
  }
}

