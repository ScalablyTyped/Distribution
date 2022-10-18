package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmState extends StObject {
  
  /**
    * Contains information about the action that you can take to respond to the alarm.
    */
  var customerAction: js.UndefOr[CustomerAction] = js.undefined
  
  /**
    * Information needed to evaluate data.
    */
  var ruleEvaluation: js.UndefOr[RuleEvaluation] = js.undefined
  
  /**
    * The name of the alarm state. The state name can be one of the following values:    DISABLED - When the alarm is in the DISABLED state, it isn't ready to evaluate data. To enable the alarm, you must change the alarm to the NORMAL state.    NORMAL - When the alarm is in the NORMAL state, it's ready to evaluate data.    ACTIVE - If the alarm is in the ACTIVE state, the alarm is invoked.    ACKNOWLEDGED - When the alarm is in the ACKNOWLEDGED state, the alarm was invoked and you acknowledged the alarm.    SNOOZE_DISABLED - When the alarm is in the SNOOZE_DISABLED state, the alarm is disabled for a specified period of time. After the snooze time, the alarm automatically changes to the NORMAL state.     LATCHED - When the alarm is in the LATCHED state, the alarm was invoked. However, the data that the alarm is currently evaluating is within the specified range. To change the alarm to the NORMAL state, you must acknowledge the alarm.  
    */
  var stateName: js.UndefOr[AlarmStateName] = js.undefined
  
  /**
    * Contains information about alarm state changes.
    */
  var systemEvent: js.UndefOr[SystemEvent] = js.undefined
}
object AlarmState {
  
  inline def apply(): AlarmState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmState]
  }
  
  extension [Self <: AlarmState](x: Self) {
    
    inline def setCustomerAction(value: CustomerAction): Self = StObject.set(x, "customerAction", value.asInstanceOf[js.Any])
    
    inline def setCustomerActionUndefined: Self = StObject.set(x, "customerAction", js.undefined)
    
    inline def setRuleEvaluation(value: RuleEvaluation): Self = StObject.set(x, "ruleEvaluation", value.asInstanceOf[js.Any])
    
    inline def setRuleEvaluationUndefined: Self = StObject.set(x, "ruleEvaluation", js.undefined)
    
    inline def setStateName(value: AlarmStateName): Self = StObject.set(x, "stateName", value.asInstanceOf[js.Any])
    
    inline def setStateNameUndefined: Self = StObject.set(x, "stateName", js.undefined)
    
    inline def setSystemEvent(value: SystemEvent): Self = StObject.set(x, "systemEvent", value.asInstanceOf[js.Any])
    
    inline def setSystemEventUndefined: Self = StObject.set(x, "systemEvent", js.undefined)
  }
}
