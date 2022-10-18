package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubnetCidrReservationResult extends StObject {
  
  /**
    * Information about the created subnet CIDR reservation.
    */
  var SubnetCidrReservation: js.UndefOr[typings.awsSdk.clientsEc2Mod.SubnetCidrReservation] = js.undefined
}
object CreateSubnetCidrReservationResult {
  
  inline def apply(): CreateSubnetCidrReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSubnetCidrReservationResult]
  }
  
  extension [Self <: CreateSubnetCidrReservationResult](x: Self) {
    
    inline def setSubnetCidrReservation(value: SubnetCidrReservation): Self = StObject.set(x, "SubnetCidrReservation", value.asInstanceOf[js.Any])
    
    inline def setSubnetCidrReservationUndefined: Self = StObject.set(x, "SubnetCidrReservation", js.undefined)
  }
}
