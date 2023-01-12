package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSafetyRuleRequest extends StObject {
  
  /**
    * The ARN of the safety rule.
    */
  var SafetyRuleArn: string
}
object DescribeSafetyRuleRequest {
  
  inline def apply(SafetyRuleArn: string): DescribeSafetyRuleRequest = {
    val __obj = js.Dynamic.literal(SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSafetyRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSafetyRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setSafetyRuleArn(value: string): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
  }
}
