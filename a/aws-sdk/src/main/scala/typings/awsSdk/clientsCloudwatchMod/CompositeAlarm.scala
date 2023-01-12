package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeAlarm extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ActionsEnabled] = js.undefined
  
  /**
    *  When the value is ALARM, it means that the actions are suppressed because the suppressor alarm is in ALARM When the value is WaitPeriod, it means that the actions are suppressed because the composite alarm is waiting for the suppressor alarm to go into into the ALARM state. The maximum waiting time is as specified in ActionsSuppressorWaitPeriod. After this time, the composite alarm performs its actions. When the value is ExtensionPeriod, it means that the actions are suppressed because the composite alarm is waiting after the suppressor alarm went out of the ALARM state. The maximum waiting time is as specified in ActionsSuppressorExtensionPeriod. After this time, the composite alarm performs its actions. 
    */
  var ActionsSuppressedBy: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ActionsSuppressedBy] = js.undefined
  
  /**
    *  Captures the reason for action suppression. 
    */
  var ActionsSuppressedReason: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ActionsSuppressedReason] = js.undefined
  
  /**
    *  Actions will be suppressed if the suppressor alarm is in the ALARM state. ActionsSuppressor can be an AlarmName or an Amazon Resource Name (ARN) from an existing alarm. 
    */
  var ActionsSuppressor: js.UndefOr[AlarmArn] = js.undefined
  
  /**
    *  The maximum time in seconds that the composite alarm waits after suppressor alarm goes out of the ALARM state. After this time, the composite alarm performs its actions.    ExtensionPeriod is required only when ActionsSuppressor is specified.  
    */
  var ActionsSuppressorExtensionPeriod: js.UndefOr[SuppressorPeriod] = js.undefined
  
  /**
    *  The maximum time in seconds that the composite alarm waits for the suppressor alarm to go into the ALARM state. After this time, the composite alarm performs its actions.    WaitPeriod is required only when ActionsSuppressor is specified.  
    */
  var ActionsSuppressorWaitPeriod: js.UndefOr[SuppressorPeriod] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmArn] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmDescription] = js.undefined
  
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmName] = js.undefined
  
  /**
    * The rule that this alarm uses to evaluate its alarm state.
    */
  var AlarmRule: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmRule] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.StateReason] = js.undefined
  
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.StateReasonData] = js.undefined
  
  /**
    *  The timestamp of the last change to the alarm's StateValue. 
    */
  var StateTransitionedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Tracks the timestamp of any state update, even if StateValue doesn't change.
    */
  var StateUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.StateValue] = js.undefined
}
object CompositeAlarm {
  
  inline def apply(): CompositeAlarm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeAlarm]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompositeAlarm] (val x: Self) extends AnyVal {
    
    inline def setActionsEnabled(value: ActionsEnabled): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    inline def setActionsSuppressedBy(value: ActionsSuppressedBy): Self = StObject.set(x, "ActionsSuppressedBy", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressedByUndefined: Self = StObject.set(x, "ActionsSuppressedBy", js.undefined)
    
    inline def setActionsSuppressedReason(value: ActionsSuppressedReason): Self = StObject.set(x, "ActionsSuppressedReason", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressedReasonUndefined: Self = StObject.set(x, "ActionsSuppressedReason", js.undefined)
    
    inline def setActionsSuppressor(value: AlarmArn): Self = StObject.set(x, "ActionsSuppressor", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorExtensionPeriod(value: SuppressorPeriod): Self = StObject.set(x, "ActionsSuppressorExtensionPeriod", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorExtensionPeriodUndefined: Self = StObject.set(x, "ActionsSuppressorExtensionPeriod", js.undefined)
    
    inline def setActionsSuppressorUndefined: Self = StObject.set(x, "ActionsSuppressor", js.undefined)
    
    inline def setActionsSuppressorWaitPeriod(value: SuppressorPeriod): Self = StObject.set(x, "ActionsSuppressorWaitPeriod", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorWaitPeriodUndefined: Self = StObject.set(x, "ActionsSuppressorWaitPeriod", js.undefined)
    
    inline def setAlarmActions(value: ResourceList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    inline def setAlarmActionsVarargs(value: ResourceName*): Self = StObject.set(x, "AlarmActions", js.Array(value*))
    
    inline def setAlarmArn(value: AlarmArn): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmArnUndefined: Self = StObject.set(x, "AlarmArn", js.undefined)
    
    inline def setAlarmConfigurationUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUpdatedTimestampUndefined: Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", js.undefined)
    
    inline def setAlarmDescription(value: AlarmDescription): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    inline def setAlarmRule(value: AlarmRule): Self = StObject.set(x, "AlarmRule", value.asInstanceOf[js.Any])
    
    inline def setAlarmRuleUndefined: Self = StObject.set(x, "AlarmRule", js.undefined)
    
    inline def setInsufficientDataActions(value: ResourceList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    inline def setInsufficientDataActionsVarargs(value: ResourceName*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value*))
    
    inline def setOKActions(value: ResourceList): Self = StObject.set(x, "OKActions", value.asInstanceOf[js.Any])
    
    inline def setOKActionsUndefined: Self = StObject.set(x, "OKActions", js.undefined)
    
    inline def setOKActionsVarargs(value: ResourceName*): Self = StObject.set(x, "OKActions", js.Array(value*))
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonData(value: StateReasonData): Self = StObject.set(x, "StateReasonData", value.asInstanceOf[js.Any])
    
    inline def setStateReasonDataUndefined: Self = StObject.set(x, "StateReasonData", js.undefined)
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateTransitionedTimestamp(value: js.Date): Self = StObject.set(x, "StateTransitionedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionedTimestampUndefined: Self = StObject.set(x, "StateTransitionedTimestamp", js.undefined)
    
    inline def setStateUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "StateUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStateUpdatedTimestampUndefined: Self = StObject.set(x, "StateUpdatedTimestamp", js.undefined)
    
    inline def setStateValue(value: StateValue): Self = StObject.set(x, "StateValue", value.asInstanceOf[js.Any])
    
    inline def setStateValueUndefined: Self = StObject.set(x, "StateValue", js.undefined)
  }
}
