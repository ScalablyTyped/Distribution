package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignPrivateNatGatewayAddressRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if connections are still in progress. Default value is 350 seconds.
    */
  var MaxDrainDurationSeconds: js.UndefOr[DrainSeconds] = js.undefined
  
  /**
    * The NAT gateway ID.
    */
  var NatGatewayId: typings.awsSdk.clientsEc2Mod.NatGatewayId
  
  /**
    * The private IPv4 addresses you want to unassign.
    */
  var PrivateIpAddresses: IpList
}
object UnassignPrivateNatGatewayAddressRequest {
  
  inline def apply(NatGatewayId: NatGatewayId, PrivateIpAddresses: IpList): UnassignPrivateNatGatewayAddressRequest = {
    val __obj = js.Dynamic.literal(NatGatewayId = NatGatewayId.asInstanceOf[js.Any], PrivateIpAddresses = PrivateIpAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignPrivateNatGatewayAddressRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnassignPrivateNatGatewayAddressRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxDrainDurationSeconds(value: DrainSeconds): Self = StObject.set(x, "MaxDrainDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxDrainDurationSecondsUndefined: Self = StObject.set(x, "MaxDrainDurationSeconds", js.undefined)
    
    inline def setNatGatewayId(value: NatGatewayId): Self = StObject.set(x, "NatGatewayId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: IpList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
  }
}
