package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSipRuleRequest extends StObject {
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: NonEmptyString
}
object DeleteSipRuleRequest {
  
  inline def apply(SipRuleId: NonEmptyString): DeleteSipRuleRequest = {
    val __obj = js.Dynamic.literal(SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSipRuleRequest]
  }
  
  extension [Self <: DeleteSipRuleRequest](x: Self) {
    
    inline def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
  }
}
