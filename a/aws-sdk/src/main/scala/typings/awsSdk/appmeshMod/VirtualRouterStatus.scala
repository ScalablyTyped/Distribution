package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterStatus extends js.Object {
  /**
    * The current status of the virtual router.
    */
  var status: VirtualRouterStatusCode = js.native
}

object VirtualRouterStatus {
  @scala.inline
  def apply(status: VirtualRouterStatusCode): VirtualRouterStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterStatus]
  }
}

