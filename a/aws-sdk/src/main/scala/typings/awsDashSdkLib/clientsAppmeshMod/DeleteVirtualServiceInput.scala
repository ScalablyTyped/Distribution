package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual service in.
    */
  var meshName: ResourceName
  /**
    * The name of the virtual service to delete.
    */
  var virtualServiceName: ServiceName
}

object DeleteVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DeleteVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName, virtualServiceName = virtualServiceName)
  
    __obj.asInstanceOf[DeleteVirtualServiceInput]
  }
}

