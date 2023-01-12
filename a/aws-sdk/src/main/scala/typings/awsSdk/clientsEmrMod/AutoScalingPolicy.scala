package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingPolicy extends StObject {
  
  /**
    * The upper and lower EC2 instance limits for an automatic scaling policy. Automatic scaling activity will not cause an instance group to grow above or below these limits.
    */
  var Constraints: ScalingConstraints
  
  /**
    * The scale-in and scale-out rules that comprise the automatic scaling policy.
    */
  var Rules: ScalingRuleList
}
object AutoScalingPolicy {
  
  inline def apply(Constraints: ScalingConstraints, Rules: ScalingRuleList): AutoScalingPolicy = {
    val __obj = js.Dynamic.literal(Constraints = Constraints.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoScalingPolicy] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: ScalingConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setRules(value: ScalingRuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: ScalingRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
