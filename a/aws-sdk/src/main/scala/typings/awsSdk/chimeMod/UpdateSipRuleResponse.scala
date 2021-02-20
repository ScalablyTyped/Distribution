package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSipRuleResponse extends StObject {
  
  /**
    * Updated SIP rule details.
    */
  var SipRule: js.UndefOr[typings.awsSdk.chimeMod.SipRule] = js.native
}
object UpdateSipRuleResponse {
  
  @scala.inline
  def apply(): UpdateSipRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSipRuleResponse]
  }
  
  @scala.inline
  implicit class UpdateSipRuleResponseMutableBuilder[Self <: UpdateSipRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipRule(value: SipRule): Self = StObject.set(x, "SipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipRuleUndefined: Self = StObject.set(x, "SipRule", js.undefined)
  }
}
