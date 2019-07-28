package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualRouterRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual router.
    */
  var arn: Arn
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName
}

object VirtualRouterRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualRouterName: ResourceName): VirtualRouterRef = {
    val __obj = js.Dynamic.literal(arn = arn, meshName = meshName, virtualRouterName = virtualRouterName)
  
    __obj.asInstanceOf[VirtualRouterRef]
  }
}

