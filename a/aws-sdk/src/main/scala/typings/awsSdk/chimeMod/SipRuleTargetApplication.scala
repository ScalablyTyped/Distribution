package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipRuleTargetApplication extends js.Object {
  
  /**
    * AWS Region of target application.
    */
  var AwsRegion: js.UndefOr[String] = js.native
  
  /**
    * Priority of the SIP media application in the target list.
    */
  var Priority: js.UndefOr[SipApplicationPriority] = js.native
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.native
}
object SipRuleTargetApplication {
  
  @scala.inline
  def apply(): SipRuleTargetApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipRuleTargetApplication]
  }
  
  @scala.inline
  implicit class SipRuleTargetApplicationOps[Self <: SipRuleTargetApplication] (val x: Self) extends AnyVal {
    
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
    def setAwsRegion(value: String): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    
    @scala.inline
    def setPriority(value: SipApplicationPriority): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = this.set("SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplicationId: Self = this.set("SipMediaApplicationId", js.undefined)
  }
}
