package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeData extends js.Object {
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName = js.native
  /**
    * The associated metadata for the virtual node.
    */
  var metadata: ResourceMetadata = js.native
  /**
    * The specifications of the virtual node.
    */
  var spec: VirtualNodeSpec = js.native
  /**
    * The current status for the virtual node.
    */
  var status: VirtualNodeStatus = js.native
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName = js.native
}

object VirtualNodeData {
  @scala.inline
  def apply(
    meshName: ResourceName,
    metadata: ResourceMetadata,
    spec: VirtualNodeSpec,
    status: VirtualNodeStatus,
    virtualNodeName: ResourceName
  ): VirtualNodeData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeData]
  }
  @scala.inline
  implicit class VirtualNodeDataOps[Self <: VirtualNodeData] (val x: Self) extends AnyVal {
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
    def setSpec(value: VirtualNodeSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: VirtualNodeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualNodeName(value: ResourceName): Self = this.set("virtualNodeName", value.asInstanceOf[js.Any])
  }
  
}

