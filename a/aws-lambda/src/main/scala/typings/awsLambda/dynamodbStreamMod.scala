package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.INSERT
import typings.awsLambda.awsLambdaStrings.KEYS_ONLY
import typings.awsLambda.awsLambdaStrings.MODIFY
import typings.awsLambda.awsLambdaStrings.NEW_AND_OLD_IMAGES
import typings.awsLambda.awsLambdaStrings.NEW_IMAGE
import typings.awsLambda.awsLambdaStrings.OLD_IMAGE
import typings.awsLambda.awsLambdaStrings.REMOVE
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dynamodbStreamMod {
  
  trait AttributeValue extends StObject {
    
    var B: js.UndefOr[String] = js.undefined
    
    var BOOL: js.UndefOr[Boolean] = js.undefined
    
    var BS: js.UndefOr[js.Array[String]] = js.undefined
    
    var L: js.UndefOr[js.Array[AttributeValue]] = js.undefined
    
    var M: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
    
    var N: js.UndefOr[String] = js.undefined
    
    var NS: js.UndefOr[js.Array[String]] = js.undefined
    
    var NULL: js.UndefOr[Boolean] = js.undefined
    
    var S: js.UndefOr[String] = js.undefined
    
    var SS: js.UndefOr[js.Array[String]] = js.undefined
  }
  object AttributeValue {
    
    inline def apply(): AttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValue]
    }
    
    extension [Self <: AttributeValue](x: Self) {
      
      inline def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      inline def setBOOL(value: Boolean): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
      
      inline def setBOOLUndefined: Self = StObject.set(x, "BOOL", js.undefined)
      
      inline def setBS(value: js.Array[String]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      inline def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      inline def setBSVarargs(value: String*): Self = StObject.set(x, "BS", js.Array(value*))
      
      inline def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      inline def setL(value: js.Array[AttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      inline def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value*))
      
      inline def setM(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      inline def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      inline def setNS(value: js.Array[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      inline def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value*))
      
      inline def setNULL(value: Boolean): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      inline def setNULLUndefined: Self = StObject.set(x, "NULL", js.undefined)
      
      inline def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      inline def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setSS(value: js.Array[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      inline def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      inline def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value*))
      
      inline def setSUndefined: Self = StObject.set(x, "S", js.undefined)
    }
  }
  
  trait DynamoDBBatchItemFailure extends StObject {
    
    var itemIdentifier: String
  }
  object DynamoDBBatchItemFailure {
    
    inline def apply(itemIdentifier: String): DynamoDBBatchItemFailure = {
      val __obj = js.Dynamic.literal(itemIdentifier = itemIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBBatchItemFailure]
    }
    
    extension [Self <: DynamoDBBatchItemFailure](x: Self) {
      
      inline def setItemIdentifier(value: String): Self = StObject.set(x, "itemIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait DynamoDBBatchResponse extends StObject {
    
    var batchItemFailures: js.Array[DynamoDBBatchItemFailure]
  }
  object DynamoDBBatchResponse {
    
    inline def apply(batchItemFailures: js.Array[DynamoDBBatchItemFailure]): DynamoDBBatchResponse = {
      val __obj = js.Dynamic.literal(batchItemFailures = batchItemFailures.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBBatchResponse]
    }
    
    extension [Self <: DynamoDBBatchResponse](x: Self) {
      
      inline def setBatchItemFailures(value: js.Array[DynamoDBBatchItemFailure]): Self = StObject.set(x, "batchItemFailures", value.asInstanceOf[js.Any])
      
      inline def setBatchItemFailuresVarargs(value: DynamoDBBatchItemFailure*): Self = StObject.set(x, "batchItemFailures", js.Array(value*))
    }
  }
  
  trait DynamoDBRecord extends StObject {
    
    var awsRegion: js.UndefOr[String] = js.undefined
    
    var dynamodb: js.UndefOr[StreamRecord] = js.undefined
    
    var eventID: js.UndefOr[String] = js.undefined
    
    var eventName: js.UndefOr[INSERT | MODIFY | REMOVE] = js.undefined
    
    var eventSource: js.UndefOr[String] = js.undefined
    
    var eventSourceARN: js.UndefOr[String] = js.undefined
    
    var eventVersion: js.UndefOr[String] = js.undefined
    
    var userIdentity: js.UndefOr[Any] = js.undefined
  }
  object DynamoDBRecord {
    
    inline def apply(): DynamoDBRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamoDBRecord]
    }
    
    extension [Self <: DynamoDBRecord](x: Self) {
      
      inline def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      inline def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
      
      inline def setDynamodb(value: StreamRecord): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      inline def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      inline def setEventIDUndefined: Self = StObject.set(x, "eventID", js.undefined)
      
      inline def setEventName(value: INSERT | MODIFY | REMOVE): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      inline def setEventSourceARNUndefined: Self = StObject.set(x, "eventSourceARN", js.undefined)
      
      inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      inline def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      inline def setEventVersionUndefined: Self = StObject.set(x, "eventVersion", js.undefined)
      
      inline def setUserIdentity(value: Any): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
      
      inline def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
    }
  }
  
  trait DynamoDBStreamEvent extends StObject {
    
    var Records: js.Array[DynamoDBRecord]
  }
  object DynamoDBStreamEvent {
    
    inline def apply(Records: js.Array[DynamoDBRecord]): DynamoDBStreamEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBStreamEvent]
    }
    
    extension [Self <: DynamoDBStreamEvent](x: Self) {
      
      inline def setRecords(value: js.Array[DynamoDBRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      inline def setRecordsVarargs(value: DynamoDBRecord*): Self = StObject.set(x, "Records", js.Array(value*))
    }
  }
  
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, DynamoDBBatchResponse | Unit]
  
  trait StreamRecord extends StObject {
    
    var ApproximateCreationDateTime: js.UndefOr[Double] = js.undefined
    
    var Keys: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
    
    var NewImage: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
    
    var OldImage: js.UndefOr[StringDictionary[AttributeValue]] = js.undefined
    
    var SequenceNumber: js.UndefOr[String] = js.undefined
    
    var SizeBytes: js.UndefOr[Double] = js.undefined
    
    var StreamViewType: js.UndefOr[KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES] = js.undefined
  }
  object StreamRecord {
    
    inline def apply(): StreamRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamRecord]
    }
    
    extension [Self <: StreamRecord](x: Self) {
      
      inline def setApproximateCreationDateTime(value: Double): Self = StObject.set(x, "ApproximateCreationDateTime", value.asInstanceOf[js.Any])
      
      inline def setApproximateCreationDateTimeUndefined: Self = StObject.set(x, "ApproximateCreationDateTime", js.undefined)
      
      inline def setKeys(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
      
      inline def setNewImage(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "NewImage", value.asInstanceOf[js.Any])
      
      inline def setNewImageUndefined: Self = StObject.set(x, "NewImage", js.undefined)
      
      inline def setOldImage(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "OldImage", value.asInstanceOf[js.Any])
      
      inline def setOldImageUndefined: Self = StObject.set(x, "OldImage", js.undefined)
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
      
      inline def setSizeBytes(value: Double): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
      
      inline def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
      
      inline def setStreamViewType(value: KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
      
      inline def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
    }
  }
}
