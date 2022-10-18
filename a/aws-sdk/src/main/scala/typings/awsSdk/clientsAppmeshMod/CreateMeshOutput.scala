package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMeshOutput extends StObject {
  
  /**
    * The full description of your service mesh following the create call.
    */
  var mesh: MeshData
}
object CreateMeshOutput {
  
  inline def apply(mesh: MeshData): CreateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeshOutput]
  }
  
  extension [Self <: CreateMeshOutput](x: Self) {
    
    inline def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
