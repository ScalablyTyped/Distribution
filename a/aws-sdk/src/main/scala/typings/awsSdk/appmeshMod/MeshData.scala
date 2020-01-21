package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshData extends js.Object {
  /**
    * The name of the service mesh.
    */
  var meshName: ResourceName = js.native
  /**
    * The associated metadata for the service mesh.
    */
  var metadata: ResourceMetadata = js.native
  /**
    * The associated specification for the service mesh.
    */
  var spec: MeshSpec = js.native
  /**
    * The status of the service mesh.
    */
  var status: MeshStatus = js.native
}

object MeshData {
  @scala.inline
  def apply(meshName: ResourceName, metadata: ResourceMetadata, spec: MeshSpec, status: MeshStatus): MeshData = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MeshData]
  }
}

