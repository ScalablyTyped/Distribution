package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInterfaceAttributeRequest extends StObject {
  
  /**
    * The attribute of the network interface. This parameter is required.
    */
  var Attribute: js.UndefOr[NetworkInterfaceAttribute] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.clientsEc2Mod.NetworkInterfaceId
}
object DescribeNetworkInterfaceAttributeRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): DescribeNetworkInterfaceAttributeRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNetworkInterfaceAttributeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNetworkInterfaceAttributeRequest] (val x: Self) extends AnyVal {
    
    inline def setAttribute(value: NetworkInterfaceAttribute): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
  }
}
