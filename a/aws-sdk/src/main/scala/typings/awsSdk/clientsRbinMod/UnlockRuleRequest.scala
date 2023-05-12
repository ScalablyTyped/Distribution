package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlockRuleRequest extends StObject {
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: RuleIdentifier
}
object UnlockRuleRequest {
  
  inline def apply(Identifier: RuleIdentifier): UnlockRuleRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlockRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnlockRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
