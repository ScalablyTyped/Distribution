package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule for which you have created assocations.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.undefined
}
object SubscribeResult {
  
  inline def apply(): SubscribeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeResult]
  }
  
  extension [Self <: SubscribeResult](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
