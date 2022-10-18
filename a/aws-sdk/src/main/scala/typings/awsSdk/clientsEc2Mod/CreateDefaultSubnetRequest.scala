package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDefaultSubnetRequest extends StObject {
  
  /**
    * The Availability Zone in which to create the default subnet.
    */
  var AvailabilityZone: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to create an IPv6 only subnet. If you already have a default subnet for this Availability Zone, you must delete it before you can create an IPv6 only subnet.
    */
  var Ipv6Native: js.UndefOr[Boolean] = js.undefined
}
object CreateDefaultSubnetRequest {
  
  inline def apply(AvailabilityZone: String): CreateDefaultSubnetRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDefaultSubnetRequest]
  }
  
  extension [Self <: CreateDefaultSubnetRequest](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIpv6Native(value: Boolean): Self = StObject.set(x, "Ipv6Native", value.asInstanceOf[js.Any])
    
    inline def setIpv6NativeUndefined: Self = StObject.set(x, "Ipv6Native", js.undefined)
  }
}
