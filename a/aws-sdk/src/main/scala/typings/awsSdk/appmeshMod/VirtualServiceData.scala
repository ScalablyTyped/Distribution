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
  @scala.inline
  implicit class VirtualServiceDataOps[Self <: VirtualServiceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeshName(value: ResourceName): Self = this.set("meshName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpec(value: VirtualServiceSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: VirtualServiceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualServiceName(value: ServiceName): Self = this.set("virtualServiceName", value.asInstanceOf[js.Any])
  }
  
}

