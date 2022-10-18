package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualRouterRef extends StObject {
  
  /**
    * The full Amazon Resource Name (ARN) for the virtual router.
    */
  var arn: Arn
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: js.Date
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: js.Date
  
  /**
    * The name of the service mesh that the virtual router resides in.
    */
  var meshName: ResourceName
  
  /**
    * The Amazon Web Services IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: AccountId
  
  /**
    * The Amazon Web Services IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh owner or of another account that the mesh is shared with. For more information about mesh sharing, see Working with shared meshes.
    */
  var resourceOwner: AccountId
  
  /**
    * The version of the resource. Resources are created at version 1, and this version is incremented each time that they're updated.
    */
  var version: Long
  
  /**
    * The name of the virtual router.
    */
  var virtualRouterName: ResourceName
}
object VirtualRouterRef {
  
  inline def apply(
    arn: Arn,
    createdAt: js.Date,
    lastUpdatedAt: js.Date,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    version: Long,
    virtualRouterName: ResourceName
  ): VirtualRouterRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualRouterName = virtualRouterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualRouterRef]
  }
  
  extension [Self <: VirtualRouterRef](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwner(value: AccountId): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVirtualRouterName(value: ResourceName): Self = StObject.set(x, "virtualRouterName", value.asInstanceOf[js.Any])
  }
}
