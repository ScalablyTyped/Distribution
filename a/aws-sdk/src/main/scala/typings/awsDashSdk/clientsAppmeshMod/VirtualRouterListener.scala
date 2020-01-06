package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterListener extends js.Object {
  var portMapping: PortMapping = js.native
}

object VirtualRouterListener {
  @scala.inline
  def apply(portMapping: PortMapping): VirtualRouterListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterListener]
  }
}

