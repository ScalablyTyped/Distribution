package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsMod {
  
  @js.native
  trait SQSEvent extends StObject {
    
    var Records: js.Array[SQSRecord] = js.native
  }
  object SQSEvent {
    
    @scala.inline
    def apply(Records: js.Array[SQSRecord]): SQSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSEvent]
    }
    
    @scala.inline
    implicit class SQSEventMutableBuilder[Self <: SQSEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[SQSRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: SQSRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type SQSHandler = Handler[SQSEvent, Unit]
  
  @js.native
  trait SQSMessageAttribute extends StObject {
    
    // Not implemented. Reserved for future use.
    var binaryListValues: js.Array[scala.Nothing] = js.native
    
    var binaryValue: js.UndefOr[String] = js.native
    
    // Not implemented. Reserved for future use.
    var dataType: SQSMessageAttributeDataType = js.native
    
    var stringListValues: js.Array[scala.Nothing] = js.native
    
    var stringValue: js.UndefOr[String] = js.native
  }
  object SQSMessageAttribute {
    
    @scala.inline
    def apply(
      binaryListValues: js.Array[scala.Nothing],
      dataType: SQSMessageAttributeDataType,
      stringListValues: js.Array[scala.Nothing]
    ): SQSMessageAttribute = {
      val __obj = js.Dynamic.literal(binaryListValues = binaryListValues.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], stringListValues = stringListValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSMessageAttribute]
    }
    
    @scala.inline
    implicit class SQSMessageAttributeMutableBuilder[Self <: SQSMessageAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryListValues(value: js.Array[scala.Nothing]): Self = StObject.set(x, "binaryListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryListValuesVarargs(value: scala.Nothing*): Self = StObject.set(x, "binaryListValues", js.Array(value :_*))
      
      @scala.inline
      def setBinaryValue(value: String): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
      
      @scala.inline
      def setDataType(value: SQSMessageAttributeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringListValues(value: js.Array[scala.Nothing]): Self = StObject.set(x, "stringListValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringListValuesVarargs(value: scala.Nothing*): Self = StObject.set(x, "stringListValues", js.Array(value :_*))
      
      @scala.inline
      def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.String
    - typings.awsLambda.awsLambdaStrings.Number
    - typings.awsLambda.awsLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = _SQSMessageAttributeDataType | String
  
  type SQSMessageAttributes = StringDictionary[SQSMessageAttribute]
  
  @js.native
  trait SQSRecord extends StObject {
    
    var attributes: SQSRecordAttributes = js.native
    
    var awsRegion: String = js.native
    
    var body: String = js.native
    
    var eventSource: String = js.native
    
    var eventSourceARN: String = js.native
    
    var md5OfBody: String = js.native
    
    var messageAttributes: SQSMessageAttributes = js.native
    
    var messageId: String = js.native
    
    var receiptHandle: String = js.native
  }
  object SQSRecord {
    
    @scala.inline
    def apply(
      attributes: SQSRecordAttributes,
      awsRegion: String,
      body: String,
      eventSource: String,
      eventSourceARN: String,
      md5OfBody: String,
      messageAttributes: SQSMessageAttributes,
      messageId: String,
      receiptHandle: String
    ): SQSRecord = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], awsRegion = awsRegion.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventSourceARN = eventSourceARN.asInstanceOf[js.Any], md5OfBody = md5OfBody.asInstanceOf[js.Any], messageAttributes = messageAttributes.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], receiptHandle = receiptHandle.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSRecord]
    }
    
    @scala.inline
    implicit class SQSRecordMutableBuilder[Self <: SQSRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: SQSRecordAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMd5OfBody(value: String): Self = StObject.set(x, "md5OfBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributes(value: SQSMessageAttributes): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptHandle(value: String): Self = StObject.set(x, "receiptHandle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQSRecordAttributes extends StObject {
    
    var AWSTraceHeader: js.UndefOr[String] = js.native
    
    var ApproximateFirstReceiveTimestamp: String = js.native
    
    var ApproximateReceiveCount: String = js.native
    
    var MessageDeduplicationId: js.UndefOr[String] = js.native
    
    var MessageGroupId: js.UndefOr[String] = js.native
    
    var SenderId: String = js.native
    
    var SentTimestamp: String = js.native
    
    var SequenceNumber: js.UndefOr[String] = js.native
  }
  object SQSRecordAttributes {
    
    @scala.inline
    def apply(
      ApproximateFirstReceiveTimestamp: String,
      ApproximateReceiveCount: String,
      SenderId: String,
      SentTimestamp: String
    ): SQSRecordAttributes = {
      val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSRecordAttributes]
    }
    
    @scala.inline
    implicit class SQSRecordAttributesMutableBuilder[Self <: SQSRecordAttributes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAWSTraceHeader(value: String): Self = StObject.set(x, "AWSTraceHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAWSTraceHeaderUndefined: Self = StObject.set(x, "AWSTraceHeader", js.undefined)
      
      @scala.inline
      def setApproximateFirstReceiveTimestamp(value: String): Self = StObject.set(x, "ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproximateReceiveCount(value: String): Self = StObject.set(x, "ApproximateReceiveCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
      
      @scala.inline
      def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSentTimestamp(value: String): Self = StObject.set(x, "SentTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    }
  }
  
  trait _SQSMessageAttributeDataType extends StObject
}
