package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeServiceProvider extends js.Object {
  /**
    * The name of the virtual node that is acting as a service provider.
    */
  var virtualNodeName: ResourceName = js.native
}

object VirtualNodeServiceProvider {
  @scala.inline
  def apply(virtualNodeName: ResourceName): VirtualNodeServiceProvider = {
    val __obj = js.Dynamic.literal(virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeServiceProvider]
  }
}

