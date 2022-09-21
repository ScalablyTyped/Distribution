package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsMod {
  
  trait SQSBatchItemFailure extends StObject {
    
    var itemIdentifier: String
  }
  object SQSBatchItemFailure {
    
    inline def apply(itemIdentifier: String): SQSBatchItemFailure = {
      val __obj = js.Dynamic.literal(itemIdentifier = itemIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSBatchItemFailure]
    }
    
    extension [Self <: SQSBatchItemFailure](x: Self) {
      
      inline def setItemIdentifier(value: String): Self = StObject.set(x, "itemIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQSBatchResponse extends StObject {
    
    var batchItemFailures: js.Array[SQSBatchItemFailure]
  }
  object SQSBatchResponse {
    
    inline def apply(batchItemFailures: js.Array[SQSBatchItemFailure]): SQSBatchResponse = {
      val __obj = js.Dynamic.literal(batchItemFailures = batchItemFailures.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSBatchResponse]
    }
    
    extension [Self <: SQSBatchResponse](x: Self) {
      
      inline def setBatchItemFailures(value: js.Array[SQSBatchItemFailure]): Self = StObject.set(x, "batchItemFailures", value.asInstanceOf[js.Any])
      
      inline def setBatchItemFailuresVarargs(value: SQSBatchItemFailure*): Self = StObject.set(x, "batchItemFailures", js.Array(value*))
    }
  }
  
  trait SQSEvent extends StObject {
    
    var Records: js.Array[SQSRecord]
  }
  object SQSEvent {
    
    inline def apply(Records: js.Array[SQSRecord]): SQSEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSEvent]
    }
    
    extension [Self <: SQSEvent](x: Self) {
      
      inline def setRecords(value: js.Array[SQSRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: SQSRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  type SQSHandler = Handler[SQSEvent, SQSBatchResponse | Unit]
  
  trait SQSMessageAttribute extends StObject {
    
    // Not implemented. Reserved for future use.
    var binaryListValues: js.UndefOr[js.Array[String]] = js.undefined
    
    var binaryValue: js.UndefOr[String] = js.undefined
    
    // Not implemented. Reserved for future use.
    var dataType: SQSMessageAttributeDataType
    
    var stringListValues: js.UndefOr[js.Array[String]] = js.undefined
    
    var stringValue: js.UndefOr[String] = js.undefined
  }
  object SQSMessageAttribute {
    
    inline def apply(dataType: SQSMessageAttributeDataType): SQSMessageAttribute = {
      val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSMessageAttribute]
    }
    
    extension [Self <: SQSMessageAttribute](x: Self) {
      
      inline def setBinaryListValues(value: js.Array[String]): Self = StObject.set(x, "binaryListValues", value.asInstanceOf[js.Any])
      
      inline def setBinaryListValuesUndefined: Self = StObject.set(x, "binaryListValues", js.undefined)
      
      inline def setBinaryListValuesVarargs(value: String*): Self = StObject.set(x, "binaryListValues", js.Array(value*))
      
      inline def setBinaryValue(value: String): Self = StObject.set(x, "binaryValue", value.asInstanceOf[js.Any])
      
      inline def setBinaryValueUndefined: Self = StObject.set(x, "binaryValue", js.undefined)
      
      inline def setDataType(value: SQSMessageAttributeDataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setStringListValues(value: js.Array[String]): Self = StObject.set(x, "stringListValues", value.asInstanceOf[js.Any])
      
      inline def setStringListValuesUndefined: Self = StObject.set(x, "stringListValues", js.undefined)
      
      inline def setStringListValuesVarargs(value: String*): Self = StObject.set(x, "stringListValues", js.Array(value*))
      
      inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
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
  
  trait SQSRecord extends StObject {
    
    var attributes: SQSRecordAttributes
    
    var awsRegion: String
    
    var body: String
    
    var eventSource: String
    
    var eventSourceARN: String
    
    var md5OfBody: String
    
    var messageAttributes: SQSMessageAttributes
    
    var messageId: String
    
    var receiptHandle: String
  }
  object SQSRecord {
    
    inline def apply(
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
    
    extension [Self <: SQSRecord](x: Self) {
      
      inline def setAttributes(value: SQSRecordAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      inline def setMd5OfBody(value: String): Self = StObject.set(x, "md5OfBody", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributes(value: SQSMessageAttributes): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setReceiptHandle(value: String): Self = StObject.set(x, "receiptHandle", value.asInstanceOf[js.Any])
    }
  }
  
  trait SQSRecordAttributes extends StObject {
    
    var AWSTraceHeader: js.UndefOr[String] = js.undefined
    
    var ApproximateFirstReceiveTimestamp: String
    
    var ApproximateReceiveCount: String
    
    var MessageDeduplicationId: js.UndefOr[String] = js.undefined
    
    var MessageGroupId: js.UndefOr[String] = js.undefined
    
    var SenderId: String
    
    var SentTimestamp: String
    
    var SequenceNumber: js.UndefOr[String] = js.undefined
  }
  object SQSRecordAttributes {
    
    inline def apply(
      ApproximateFirstReceiveTimestamp: String,
      ApproximateReceiveCount: String,
      SenderId: String,
      SentTimestamp: String
    ): SQSRecordAttributes = {
      val __obj = js.Dynamic.literal(ApproximateFirstReceiveTimestamp = ApproximateFirstReceiveTimestamp.asInstanceOf[js.Any], ApproximateReceiveCount = ApproximateReceiveCount.asInstanceOf[js.Any], SenderId = SenderId.asInstanceOf[js.Any], SentTimestamp = SentTimestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSRecordAttributes]
    }
    
    extension [Self <: SQSRecordAttributes](x: Self) {
      
      inline def setAWSTraceHeader(value: String): Self = StObject.set(x, "AWSTraceHeader", value.asInstanceOf[js.Any])
      
      inline def setAWSTraceHeaderUndefined: Self = StObject.set(x, "AWSTraceHeader", js.undefined)
      
      inline def setApproximateFirstReceiveTimestamp(value: String): Self = StObject.set(x, "ApproximateFirstReceiveTimestamp", value.asInstanceOf[js.Any])
      
      inline def setApproximateReceiveCount(value: String): Self = StObject.set(x, "ApproximateReceiveCount", value.asInstanceOf[js.Any])
      
      inline def setMessageDeduplicationId(value: String): Self = StObject.set(x, "MessageDeduplicationId", value.asInstanceOf[js.Any])
      
      inline def setMessageDeduplicationIdUndefined: Self = StObject.set(x, "MessageDeduplicationId", js.undefined)
      
      inline def setMessageGroupId(value: String): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
      
      inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSentTimestamp(value: String): Self = StObject.set(x, "SentTimestamp", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
    }
  }
  
  trait _SQSMessageAttributeDataType extends StObject
}
