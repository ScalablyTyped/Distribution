package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monitor extends StObject {
  
  /**
    * ARN of the Amazon CloudWatch alarm.
    */
  var AlarmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * ARN of an IAM role for AppConfig to monitor AlarmArn.
    */
  var AlarmRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object Monitor {
  
  @scala.inline
  def apply(): Monitor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitor]
  }
  
  @scala.inline
  implicit class MonitorMutableBuilder[Self <: Monitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarmArn(value: Arn): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmArnUndefined: Self = StObject.set(x, "AlarmArn", js.undefined)
    
    @scala.inline
    def setAlarmRoleArn(value: RoleArn): Self = StObject.set(x, "AlarmRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmRoleArnUndefined: Self = StObject.set(x, "AlarmRoleArn", js.undefined)
  }
}
