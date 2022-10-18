package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule you want to delete.
    */
  var Arn: NotificationRuleArn
}
object DeleteNotificationRuleRequest {
  
  inline def apply(Arn: NotificationRuleArn): DeleteNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRuleRequest]
  }
  
  extension [Self <: DeleteNotificationRuleRequest](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
  }
}
