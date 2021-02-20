package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMeshOutput extends StObject {
  
  /**
    * The service mesh that was deleted.
    */
  var mesh: MeshData = js.native
}
object DeleteMeshOutput {
  
  @scala.inline
  def apply(mesh: MeshData): DeleteMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeshOutput]
  }
  
  @scala.inline
  implicit class DeleteMeshOutputMutableBuilder[Self <: DeleteMeshOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
