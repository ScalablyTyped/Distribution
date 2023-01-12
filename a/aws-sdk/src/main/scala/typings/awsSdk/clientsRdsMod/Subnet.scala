package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subnet extends StObject {
  
  var SubnetAvailabilityZone: js.UndefOr[AvailabilityZone] = js.undefined
  
  /**
    * The identifier of the subnet.
    */
  var SubnetIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * If the subnet is associated with an Outpost, this value specifies the Outpost. For more information about RDS on Outposts, see Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide. 
    */
  var SubnetOutpost: js.UndefOr[Outpost] = js.undefined
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subnet] (val x: Self) extends AnyVal {
    
    inline def setSubnetAvailabilityZone(value: AvailabilityZone): Self = StObject.set(x, "SubnetAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setSubnetAvailabilityZoneUndefined: Self = StObject.set(x, "SubnetAvailabilityZone", js.undefined)
    
    inline def setSubnetIdentifier(value: String): Self = StObject.set(x, "SubnetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdentifierUndefined: Self = StObject.set(x, "SubnetIdentifier", js.undefined)
    
    inline def setSubnetOutpost(value: Outpost): Self = StObject.set(x, "SubnetOutpost", value.asInstanceOf[js.Any])
    
    inline def setSubnetOutpostUndefined: Self = StObject.set(x, "SubnetOutpost", js.undefined)
    
    inline def setSubnetStatus(value: String): Self = StObject.set(x, "SubnetStatus", value.asInstanceOf[js.Any])
    
    inline def setSubnetStatusUndefined: Self = StObject.set(x, "SubnetStatus", js.undefined)
  }
}
