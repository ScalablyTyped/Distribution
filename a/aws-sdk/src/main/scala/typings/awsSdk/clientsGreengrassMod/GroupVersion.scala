package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupVersion extends StObject {
  
  /**
    * The ARN of the connector definition version for this group.
    */
  var ConnectorDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the core definition version for this group.
    */
  var CoreDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the device definition version for this group.
    */
  var DeviceDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the function definition version for this group.
    */
  var FunctionDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the logger definition version for this group.
    */
  var LoggerDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the resource definition version for this group.
    */
  var ResourceDefinitionVersionArn: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the subscription definition version for this group.
    */
  var SubscriptionDefinitionVersionArn: js.UndefOr[string] = js.undefined
}
object GroupVersion {
  
  inline def apply(): GroupVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupVersion]
  }
  
  extension [Self <: GroupVersion](x: Self) {
    
    inline def setConnectorDefinitionVersionArn(value: string): Self = StObject.set(x, "ConnectorDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectorDefinitionVersionArnUndefined: Self = StObject.set(x, "ConnectorDefinitionVersionArn", js.undefined)
    
    inline def setCoreDefinitionVersionArn(value: string): Self = StObject.set(x, "CoreDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setCoreDefinitionVersionArnUndefined: Self = StObject.set(x, "CoreDefinitionVersionArn", js.undefined)
    
    inline def setDeviceDefinitionVersionArn(value: string): Self = StObject.set(x, "DeviceDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceDefinitionVersionArnUndefined: Self = StObject.set(x, "DeviceDefinitionVersionArn", js.undefined)
    
    inline def setFunctionDefinitionVersionArn(value: string): Self = StObject.set(x, "FunctionDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionDefinitionVersionArnUndefined: Self = StObject.set(x, "FunctionDefinitionVersionArn", js.undefined)
    
    inline def setLoggerDefinitionVersionArn(value: string): Self = StObject.set(x, "LoggerDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setLoggerDefinitionVersionArnUndefined: Self = StObject.set(x, "LoggerDefinitionVersionArn", js.undefined)
    
    inline def setResourceDefinitionVersionArn(value: string): Self = StObject.set(x, "ResourceDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setResourceDefinitionVersionArnUndefined: Self = StObject.set(x, "ResourceDefinitionVersionArn", js.undefined)
    
    inline def setSubscriptionDefinitionVersionArn(value: string): Self = StObject.set(x, "SubscriptionDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionDefinitionVersionArnUndefined: Self = StObject.set(x, "SubscriptionDefinitionVersionArn", js.undefined)
  }
}
