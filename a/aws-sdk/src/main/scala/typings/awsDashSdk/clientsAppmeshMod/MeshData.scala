package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshData extends js.Object {
  /**
    * The name of the service mesh.
    */
  var meshName: ResourceName
  /**
    * The associated metadata for the service mesh.
    */
  var metadata: ResourceMetadata
  /**
    * The associated specification for the service mesh.
    */
  var spec: MeshSpec
  /**
    * The status of the service mesh.
    */
  var status: MeshStatus
}

object MeshData {
  @scala.inline
  def apply(meshName: ResourceName, metadata: ResourceMetadata, spec: MeshSpec, status: MeshStatus): MeshData = {
    val __obj = js.Dynamic.literal(meshName = meshName, metadata = metadata, spec = spec, status = status)
  
    __obj.asInstanceOf[MeshData]
  }
}

