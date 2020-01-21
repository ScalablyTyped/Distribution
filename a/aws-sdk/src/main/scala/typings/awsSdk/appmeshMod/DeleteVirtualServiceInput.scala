package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVirtualServiceInput extends js.Object {
  /**
    * The name of the service mesh to delete the virtual service in.
    */
  var meshName: ResourceName = js.native
  /**
    * The name of the virtual service to delete.
    */
  var virtualServiceName: ServiceName = js.native
}

object DeleteVirtualServiceInput {
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DeleteVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVirtualServiceInput]
  }
}

