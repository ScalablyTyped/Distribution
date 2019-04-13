package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterListener extends js.Object {
  var portMapping: PortMapping
}

object VirtualRouterListener {
  @scala.inline
  def apply(portMapping: PortMapping): VirtualRouterListener = {
    val __obj = js.Dynamic.literal(portMapping = portMapping)
  
    __obj.asInstanceOf[VirtualRouterListener]
  }
}

