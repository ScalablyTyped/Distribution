package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDestinationVpc extends StObject {
  
  /**
    * The availability zone of the Input destination.
    */
  var AvailabilityZone: js.UndefOr[string] = js.undefined
  
  /**
    * The network interface ID of the Input destination in the VPC.
    */
  var NetworkInterfaceId: js.UndefOr[string] = js.undefined
}
object InputDestinationVpc {
  
  inline def apply(): InputDestinationVpc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestinationVpc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDestinationVpc] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setNetworkInterfaceId(value: string): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
