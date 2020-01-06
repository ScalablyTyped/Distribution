package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualRouterRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual router.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName = js.native
}

object VirtualRouterRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualRouterName: ResourceName): VirtualRouterRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualRouterRef]
  }
}

