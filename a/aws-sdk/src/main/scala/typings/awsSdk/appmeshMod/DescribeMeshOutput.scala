package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMeshOutput extends StObject {
  
  /**
    * The full description of your service mesh.
    */
  var mesh: MeshData = js.native
}
object DescribeMeshOutput {
  
  @scala.inline
  def apply(mesh: MeshData): DescribeMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMeshOutput]
  }
  
  @scala.inline
  implicit class DescribeMeshOutputMutableBuilder[Self <: DescribeMeshOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
