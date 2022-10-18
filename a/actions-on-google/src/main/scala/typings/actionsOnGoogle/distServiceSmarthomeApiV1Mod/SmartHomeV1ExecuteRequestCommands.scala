package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteRequestCommands extends StObject {
  
  var devices: js.Array[SmartHomeV1QueryRequestDevices]
  
  var execution: js.Array[SmartHomeV1ExecuteRequestExecution]
}
object SmartHomeV1ExecuteRequestCommands {
  
  inline def apply(
    devices: js.Array[SmartHomeV1QueryRequestDevices],
    execution: js.Array[SmartHomeV1ExecuteRequestExecution]
  ): SmartHomeV1ExecuteRequestCommands = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestCommands]
  }
  
  extension [Self <: SmartHomeV1ExecuteRequestCommands](x: Self) {
    
    inline def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setExecution(value: js.Array[SmartHomeV1ExecuteRequestExecution]): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    inline def setExecutionVarargs(value: SmartHomeV1ExecuteRequestExecution*): Self = StObject.set(x, "execution", js.Array(value*))
  }
}
