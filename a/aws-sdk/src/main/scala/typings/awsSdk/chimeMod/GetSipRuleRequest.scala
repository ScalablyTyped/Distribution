package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipRuleRequest extends js.Object {
  
  /**
    * The SIP rule ID.
    */
  var SipRuleId: NonEmptyString = js.native
}
object GetSipRuleRequest {
  
  @scala.inline
  def apply(SipRuleId: NonEmptyString): GetSipRuleRequest = {
    val __obj = js.Dynamic.literal(SipRuleId = SipRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSipRuleRequest]
  }
  
  @scala.inline
  implicit class GetSipRuleRequestOps[Self <: GetSipRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSipRuleId(value: NonEmptyString): Self = this.set("SipRuleId", value.asInstanceOf[js.Any])
  }
}
