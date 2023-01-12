package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWirelessGatewayTaskDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name of the resource.
    */
  var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined
  
  /**
    * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
    */
  var AutoCreateTasks: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.AutoCreateTasks] = js.undefined
  
  /**
    * The name of the resource.
    */
  var Name: js.UndefOr[WirelessGatewayTaskName] = js.undefined
  
  /**
    * Information about the gateways to update.
    */
  var Update: js.UndefOr[UpdateWirelessGatewayTaskCreate] = js.undefined
}
object GetWirelessGatewayTaskDefinitionResponse {
  
  inline def apply(): GetWirelessGatewayTaskDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWirelessGatewayTaskDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetWirelessGatewayTaskDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: WirelessGatewayTaskDefinitionArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAutoCreateTasks(value: AutoCreateTasks): Self = StObject.set(x, "AutoCreateTasks", value.asInstanceOf[js.Any])
    
    inline def setAutoCreateTasksUndefined: Self = StObject.set(x, "AutoCreateTasks", js.undefined)
    
    inline def setName(value: WirelessGatewayTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setUpdate(value: UpdateWirelessGatewayTaskCreate): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
