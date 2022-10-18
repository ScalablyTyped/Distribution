package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationRuleSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.undefined
  
  /**
    * The unique ID of the notification rule.
    */
  var Id: js.UndefOr[NotificationRuleId] = js.undefined
}
object NotificationRuleSummary {
  
  inline def apply(): NotificationRuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationRuleSummary]
  }
  
  extension [Self <: NotificationRuleSummary](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: NotificationRuleId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
