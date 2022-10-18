package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmModelVersionSummary extends StObject {
  
  /**
    * The ARN of the alarm model. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: js.UndefOr[AlarmModelName] = js.undefined
  
  /**
    * The version of the alarm model.
    */
  var alarmModelVersion: js.UndefOr[AlarmModelVersion] = js.undefined
  
  /**
    * The time the alarm model was created, in the Unix epoch format.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the alarm model was last updated, in the Unix epoch format.
    */
  var lastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the alarm to perform actions and access AWS resources. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var roleArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The status of the alarm model. The status can be one of the following values:    ACTIVE - The alarm model is active and it's ready to evaluate data.    ACTIVATING - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to a few minutes.    INACTIVE - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model information and update the alarm model.    FAILED - You couldn't create or update the alarm model. Check your alarm model information and try again.  
    */
  var status: js.UndefOr[AlarmModelVersionStatus] = js.undefined
  
  /**
    *  Contains information about the status of the alarm model version. 
    */
  var statusMessage: js.UndefOr[StatusMessage] = js.undefined
}
object AlarmModelVersionSummary {
  
  inline def apply(): AlarmModelVersionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlarmModelVersionSummary]
  }
  
  extension [Self <: AlarmModelVersionSummary](x: Self) {
    
    inline def setAlarmModelArn(value: AlarmModelArn): Self = StObject.set(x, "alarmModelArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelArnUndefined: Self = StObject.set(x, "alarmModelArn", js.undefined)
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelNameUndefined: Self = StObject.set(x, "alarmModelName", js.undefined)
    
    inline def setAlarmModelVersion(value: AlarmModelVersion): Self = StObject.set(x, "alarmModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionUndefined: Self = StObject.set(x, "alarmModelVersion", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setStatus(value: AlarmModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
