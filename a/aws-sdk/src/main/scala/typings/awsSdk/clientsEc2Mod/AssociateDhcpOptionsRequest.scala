package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateDhcpOptionsRequest extends StObject {
  
  /**
    * The ID of the DHCP options set, or default to associate no DHCP options with the VPC.
    */
  var DhcpOptionsId: DefaultingDhcpOptionsId
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.clientsEc2Mod.VpcId
}
object AssociateDhcpOptionsRequest {
  
  inline def apply(DhcpOptionsId: DefaultingDhcpOptionsId, VpcId: VpcId): AssociateDhcpOptionsRequest = {
    val __obj = js.Dynamic.literal(DhcpOptionsId = DhcpOptionsId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDhcpOptionsRequest]
  }
  
  extension [Self <: AssociateDhcpOptionsRequest](x: Self) {
    
    inline def setDhcpOptionsId(value: DefaultingDhcpOptionsId): Self = StObject.set(x, "DhcpOptionsId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
