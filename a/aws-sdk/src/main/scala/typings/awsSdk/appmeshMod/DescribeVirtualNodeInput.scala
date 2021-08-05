package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualNodeInput extends StObject {
  
  /**
    * The name of the service mesh that the virtual node resides in.
    */
  var meshName: ResourceName
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The name of the virtual node to describe.
    */
  var virtualNodeName: ResourceName
}
object DescribeVirtualNodeInput {
  
  inline def apply(meshName: ResourceName, virtualNodeName: ResourceName): DescribeVirtualNodeInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualNodeName = virtualNodeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualNodeInput]
  }
  
  extension [Self <: DescribeVirtualNodeInput](x: Self) {
    
    inline def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    inline def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    inline def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    inline def setVirtualNodeName(value: ResourceName): Self = StObject.set(x, "virtualNodeName", value.asInstanceOf[js.Any])
  }
}
