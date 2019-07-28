package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualServiceData extends js.Object {
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName
  var metadata: ResourceMetadata
  /**
    * The specifications of the virtual service.
    */
  var spec: VirtualServiceSpec
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatus
  /**
    * The name of the virtual service.
    */
  var virtualServiceName: ServiceName
}

object VirtualServiceData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualServiceSpec,
    status: VirtualServiceStatus,
    virtualServiceName: ServiceName
  ): VirtualServiceData = {
    val __obj = js.Dynamic.literal(meshName = meshName, metadata = metadata, spec = spec, status = status, virtualServiceName = virtualServiceName)
  
    __obj.asInstanceOf[VirtualServiceData]
  }
}

