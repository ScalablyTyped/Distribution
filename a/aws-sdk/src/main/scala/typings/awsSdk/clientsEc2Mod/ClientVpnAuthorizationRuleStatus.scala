package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnAuthorizationRuleStatus extends StObject {
  
  /**
    * The state of the authorization rule.
    */
  var Code: js.UndefOr[ClientVpnAuthorizationRuleStatusCode] = js.undefined
  
  /**
    * A message about the status of the authorization rule, if applicable.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ClientVpnAuthorizationRuleStatus {
  
  inline def apply(): ClientVpnAuthorizationRuleStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnAuthorizationRuleStatus]
  }
  
  extension [Self <: ClientVpnAuthorizationRuleStatus](x: Self) {
    
    inline def setCode(value: ClientVpnAuthorizationRuleStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
