package typings.awsLambda.sesMod

import typings.awsLambda.awsLambdaStrings.Bounce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SESReceiptBounceAction extends StObject {
  
  var message: String
  
  var sender: String
  
  var smtpReplyCode: String
  
  var statusCode: String
  
  var topicArn: js.UndefOr[String] = js.undefined
  
  var `type`: Bounce
}
object SESReceiptBounceAction {
  
  inline def apply(message: String, sender: String, smtpReplyCode: String, statusCode: String): SESReceiptBounceAction = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], smtpReplyCode = smtpReplyCode.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Bounce")
    __obj.asInstanceOf[SESReceiptBounceAction]
  }
  
  extension [Self <: SESReceiptBounceAction](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSender(value: String): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSmtpReplyCode(value: String): Self = StObject.set(x, "smtpReplyCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setTopicArn(value: String): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    
    inline def setType(value: Bounce): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
