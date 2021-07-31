package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSipRuleRequest extends StObject {
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: NonEmptyString
}
object GetSipRuleRequest {
  
  @scala.inline
  def apply(SipRuleId: NonEmptyString): GetSipRuleRequest = {
    val __obj = js.Dynamic.literal(SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipRuleRequest]
  }
  
  @scala.inline
  implicit class GetSipRuleRequestMutableBuilder[Self <: GetSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
  }
}
