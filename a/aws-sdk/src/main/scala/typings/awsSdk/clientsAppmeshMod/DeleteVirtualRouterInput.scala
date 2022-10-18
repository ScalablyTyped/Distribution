package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualRouterInput extends StObject {
  
  /**
    * The name of the service mesh to delete the virtual router in.
    */
  var meshName: ResourceName
  
  /**
    * The Amazon Web Services IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the virtual router to delete.
    */
  var virtualRouterName: ResourceName
}
object DeleteVirtualRouterInput {
  
  inline def apply(meshName: ResourceName, virtualRouterName: ResourceName): DeleteVirtualRouterInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualRouterInput]
  }
  
  extension [Self <: DeleteVirtualRouterInput](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    inline def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
