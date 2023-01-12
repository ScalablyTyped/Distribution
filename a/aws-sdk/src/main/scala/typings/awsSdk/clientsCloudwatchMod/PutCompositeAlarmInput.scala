package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutCompositeAlarmInput extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state of the composite alarm. The default is TRUE.
    */
  var ActionsEnabled: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ActionsEnabled] = js.undefined
  
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
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  | arn:aws:ssm:region:account-id:opsitem:severity  
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The description for the composite alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AlarmDescription] = js.undefined
  
  /**
    * The name for the composite alarm. This name must be unique within the Region.
    */
  var AlarmName: typings.awsSdk.clientsCloudwatchMod.AlarmName
  
  /**
    * An expression that specifies which other alarms are to be evaluated to determine this composite alarm's state. For each alarm that you reference, you designate a function that specifies whether that alarm needs to be in ALARM state, OK state, or INSUFFICIENT_DATA state. You can use operators (AND, OR and NOT) to combine multiple functions in a single expression. You can use parenthesis to logically group the functions in your expression. You can use either alarm names or ARNs to reference the other alarms that are to be evaluated. Functions can include the following:    ALARM("alarm-name or alarm-ARN") is TRUE if the named alarm is in ALARM state.    OK("alarm-name or alarm-ARN") is TRUE if the named alarm is in OK state.    INSUFFICIENT_DATA("alarm-name or alarm-ARN") is TRUE if the named alarm is in INSUFFICIENT_DATA state.    TRUE always evaluates to TRUE.    FALSE always evaluates to FALSE.   TRUE and FALSE are useful for testing a complex AlarmRule structure, and for testing your alarm actions. Alarm names specified in AlarmRule can be surrounded with double-quotes ("), but do not have to be. The following are some examples of AlarmRule:    ALARM(CPUUtilizationTooHigh) AND ALARM(DiskReadOpsTooHigh) specifies that the composite alarm goes into ALARM state only if both CPUUtilizationTooHigh and DiskReadOpsTooHigh alarms are in ALARM state.    ALARM(CPUUtilizationTooHigh) AND NOT ALARM(DeploymentInProgress) specifies that the alarm goes to ALARM state if CPUUtilizationTooHigh is in ALARM state and DeploymentInProgress is not in ALARM state. This example reduces alarm noise during a known deployment window.    (ALARM(CPUUtilizationTooHigh) OR ALARM(DiskReadOpsTooHigh)) AND OK(NetworkOutTooHigh) goes into ALARM state if CPUUtilizationTooHigh OR DiskReadOpsTooHigh is in ALARM state, and if NetworkOutTooHigh is in OK state. This provides another example of using a composite alarm to prevent noise. This rule ensures that you are not notified with an alarm action on high CPU or disk usage if a known network problem is also occurring.   The AlarmRule can specify as many as 100 "children" alarms. The AlarmRule expression can have as many as 500 elements. Elements are child alarms, TRUE or FALSE statements, and parentheses.
    */
  var AlarmRule: typings.awsSdk.clientsCloudwatchMod.AlarmRule
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to an OK state from any other state. Each action is specified as an Amazon Resource Name (ARN). Valid Values: arn:aws:sns:region:account-id:sns-topic-name  
    */
  var OKActions: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * A list of key-value pairs to associate with the composite alarm. You can associate as many as 50 tags with an alarm. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PutCompositeAlarmInput {
  
  inline def apply(AlarmName: AlarmName, AlarmRule: AlarmRule): PutCompositeAlarmInput = {
    val __obj = js.Dynamic.literal(AlarmName = AlarmName.asInstanceOf[js.Any], AlarmRule = AlarmRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCompositeAlarmInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutCompositeAlarmInput] (val x: Self) extends AnyVal {
    
    inline def setActionsEnabled(value: ActionsEnabled): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    inline def setActionsSuppressor(value: AlarmArn): Self = StObject.set(x, "ActionsSuppressor", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorExtensionPeriod(value: SuppressorPeriod): Self = StObject.set(x, "ActionsSuppressorExtensionPeriod", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorExtensionPeriodUndefined: Self = StObject.set(x, "ActionsSuppressorExtensionPeriod", js.undefined)
    
    inline def setActionsSuppressorUndefined: Self = StObject.set(x, "ActionsSuppressor", js.undefined)
    
    inline def setActionsSuppressorWaitPeriod(value: SuppressorPeriod): Self = StObject.set(x, "ActionsSuppressorWaitPeriod", value.asInstanceOf[js.Any])
    
    inline def setActionsSuppressorWaitPeriodUndefined: Self = StObject.set(x, "ActionsSuppressorWaitPeriod", js.undefined)
    
    inline def setAlarmActions(value: ResourceList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    inline def setAlarmActionsVarargs(value: ResourceName*): Self = StObject.set(x, "AlarmActions", js.Array(value*))
    
    inline def setAlarmDescription(value: AlarmDescription): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    inline def setAlarmName(value: AlarmName): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmRule(value: AlarmRule): Self = StObject.set(x, "AlarmRule", value.asInstanceOf[js.Any])
    
    inline def setInsufficientDataActions(value: ResourceList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    inline def setInsufficientDataActionsVarargs(value: ResourceName*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value*))
    
    inline def setOKActions(value: ResourceList): Self = StObject.set(x, "OKActions", value.asInstanceOf[js.Any])
    
    inline def setOKActionsUndefined: Self = StObject.set(x, "OKActions", js.undefined)
    
    inline def setOKActionsVarargs(value: ResourceName*): Self = StObject.set(x, "OKActions", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
