package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfacePermissionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Service. Currently not supported.
    */
  var AwsService: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
  
  /**
    * The type of permission to grant.
    */
  var Permission: InterfacePermissionType
}
object CreateNetworkInterfacePermissionRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId, Permission: InterfacePermissionType): CreateNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfacePermissionRequest]
  }
  
  extension [Self <: CreateNetworkInterfacePermissionRequest](x: Self) {
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPermission(value: InterfacePermissionType): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
  }
}
