package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceRef extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the virtual service.
    */
  var arn: Arn
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual service.
    */
  var virtualServiceName: ServiceName
}

object VirtualServiceRef {
  @scala.inline
  def apply(arn: Arn, meshName: ResourceName, virtualServiceName: ServiceName): VirtualServiceRef = {
    val __obj = js.Dynamic.literal(arn = arn, meshName = meshName, virtualServiceName = virtualServiceName)
  
    __obj.asInstanceOf[VirtualServiceRef]
  }
}

