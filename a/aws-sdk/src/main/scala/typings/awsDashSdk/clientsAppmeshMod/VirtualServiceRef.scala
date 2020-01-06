package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual service.
    */
  var arn: Arn = js.native
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual service.
    */
  var virtualServiceName: ServiceName = js.native
}

object VirtualServiceRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualServiceName: ServiceName): VirtualServiceRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualServiceRef]
  }
}

