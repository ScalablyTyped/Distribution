package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMeshOutput extends StObject {
  
  var mesh: MeshData
}
object UpdateMeshOutput {
  
  @scala.inline
  def apply(mesh: MeshData): UpdateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMeshOutput]
  }
  
  @scala.inline
  implicit class UpdateMeshOutputMutableBuilder[Self <: UpdateMeshOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
