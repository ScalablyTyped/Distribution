package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSubnetCidrReservationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the subnet CIDR reservation.
    */
  var SubnetCidrReservationId: typings.awsSdk.clientsEc2Mod.SubnetCidrReservationId
}
object DeleteSubnetCidrReservationRequest {
  
  inline def apply(SubnetCidrReservationId: SubnetCidrReservationId): DeleteSubnetCidrReservationRequest = {
    val __obj = js.Dynamic.literal(SubnetCidrReservationId = SubnetCidrReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSubnetCidrReservationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSubnetCidrReservationRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSubnetCidrReservationId(value: SubnetCidrReservationId): Self = StObject.set(x, "SubnetCidrReservationId", value.asInstanceOf[js.Any])
  }
}
