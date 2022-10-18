package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMeshInput extends StObject {
  
  /**
    * The name of the service mesh to delete.
    */
  var meshName: ResourceName
}
object DeleteMeshInput {
  
  inline def apply(meshName: ResourceName): DeleteMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeshInput]
  }
  
  extension [Self <: DeleteMeshInput](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
  }
}
