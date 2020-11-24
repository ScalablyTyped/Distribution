package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipRuleResponse extends js.Object {
  
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
  implicit class CreateSipRuleResponseOps[Self <: CreateSipRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setSipRule(value: SipRule): Self = this.set("SipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipRule: Self = this.set("SipRule", js.undefined)
  }
}
