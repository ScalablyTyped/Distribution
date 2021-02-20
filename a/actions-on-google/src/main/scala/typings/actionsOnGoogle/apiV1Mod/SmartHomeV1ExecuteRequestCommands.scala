package typings.actionsOnGoogle.apiV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestCommands extends StObject {
  
  var devices: js.Array[SmartHomeV1QueryRequestDevices] = js.native
  
  var execution: js.Array[SmartHomeV1ExecuteRequestExecution] = js.native
}
object SmartHomeV1ExecuteRequestCommands {
  
  @scala.inline
  def apply(
    devices: js.Array[SmartHomeV1QueryRequestDevices],
    execution: js.Array[SmartHomeV1ExecuteRequestExecution]
  ): SmartHomeV1ExecuteRequestCommands = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteRequestCommands]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteRequestCommandsMutableBuilder[Self <: SmartHomeV1ExecuteRequestCommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = StObject.set(x, "devices", js.Array(value :_*))
    
    @scala.inline
    def setExecution(value: js.Array[SmartHomeV1ExecuteRequestExecution]): Self = StObject.set(x, "execution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionVarargs(value: SmartHomeV1ExecuteRequestExecution*): Self = StObject.set(x, "execution", js.Array(value :_*))
  }
}
