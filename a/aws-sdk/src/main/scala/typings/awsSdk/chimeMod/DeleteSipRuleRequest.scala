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
  
  @scala.inline
  def apply(SipRuleId: NonEmptyString): DeleteSipRuleRequest = {
    val __obj = js.Dynamic.literal(SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSipRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteSipRuleRequestMutableBuilder[Self <: DeleteSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = StObject.set(x, "SipRuleId", value.asInstanceOf[js.Any])
  }
}
