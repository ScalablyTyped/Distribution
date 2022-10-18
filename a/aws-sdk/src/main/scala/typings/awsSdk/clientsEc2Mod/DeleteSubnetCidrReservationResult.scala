package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubnetCidrReservationResult extends StObject {
  
  /**
    * Information about the deleted subnet CIDR reservation.
    */
  var DeletedSubnetCidrReservation: js.UndefOr[SubnetCidrReservation] = js.undefined
}
object DeleteSubnetCidrReservationResult {
  
  inline def apply(): DeleteSubnetCidrReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSubnetCidrReservationResult]
  }
  
  extension [Self <: DeleteSubnetCidrReservationResult](x: Self) {
    
    inline def setDeletedSubnetCidrReservation(value: SubnetCidrReservation): Self = StObject.set(x, "DeletedSubnetCidrReservation", value.asInstanceOf[js.Any])
    
    inline def setDeletedSubnetCidrReservationUndefined: Self = StObject.set(x, "DeletedSubnetCidrReservation", js.undefined)
  }
}
