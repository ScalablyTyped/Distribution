package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterServiceProvider extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: ResourceName
}

object VirtualRouterServiceProvider {
  @scala.inline
  def apply(virtualRouterName: ResourceName): VirtualRouterServiceProvider = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[VirtualRouterServiceProvider]
  }
}

