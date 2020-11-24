package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class MeshDataOps[Self <: MeshData] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: MeshSpec): Self = this.set("spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MeshStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
