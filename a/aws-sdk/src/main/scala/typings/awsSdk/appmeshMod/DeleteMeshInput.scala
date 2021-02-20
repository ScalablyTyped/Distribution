package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteMeshInput extends StObject {
  
  /**
    * The name of the service mesh to delete.
    */
  var meshName: ResourceName = js.native
}
object DeleteMeshInput {
  
  @scala.inline
  def apply(meshName: ResourceName): DeleteMeshInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMeshInput]
  }
  
  @scala.inline
  implicit class DeleteMeshInputMutableBuilder[Self <: DeleteMeshInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
  }
}
