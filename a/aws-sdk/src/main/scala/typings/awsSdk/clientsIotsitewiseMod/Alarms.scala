package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Alarms extends StObject {
  
  /**
    * The ARN of the IAM role that allows the alarm to perform actions and access Amazon Web Services resources and services, such as IoT Events.
    */
  var alarmRoleArn: ARN
  
  /**
    * The ARN of the Lambda function that manages alarm notifications. For more information, see Managing alarm notifications in the IoT Events Developer Guide.
    */
  var notificationLambdaArn: js.UndefOr[ARN] = js.undefined
}
object Alarms {
  
  inline def apply(alarmRoleArn: ARN): Alarms = {
    val __obj = js.Dynamic.literal(alarmRoleArn = alarmRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Alarms] (val x: Self) extends AnyVal {
    
    inline def setAlarmRoleArn(value: ARN): Self = StObject.set(x, "alarmRoleArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationLambdaArn(value: ARN): Self = StObject.set(x, "notificationLambdaArn", value.asInstanceOf[js.Any])
    
    inline def setNotificationLambdaArnUndefined: Self = StObject.set(x, "notificationLambdaArn", js.undefined)
  }
}
