package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipRuleTargetApplication extends StObject {
  
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
  implicit class SipRuleTargetApplicationMutableBuilder[Self <: SipRuleTargetApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    @scala.inline
    def setPriority(value: SipApplicationPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
  }
}
