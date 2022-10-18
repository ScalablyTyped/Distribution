package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWirelessGatewayTaskDefinitionRequest extends StObject {
  
  /**
    * Whether to automatically create tasks using this task definition for all gateways with the specified current version. If false, the task must me created by calling CreateWirelessGatewayTask.
    */
  var AutoCreateTasks: typings.awsSdk.clientsIotwirelessMod.AutoCreateTasks
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the new resource.
    */
  var Name: js.UndefOr[WirelessGatewayTaskName] = js.undefined
  
  /**
    * The tags to attach to the specified resource. Tags are metadata that you can use to manage a resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Information about the gateways to update.
    */
  var Update: js.UndefOr[UpdateWirelessGatewayTaskCreate] = js.undefined
}
object CreateWirelessGatewayTaskDefinitionRequest {
  
  inline def apply(AutoCreateTasks: AutoCreateTasks): CreateWirelessGatewayTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(AutoCreateTasks = AutoCreateTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWirelessGatewayTaskDefinitionRequest]
  }
  
  extension [Self <: CreateWirelessGatewayTaskDefinitionRequest](x: Self) {
    
    inline def setAutoCreateTasks(value: AutoCreateTasks): Self = StObject.set(x, "AutoCreateTasks", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setName(value: WirelessGatewayTaskName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUpdate(value: UpdateWirelessGatewayTaskCreate): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
