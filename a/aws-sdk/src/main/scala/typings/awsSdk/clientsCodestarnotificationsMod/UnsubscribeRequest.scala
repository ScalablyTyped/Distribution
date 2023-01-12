package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnsubscribeRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn
  
  /**
    * The ARN of the Chatbot topic to unsubscribe from the notification rule.
    */
  var TargetAddress: typings.awsSdk.clientsCodestarnotificationsMod.TargetAddress
}
object UnsubscribeRequest {
  
  inline def apply(Arn: NotificationRuleArn, TargetAddress: TargetAddress): UnsubscribeRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], TargetAddress = TargetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsubscribeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnsubscribeRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setTargetAddress(value: TargetAddress): Self = StObject.set(x, "TargetAddress", value.asInstanceOf[js.Any])
  }
}
