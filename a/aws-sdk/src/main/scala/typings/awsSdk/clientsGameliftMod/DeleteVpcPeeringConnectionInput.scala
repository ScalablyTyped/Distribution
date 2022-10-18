package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcPeeringConnectionInput extends StObject {
  
  /**
    * A unique identifier for the fleet. This fleet specified must match the fleet referenced in the VPC peering connection record. You can use either the fleet ID or ARN value.
    */
  var FleetId: typings.awsSdk.clientsGameliftMod.FleetId
  
  /**
    * A unique identifier for a VPC peering connection. This value is included in the VpcPeeringConnection object, which can be retrieved by calling DescribeVpcPeeringConnections.
    */
  var VpcPeeringConnectionId: NonZeroAndMaxString
}
object DeleteVpcPeeringConnectionInput {
  
  inline def apply(FleetId: FleetId, VpcPeeringConnectionId: NonZeroAndMaxString): DeleteVpcPeeringConnectionInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], VpcPeeringConnectionId = VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcPeeringConnectionInput]
  }
  
  extension [Self <: DeleteVpcPeeringConnectionInput](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionId(value: NonZeroAndMaxString): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
