package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshData extends StObject {
  
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
  implicit class MeshDataMutableBuilder[Self <: MeshData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ResourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: MeshSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: MeshStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
