package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipRuleResponse extends StObject {
  
  /**
    * Returns the SIP rule information, including the rule ID, triggers, and target applications.
    */
  var SipRule: js.UndefOr[typings.awsSdk.chimeMod.SipRule] = js.native
}
object CreateSipRuleResponse {
  
  @scala.inline
  def apply(): CreateSipRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSipRuleResponse]
  }
  
  @scala.inline
  implicit class CreateSipRuleResponseMutableBuilder[Self <: CreateSipRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipRule(value: SipRule): Self = StObject.set(x, "SipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleUndefined: Self = StObject.set(x, "SipRule", js.undefined)
  }
}
