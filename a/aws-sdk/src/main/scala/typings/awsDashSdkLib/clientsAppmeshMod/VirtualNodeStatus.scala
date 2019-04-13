package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeStatus extends js.Object {
  /**
    * The current status of the virtual node.
    */
  var status: VirtualNodeStatusCode
}

object VirtualNodeStatus {
  @scala.inline
  def apply(status: VirtualNodeStatusCode): VirtualNodeStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeStatus]
  }
}

