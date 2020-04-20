package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeStatus extends js.Object {
  /**
    * The current status of the virtual node.
    */
  var status: VirtualNodeStatusCode = js.native
}

object VirtualNodeStatus {
  @scala.inline
  def apply(status: VirtualNodeStatusCode): VirtualNodeStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeStatus]
  }
}

