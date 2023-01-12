package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuntimeConfigurationInput extends StObject {
  
  /**
    * A unique identifier for the fleet to update runtime configuration for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom game build executable or a Realtime Servers script. The runtime configuration lists the types of server processes to run on an instance, how to launch them, and the number of processes to run concurrently.
    */
  var RuntimeConfiguration: typings.awsSdk.clientsGameliftMod.RuntimeConfiguration
}
object UpdateRuntimeConfigurationInput {
  
  inline def apply(FleetId: FleetIdOrArn, RuntimeConfiguration: RuntimeConfiguration): UpdateRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], RuntimeConfiguration = RuntimeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuntimeConfigurationInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRuntimeConfigurationInput] (val x: Self) extends AnyVal {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setRuntimeConfiguration(value: RuntimeConfiguration): Self = StObject.set(x, "RuntimeConfiguration", value.asInstanceOf[js.Any])
  }
}
