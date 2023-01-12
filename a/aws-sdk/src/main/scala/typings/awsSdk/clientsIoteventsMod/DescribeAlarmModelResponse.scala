package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmModelResponse extends StObject {
  
  /**
    * Contains the configuration information of alarm state changes.
    */
  var alarmCapabilities: js.UndefOr[AlarmCapabilities] = js.undefined
  
  /**
    * Contains information about one or more alarm actions.
    */
  var alarmEventActions: js.UndefOr[AlarmEventActions] = js.undefined
  
  /**
    * The ARN of the alarm model. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined
  
  /**
    * The description of the alarm model.
    */
  var alarmModelDescription: js.UndefOr[AlarmModelDescription] = js.undefined
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: js.UndefOr[AlarmModelName] = js.undefined
  
  /**
    * The version of the alarm model.
    */
  var alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined
  
  /**
    * Contains information about one or more notification actions.
    */
  var alarmNotification: js.UndefOr[AlarmNotification] = js.undefined
  
  /**
    * Defines when your alarm is invoked.
    */
  var alarmRule: js.UndefOr[AlarmRule] = js.undefined
  
  /**
    * The time the alarm model was created, in the Unix epoch format.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An input attribute used as a key to create an alarm. AWS IoT Events routes inputs associated with this key to the alarm.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.undefined
  
  /**
    * The time the alarm model was last updated, in the Unix epoch format.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * A non-negative integer that reflects the severity level of the alarm.
    */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
    * The status of the alarm model. The status can be one of the following values:    ACTIVE - The alarm model is active and it's ready to evaluate data.    ACTIVATING - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to a few minutes.    INACTIVE - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model information and update the alarm model.    FAILED - You couldn't create or update the alarm model. Check your alarm model information and try again.  
    */
  var status: js.UndefOr[AlarmModelVersionStatus] = js.undefined
  
  /**
    *  Contains information about the status of the alarm model. 
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
}
object DescribeAlarmModelResponse {
  
  inline def apply(): DescribeAlarmModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmModelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlarmModelResponse] (val x: Self) extends AnyVal {
    
    inline def setAlarmCapabilities(value: AlarmCapabilities): Self = StObject.set(x, "alarmCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAlarmCapabilitiesUndefined: Self = StObject.set(x, "alarmCapabilities", js.undefined)
    
    inline def setAlarmEventActions(value: AlarmEventActions): Self = StObject.set(x, "alarmEventActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmEventActionsUndefined: Self = StObject.set(x, "alarmEventActions", js.undefined)
    
    inline def setAlarmModelArn(value: AlarmModelArn): Self = StObject.set(x, "alarmModelArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelArnUndefined: Self = StObject.set(x, "alarmModelArn", js.undefined)
    
    inline def setAlarmModelDescription(value: AlarmModelDescription): Self = StObject.set(x, "alarmModelDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelDescriptionUndefined: Self = StObject.set(x, "alarmModelDescription", js.undefined)
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelNameUndefined: Self = StObject.set(x, "alarmModelName", js.undefined)
    
    inline def setAlarmModelVersion(value: AlarmModelVersion): Self = StObject.set(x, "alarmModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionUndefined: Self = StObject.set(x, "alarmModelVersion", js.undefined)
    
    inline def setAlarmNotification(value: AlarmNotification): Self = StObject.set(x, "alarmNotification", value.asInstanceOf[js.Any])
    
    inline def setAlarmNotificationUndefined: Self = StObject.set(x, "alarmNotification", js.undefined)
    
    inline def setAlarmRule(value: AlarmRule): Self = StObject.set(x, "alarmRule", value.asInstanceOf[js.Any])
    
    inline def setAlarmRuleUndefined: Self = StObject.set(x, "alarmRule", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setKey(value: AttributeJsonPath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStatus(value: AlarmModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
