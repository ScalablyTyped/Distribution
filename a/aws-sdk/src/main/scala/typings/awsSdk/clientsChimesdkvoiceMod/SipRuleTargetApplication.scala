package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipRuleTargetApplication extends StObject {
  
  /**
    * The AWS Region of a rule's target SIP media application.
    */
  var AwsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * The priority setting of a rule's target SIP media application.
    */
  var Priority: js.UndefOr[SipApplicationPriority] = js.undefined
  
  /**
    * The ID of a rule's target SIP media application.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
}
object SipRuleTargetApplication {
  
  inline def apply(): SipRuleTargetApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipRuleTargetApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SipRuleTargetApplication] (val x: Self) extends AnyVal {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setPriority(value: SipApplicationPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
  }
}
