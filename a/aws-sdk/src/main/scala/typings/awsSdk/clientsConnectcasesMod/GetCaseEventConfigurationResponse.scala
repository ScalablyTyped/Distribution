package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCaseEventConfigurationResponse extends StObject {
  
  /**
    * Configuration to enable EventBridge case event delivery and determine what data is delivered.
    */
  var eventBridge: EventBridgeConfiguration
}
object GetCaseEventConfigurationResponse {
  
  inline def apply(eventBridge: EventBridgeConfiguration): GetCaseEventConfigurationResponse = {
    val __obj = js.Dynamic.literal(eventBridge = eventBridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCaseEventConfigurationResponse]
  }
  
  extension [Self <: GetCaseEventConfigurationResponse](x: Self) {
    
    inline def setEventBridge(value: EventBridgeConfiguration): Self = StObject.set(x, "eventBridge", value.asInstanceOf[js.Any])
  }
}
