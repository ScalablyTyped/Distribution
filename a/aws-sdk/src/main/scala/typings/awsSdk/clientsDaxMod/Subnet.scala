package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  /**
    * The Availability Zone (AZ) for the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The system-assigned identifier for the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
}
object Subnet {
  
  inline def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  extension [Self <: Subnet](x: Self) {
    
    inline def setSubnetAvailabilityZone(value: String): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetIdentifier(value: String): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
  }
}
