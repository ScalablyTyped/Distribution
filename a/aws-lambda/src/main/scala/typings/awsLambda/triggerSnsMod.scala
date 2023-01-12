package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerSnsMod {
  
  trait SNSEvent extends StObject {
    
    var Records: js.Array[SNSEventRecord]
  }
  object SNSEvent {
    
    inline def apply(Records: js.Array[SNSEventRecord]): SNSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SNSEvent] (val x: Self) extends AnyVal {
      
      inline def setRecords(value: js.Array[SNSEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: SNSEventRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  trait SNSEventRecord extends StObject {
    
    var EventSource: String
    
    var EventSubscriptionArn: String
    
    var EventVersion: String
    
    var Sns: SNSMessage
  }
  object SNSEventRecord {
    
    inline def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSMessage): SNSEventRecord = {
      val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSEventRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SNSEventRecord] (val x: Self) extends AnyVal {
      
      inline def setEventSource(value: String): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSubscriptionArn(value: String): Self = StObject.set(x, "EventSubscriptionArn", value.asInstanceOf[js.Any])
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "EventVersion", value.asInstanceOf[js.Any])
      
      inline def setSns(value: SNSMessage): Self = StObject.set(x, "Sns", value.asInstanceOf[js.Any])
    }
  }
  
  type SNSHandler = Handler[SNSEvent, Unit]
  
  trait SNSMessage extends StObject {
    
    var Message: String
    
    var MessageAttributes: SNSMessageAttributes
    
    var MessageId: String
    
    var Signature: String
    
    var SignatureVersion: String
    
    var SigningCertUrl: String
    
    var Subject: String
    
    var Timestamp: String
    
    var Token: js.UndefOr[String] = js.undefined
    
    var TopicArn: String
    
    var Type: String
    
    var UnsubscribeUrl: String
  }
  object SNSMessage {
    
    inline def apply(
      Message: String,
      MessageAttributes: SNSMessageAttributes,
      MessageId: String,
      Signature: String,
      SignatureVersion: String,
      SigningCertUrl: String,
      Subject: String,
      Timestamp: String,
      TopicArn: String,
      Type: String,
      UnsubscribeUrl: String
    ): SNSMessage = {
      val __obj = js.Dynamic.literal(Message = Message.asInstanceOf[js.Any], MessageAttributes = MessageAttributes.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], Signature = Signature.asInstanceOf[js.Any], SignatureVersion = SignatureVersion.asInstanceOf[js.Any], SigningCertUrl = SigningCertUrl.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UnsubscribeUrl = UnsubscribeUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SNSMessage] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributes(value: SNSMessageAttributes): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureVersion(value: String): Self = StObject.set(x, "SignatureVersion", value.asInstanceOf[js.Any])
      
      inline def setSigningCertUrl(value: String): Self = StObject.set(x, "SigningCertUrl", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
      
      inline def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribeUrl(value: String): Self = StObject.set(x, "UnsubscribeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SNSMessageAttribute extends StObject {
    
    var Type: String
    
    var Value: String
  }
  object SNSMessageAttribute {
    
    inline def apply(Type: String, Value: String): SNSMessageAttribute = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSMessageAttribute]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SNSMessageAttribute] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type SNSMessageAttributes = StringDictionary[SNSMessageAttribute]
}
