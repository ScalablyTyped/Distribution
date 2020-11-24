package typings.actionsOnGoogle.apiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteRequestCommands extends js.Object {
  
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
  implicit class SmartHomeV1ExecuteRequestCommandsOps[Self <: SmartHomeV1ExecuteRequestCommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDevicesVarargs(value: SmartHomeV1QueryRequestDevices*): Self = this.set("devices", js.Array(value :_*))
    
    @scala.inline
    def setDevices(value: js.Array[SmartHomeV1QueryRequestDevices]): Self = this.set("devices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionVarargs(value: SmartHomeV1ExecuteRequestExecution*): Self = this.set("execution", js.Array(value :_*))
    
    @scala.inline
    def setExecution(value: js.Array[SmartHomeV1ExecuteRequestExecution]): Self = this.set("execution", value.asInstanceOf[js.Any])
  }
}
