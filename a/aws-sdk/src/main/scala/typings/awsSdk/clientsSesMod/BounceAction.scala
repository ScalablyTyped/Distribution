package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BounceAction extends StObject {
  
  /**
    * Human-readable text to include in the bounce message.
    */
  var Message: BounceMessage
  
  /**
    * The email address of the sender of the bounced email. This is the address from which the bounce message will be sent.
    */
  var Sender: Address
  
  /**
    * The SMTP reply code, as defined by RFC 5321.
    */
  var SmtpReplyCode: BounceSmtpReplyCode
  
  /**
    * The SMTP enhanced status code, as defined by RFC 3463.
    */
  var StatusCode: js.UndefOr[BounceStatusCode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}
object BounceAction {
  
  inline def apply(Message: BounceMessage, Sender: Address, SmtpReplyCode: BounceSmtpReplyCode): BounceAction = {
    val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], SmtpReplyCode = SmtpReplyCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BounceAction]
  }
  
  extension [Self <: BounceAction](x: Self) {
    
    inline def setMessage(value: BounceMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setSender(value: Address): Self = StObject.set(x, "Sender", value.asInstanceOf[js.Any])
    
    inline def setSmtpReplyCode(value: BounceSmtpReplyCode): Self = StObject.set(x, "SmtpReplyCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: BounceStatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    inline def setTopicArn(value: AmazonResourceName): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
  }
}
