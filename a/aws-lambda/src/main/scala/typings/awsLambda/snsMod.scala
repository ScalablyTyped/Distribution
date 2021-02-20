package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snsMod {
  
  @js.native
  trait SNSEvent extends StObject {
    
    var Records: js.Array[SNSEventRecord] = js.native
  }
  object SNSEvent {
    
    @scala.inline
    def apply(Records: js.Array[SNSEventRecord]): SNSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSEvent]
    }
    
    @scala.inline
    implicit class SNSEventMutableBuilder[Self <: SNSEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[SNSEventRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: SNSEventRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SNSEventRecord extends StObject {
    
    var EventSource: String = js.native
    
    var EventSubscriptionArn: String = js.native
    
    var EventVersion: String = js.native
    
    var Sns: SNSMessage = js.native
  }
  object SNSEventRecord {
    
    @scala.inline
    def apply(EventSource: String, EventSubscriptionArn: String, EventVersion: String, Sns: SNSMessage): SNSEventRecord = {
      val __obj = js.Dynamic.literal(EventSource = EventSource.asInstanceOf[js.Any], EventSubscriptionArn = EventSubscriptionArn.asInstanceOf[js.Any], EventVersion = EventVersion.asInstanceOf[js.Any], Sns = Sns.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSEventRecord]
    }
    
    @scala.inline
    implicit class SNSEventRecordMutableBuilder[Self <: SNSEventRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSubscriptionArn(value: String): Self = StObject.set(x, "EventSubscriptionArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "EventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSns(value: SNSMessage): Self = StObject.set(x, "Sns", value.asInstanceOf[js.Any])
    }
  }
  
  type SNSHandler = Handler[SNSEvent, Unit]
  
  @js.native
  trait SNSMessage extends StObject {
    
    var Message: String = js.native
    
    var MessageAttributes: SNSMessageAttributes = js.native
    
    var MessageId: String = js.native
    
    var Signature: String = js.native
    
    var SignatureVersion: String = js.native
    
    var SigningCertUrl: String = js.native
    
    var Subject: String = js.native
    
    var Timestamp: String = js.native
    
    var TopicArn: String = js.native
    
    var Type: String = js.native
    
    var UnsubscribeUrl: String = js.native
  }
  object SNSMessage {
    
    @scala.inline
    def apply(
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
    implicit class SNSMessageMutableBuilder[Self <: SNSMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributes(value: SNSMessageAttributes): Self = StObject.set(x, "MessageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignature(value: String): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureVersion(value: String): Self = StObject.set(x, "SignatureVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigningCertUrl(value: String): Self = StObject.set(x, "SigningCertUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArn(value: String): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsubscribeUrl(value: String): Self = StObject.set(x, "UnsubscribeUrl", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SNSMessageAttribute extends StObject {
    
    var Type: String = js.native
    
    var Value: String = js.native
  }
  object SNSMessageAttribute {
    
    @scala.inline
    def apply(Type: String, Value: String): SNSMessageAttribute = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SNSMessageAttribute]
    }
    
    @scala.inline
    implicit class SNSMessageAttributeMutableBuilder[Self <: SNSMessageAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type SNSMessageAttributes = StringDictionary[SNSMessageAttribute]
}
