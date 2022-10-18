package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn
}
object DescribeNotificationRuleRequest {
  
  inline def apply(Arn: NotificationRuleArn): DescribeNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleRequest]
  }
  
  extension [Self <: DescribeNotificationRuleRequest](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
