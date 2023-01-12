package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.undefined
}
object CreateNotificationRuleResult {
  
  inline def apply(): CreateNotificationRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationRuleResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNotificationRuleResult] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
