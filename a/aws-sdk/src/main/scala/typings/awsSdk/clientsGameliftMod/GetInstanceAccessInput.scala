package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceAccessInput extends StObject {
  
  /**
    * A unique identifier for the fleet that contains the instance you want access to. You can use either the fleet ID or ARN value. The fleet can be in any of the following statuses: ACTIVATING, ACTIVE, or ERROR. Fleets with an ERROR status may be accessible for a short time before they are deleted.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * A unique identifier for the instance you want to get access to. You can access an instance in any status.
    */
  var InstanceId: typings.awsSdk.clientsGameliftMod.InstanceId
}
object GetInstanceAccessInput {
  
  inline def apply(FleetId: FleetIdOrArn, InstanceId: InstanceId): GetInstanceAccessInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceAccessInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInstanceAccessInput] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
