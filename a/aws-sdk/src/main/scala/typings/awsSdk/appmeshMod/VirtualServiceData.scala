package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceData extends js.Object {
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName = js.native
  var metadata: ResourceMetadata = js.native
  /**
    * The specifications of the virtual service.
    */
  var spec: VirtualServiceSpec = js.native
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatus = js.native
  /**
    * The name of the virtual service.
    */
  var virtualServiceName: ServiceName = js.native
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
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceData]
  }
}

