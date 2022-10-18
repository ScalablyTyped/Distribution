package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteScalingPolicyInput extends StObject {
  
  /**
    * A unique identifier for the fleet to be deleted. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * A descriptive label that is associated with a fleet's scaling policy. Policy names do not need to be unique.
    */
  var Name: NonZeroAndMaxString
}
object DeleteScalingPolicyInput {
  
  inline def apply(FleetId: FleetIdOrArn, Name: NonZeroAndMaxString): DeleteScalingPolicyInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScalingPolicyInput]
  }
  
  extension [Self <: DeleteScalingPolicyInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
