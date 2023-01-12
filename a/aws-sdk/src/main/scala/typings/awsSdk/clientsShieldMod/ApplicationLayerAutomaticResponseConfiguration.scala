package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationLayerAutomaticResponseConfiguration extends StObject {
  
  /**
    * Specifies the action setting that Shield Advanced should use in the WAF rules that it creates on behalf of the protected resource in response to DDoS attacks. You specify this as part of the configuration for the automatic application layer DDoS mitigation feature, when you enable or update automatic mitigation. Shield Advanced creates the WAF rules in a Shield Advanced-managed rule group, inside the web ACL that you have associated with the resource. 
    */
  var Action: ResponseAction
  
  /**
    * Indicates whether automatic application layer DDoS mitigation is enabled for the protection. 
    */
  var Status: ApplicationLayerAutomaticResponseStatus
}
object ApplicationLayerAutomaticResponseConfiguration {
  
  inline def apply(Action: ResponseAction, Status: ApplicationLayerAutomaticResponseStatus): ApplicationLayerAutomaticResponseConfiguration = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationLayerAutomaticResponseConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationLayerAutomaticResponseConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ResponseAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ApplicationLayerAutomaticResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
