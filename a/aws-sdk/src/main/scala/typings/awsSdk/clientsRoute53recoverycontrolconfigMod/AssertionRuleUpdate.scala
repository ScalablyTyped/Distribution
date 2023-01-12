package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionRuleUpdate extends StObject {
  
  /**
    * The name of the assertion rule. You can use any non-white space character in the name.
    */
  var Name: stringMin1Max64PatternS
  
  /**
    * The Amazon Resource Name (ARN) of the assertion rule.
    */
  var SafetyRuleArn: stringMin1Max256PatternAZaZ09
  
  /**
    * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
    */
  var WaitPeriodMs: integer
}
object AssertionRuleUpdate {
  
  inline def apply(Name: stringMin1Max64PatternS, SafetyRuleArn: stringMin1Max256PatternAZaZ09, WaitPeriodMs: integer): AssertionRuleUpdate = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any], WaitPeriodMs = WaitPeriodMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionRuleUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertionRuleUpdate] (val x: Self) extends AnyVal {
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSafetyRuleArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
    
    inline def setWaitPeriodMs(value: integer): Self = StObject.set(x, "WaitPeriodMs", value.asInstanceOf[js.Any])
  }
}
