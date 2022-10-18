package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfacePermission extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Service.
    */
  var AwsService: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of permission.
    */
  var Permission: js.UndefOr[InterfacePermissionType] = js.undefined
  
  /**
    * Information about the state of the permission.
    */
  var PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.undefined
}
object NetworkInterfacePermission {
  
  inline def apply(): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
  
  extension [Self <: NetworkInterfacePermission](x: Self) {
    
    inline def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    inline def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    inline def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNetworkInterfacePermissionId(value: String): Self = StObject.set(x, "NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacePermissionIdUndefined: Self = StObject.set(x, "NetworkInterfacePermissionId", js.undefined)
    
    inline def setPermission(value: InterfacePermissionType): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionState(value: NetworkInterfacePermissionState): Self = StObject.set(x, "PermissionState", value.asInstanceOf[js.Any])
    
    inline def setPermissionStateUndefined: Self = StObject.set(x, "PermissionState", js.undefined)
    
    inline def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
