package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRuleRequest extends StObject {
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: RuleIdentifier
}
object DeleteRuleRequest {
  
  inline def apply(Identifier: RuleIdentifier): DeleteRuleRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRuleRequest]
  }
  
  extension [Self <: DeleteRuleRequest](x: Self) {
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
