package typings.awsSdk.appconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monitor extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the Amazon CloudWatch alarm.
    */
  var AlarmArn: StringWithLengthBetween1And2048
  
  /**
    * ARN of an Identity and Access Management (IAM) role for AppConfig to monitor AlarmArn.
    */
  var AlarmRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object Monitor {
  
  inline def apply(AlarmArn: StringWithLengthBetween1And2048): Monitor = {
    val __obj = js.Dynamic.literal(AlarmArn = AlarmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monitor]
  }
  
  extension [Self <: Monitor](x: Self) {
    
    inline def setAlarmArn(value: StringWithLengthBetween1And2048): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmRoleArn(value: RoleArn): Self = StObject.set(x, "AlarmRoleArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmRoleArnUndefined: Self = StObject.set(x, "AlarmRoleArn", js.undefined)
  }
}
