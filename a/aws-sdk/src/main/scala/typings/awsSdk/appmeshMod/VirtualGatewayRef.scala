package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewayRef extends StObject {
  
  /**
    * The full Amazon Resource Name (ARN) for the resource.
    */
  var arn: Arn
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: Timestamp
  
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: Timestamp
  
  /**
    * The name of the service mesh that the resource resides in.
    */
  var meshName: ResourceName
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: AccountId
  
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's the ID of the mesh owner or of another account that the mesh is shared with. For more information about mesh sharing, see Working with shared meshes.
    */
  var resourceOwner: AccountId
  
  /**
    * The version of the resource. Resources are created at version 1, and this version is incremented each time that they're updated.
    */
  var version: Long
  
  /**
    * The name of the resource.
    */
  var virtualGatewayName: ResourceName
}
object VirtualGatewayRef {
  
  @scala.inline
  def apply(
    arn: Arn,
    createdAt: Timestamp,
    lastUpdatedAt: Timestamp,
    meshName: ResourceName,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    version: Long,
    virtualGatewayName: ResourceName
  ): VirtualGatewayRef = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], meshName = meshName.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], virtualGatewayName = virtualGatewayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewayRef]
  }
  
  @scala.inline
  implicit class VirtualGatewayRefMutableBuilder[Self <: VirtualGatewayRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAt(value: Timestamp): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceOwner(value: AccountId): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualGatewayName(value: ResourceName): Self = StObject.set(x, "virtualGatewayName", value.asInstanceOf[js.Any])
  }
}
