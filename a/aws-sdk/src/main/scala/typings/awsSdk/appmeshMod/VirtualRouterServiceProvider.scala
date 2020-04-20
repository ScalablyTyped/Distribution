package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterServiceProvider extends js.Object {
  /**
    * The name of the virtual router that is acting as a service provider.
    */
  var virtualRouterName: ResourceName = js.native
}

object VirtualRouterServiceProvider {
  @scala.inline
  def apply(virtualRouterName: ResourceName): VirtualRouterServiceProvider = {
    val __obj = js.Dynamic.literal(virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterServiceProvider]
  }
}

