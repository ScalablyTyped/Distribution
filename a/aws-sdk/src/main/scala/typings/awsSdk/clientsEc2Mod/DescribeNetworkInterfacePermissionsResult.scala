package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInterfacePermissionsResult extends StObject {
  
  /**
    * The network interface permissions.
    */
  var NetworkInterfacePermissions: js.UndefOr[NetworkInterfacePermissionList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInterfacePermissionsResult {
  
  inline def apply(): DescribeNetworkInterfacePermissionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfacePermissionsResult]
  }
  
  extension [Self <: DescribeNetworkInterfacePermissionsResult](x: Self) {
    
    inline def setNetworkInterfacePermissions(value: NetworkInterfacePermissionList): Self = StObject.set(x, "NetworkInterfacePermissions", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacePermissionsUndefined: Self = StObject.set(x, "NetworkInterfacePermissions", js.undefined)
    
    inline def setNetworkInterfacePermissionsVarargs(value: NetworkInterfacePermission*): Self = StObject.set(x, "NetworkInterfacePermissions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
