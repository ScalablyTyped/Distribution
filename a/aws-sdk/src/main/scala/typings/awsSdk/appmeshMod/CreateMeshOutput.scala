package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateMeshOutput extends StObject {
  
  /**
    * The full description of your service mesh following the create call.
    */
  var mesh: MeshData = js.native
}
object CreateMeshOutput {
  
  @scala.inline
  def apply(mesh: MeshData): CreateMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMeshOutput]
  }
  
  @scala.inline
  implicit class CreateMeshOutputMutableBuilder[Self <: CreateMeshOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
