package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAlarmModelResponse extends StObject {
  
  /**
    * The ARN of the alarm model. For more information, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var alarmModelArn: js.UndefOr[AlarmModelArn] = js.undefined
  
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
    * The status of the alarm model. The status can be one of the following values:    ACTIVE - The alarm model is active and it's ready to evaluate data.    ACTIVATING - AWS IoT Events is activating your alarm model. Activating an alarm model can take up to a few minutes.    INACTIVE - The alarm model is inactive, so it isn't ready to evaluate data. Check your alarm model information and update the alarm model.    FAILED - You couldn't create or update the alarm model. Check your alarm model information and try again.  
    */
  var status: js.UndefOr[AlarmModelVersionStatus] = js.undefined
}
object CreateAlarmModelResponse {
  
  inline def apply(): CreateAlarmModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAlarmModelResponse]
  }
  
  extension [Self <: CreateAlarmModelResponse](x: Self) {
    
    inline def setAlarmModelArn(value: AlarmModelArn): Self = StObject.set(x, "alarmModelArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelArnUndefined: Self = StObject.set(x, "alarmModelArn", js.undefined)
    
    inline def setAlarmModelVersion(value: AlarmModelVersion): Self = StObject.set(x, "alarmModelVersion", value.asInstanceOf[js.Any])
    
    inline def setAlarmModelVersionUndefined: Self = StObject.set(x, "alarmModelVersion", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setStatus(value: AlarmModelVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
