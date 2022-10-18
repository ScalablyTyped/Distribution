package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  /**
    * The Availability Zone of the subnet.
    */
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * The subnet identifier.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the subnet.
    */
  var SubnetStatus: js.UndefOr[String] = js.undefined
}
object Subnet {
  
  inline def apply(): Subnet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subnet]
  }
  
  extension [Self <: Subnet](x: Self) {
    
    inline def setSubnetAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetIdentifier(value: String): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    inline def setSubnetStatus(value: String): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
