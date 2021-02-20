package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVirtualServiceInput extends StObject {
  
  /**
    * The name of the service mesh that the virtual service resides in.
    */
  var meshName: ResourceName = js.native
  
  /**
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with shared meshes.
    */
  var meshOwner: js.UndefOr[AccountId] = js.native
  
  /**
    * The name of the virtual service to describe.
    */
  var virtualServiceName: ServiceName = js.native
}
object DescribeVirtualServiceInput {
  
  @scala.inline
  def apply(meshName: ResourceName, virtualServiceName: ServiceName): DescribeVirtualServiceInput = {
    val __obj = js.Dynamic.literal(meshName = meshName.asInstanceOf[js.Any], virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualServiceInput]
  }
  
  @scala.inline
  implicit class DescribeVirtualServiceInputMutableBuilder[Self <: DescribeVirtualServiceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeshName(value: ResourceName): Self = StObject.set(x, "meshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwner(value: AccountId): Self = StObject.set(x, "meshOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshOwnerUndefined: Self = StObject.set(x, "meshOwner", js.undefined)
    
    @scala.inline
    def setVirtualServiceName(value: ServiceName): Self = StObject.set(x, "virtualServiceName", value.asInstanceOf[js.Any])
  }
}
