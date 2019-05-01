package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAction extends js.Object {
  /**
    * The unique identifier of the member to remove.
    */
  var MemberId: ResourceIdString
}

object RemoveAction {
  @scala.inline
  def apply(MemberId: ResourceIdString): RemoveAction = {
    val __obj = js.Dynamic.literal(MemberId = MemberId)
  
    __obj.asInstanceOf[RemoveAction]
  }
}

