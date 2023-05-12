package typings.awsSdk.clientsRoute53recoverycontrolconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionRule extends StObject {
  
  /**
    * The routing controls that are part of transactions that are evaluated to determine if a request to change a routing control state is allowed. For example, you might include three routing controls, one for each of three Amazon Web Services Regions.
    */
  var AssertedControls: listOfStringMin1Max256PatternAZaZ09
  
  /**
    * The Amazon Resource Name (ARN) of the control panel.
    */
  var ControlPanelArn: stringMin1Max256PatternAZaZ09
  
  /**
    * Name of the assertion rule. You can use any non-white space character in the name.
    */
  var Name: stringMin1Max64PatternS
  
  /**
    * The criteria that you set for specific assertion routing controls (AssertedControls) that designate how many routing control states must be ON as the result of a transaction. For example, if you have three assertion routing controls, you might specify ATLEAST 2 for your rule configuration. This means that at least two assertion routing control states must be ON, so that at least two Amazon Web Services Regions have traffic flowing to them.
    */
  var RuleConfig: typings.awsSdk.clientsRoute53recoverycontrolconfigMod.RuleConfig
  
  /**
    * The Amazon Resource Name (ARN) of the assertion rule.
    */
  var SafetyRuleArn: stringMin1Max256PatternAZaZ09
  
  /**
    * The deployment status of an assertion rule. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
    */
  var Status: typings.awsSdk.clientsRoute53recoverycontrolconfigMod.Status
  
  /**
    * An evaluation period, in milliseconds (ms), during which any request against the target routing controls will fail. This helps prevent "flapping" of state. The wait period is 5000 ms by default, but you can choose a custom value.
    */
  var WaitPeriodMs: integer
}
object AssertionRule {
  
  inline def apply(
    AssertedControls: listOfStringMin1Max256PatternAZaZ09,
    ControlPanelArn: stringMin1Max256PatternAZaZ09,
    Name: stringMin1Max64PatternS,
    RuleConfig: RuleConfig,
    SafetyRuleArn: stringMin1Max256PatternAZaZ09,
    Status: Status,
    WaitPeriodMs: integer
  ): AssertionRule = {
    val __obj = js.Dynamic.literal(AssertedControls = AssertedControls.asInstanceOf[js.Any], ControlPanelArn = ControlPanelArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuleConfig = RuleConfig.asInstanceOf[js.Any], SafetyRuleArn = SafetyRuleArn.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], WaitPeriodMs = WaitPeriodMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssertionRule] (val x: Self) extends AnyVal {
    
    inline def setAssertedControls(value: listOfStringMin1Max256PatternAZaZ09): Self = StObject.set(x, "AssertedControls", value.asInstanceOf[js.Any])
    
    inline def setAssertedControlsVarargs(value: stringMin1Max256PatternAZaZ09*): Self = StObject.set(x, "AssertedControls", js.Array(value*))
    
    inline def setControlPanelArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "ControlPanelArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: stringMin1Max64PatternS): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRuleConfig(value: RuleConfig): Self = StObject.set(x, "RuleConfig", value.asInstanceOf[js.Any])
    
    inline def setSafetyRuleArn(value: stringMin1Max256PatternAZaZ09): Self = StObject.set(x, "SafetyRuleArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setWaitPeriodMs(value: integer): Self = StObject.set(x, "WaitPeriodMs", value.asInstanceOf[js.Any])
  }
}
