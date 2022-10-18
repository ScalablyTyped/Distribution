package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCaseEventConfigurationRequest extends StObject {
  
  /**
    * The unique identifier of the Cases domain. 
    */
  var domainId: DomainId
  
  /**
    * Configuration to enable EventBridge case event delivery and determine what data is delivered.
    */
  var eventBridge: EventBridgeConfiguration
}
object PutCaseEventConfigurationRequest {
  
  inline def apply(domainId: DomainId, eventBridge: EventBridgeConfiguration): PutCaseEventConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainId = domainId.asInstanceOf[js.Any], eventBridge = eventBridge.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCaseEventConfigurationRequest]
  }
  
  extension [Self <: PutCaseEventConfigurationRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
    
    inline def setEventBridge(value: EventBridgeConfiguration): Self = StObject.set(x, "eventBridge", value.asInstanceOf[js.Any])
  }
}
