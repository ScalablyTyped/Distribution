package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SipRuleTargetApplication extends StObject {
  
  /**
    * AWS Region of target application.
    */
  var AwsRegion: js.UndefOr[String] = js.undefined
  
  /**
    * Priority of the SIP media application in the target list.
    */
  var Priority: js.UndefOr[SipApplicationPriority] = js.undefined
  
  /**
    * The SIP media application ID.
    */
  var SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
}
object SipRuleTargetApplication {
  
  inline def apply(): SipRuleTargetApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipRuleTargetApplication]
  }
  
  extension [Self <: SipRuleTargetApplication](x: Self) {
    
    inline def setAwsRegion(value: String): Self = StObject.set(x, "AwsRegion", value.asInstanceOf[js.Any])
    
    inline def setAwsRegionUndefined: Self = StObject.set(x, "AwsRegion", js.undefined)
    
    inline def setPriority(value: SipApplicationPriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setSipMediaApplicationIdUndefined: Self = StObject.set(x, "SipMediaApplicationId", js.undefined)
  }
}
