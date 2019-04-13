package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterSpec extends js.Object {
  /**
    * The listeners that the virtual router is expected to receive inbound traffic from. Currently only one listener is supported per virtual router.
    */
  var listeners: VirtualRouterListeners
}

object VirtualRouterSpec {
  @scala.inline
  def apply(listeners: VirtualRouterListeners): VirtualRouterSpec = {
    val __obj = js.Dynamic.literal(listeners = listeners)
  
    __obj.asInstanceOf[VirtualRouterSpec]
  }
}

