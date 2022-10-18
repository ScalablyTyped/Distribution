package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMeshOutput extends StObject {
  
  /**
    * The service mesh that was deleted.
    */
  var mesh: MeshData
}
object DeleteMeshOutput {
  
  inline def apply(mesh: MeshData): DeleteMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeshOutput]
  }
  
  extension [Self <: DeleteMeshOutput](x: Self) {
    
    inline def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
