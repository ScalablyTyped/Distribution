package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMeshOutput extends StObject {
  
  /**
    * The full description of your service mesh.
    */
  var mesh: MeshData
}
object DescribeMeshOutput {
  
  inline def apply(mesh: MeshData): DescribeMeshOutput = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMeshOutput]
  }
  
  extension [Self <: DescribeMeshOutput](x: Self) {
    
    inline def setMesh(value: MeshData): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
