package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeData extends js.Object {
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  /**
    * The associated metadata for the virtual node.
    */
  var metadata: ResourceMetadata
  /**
    * The specifications of the virtual node.
    */
  var spec: VirtualNodeSpec
  /**
    * The current status for the virtual node.
    */
  var status: VirtualNodeStatus
  /**
    * The name of the virtual node.
    */
  var virtualNodeName: ResourceName
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
    val __obj = js.Dynamic.literal(meshName = meshName, metadata = metadata, spec = spec, status = status, virtualNodeName = virtualNodeName)
  
    __obj.asInstanceOf[VirtualNodeData]
  }
}

