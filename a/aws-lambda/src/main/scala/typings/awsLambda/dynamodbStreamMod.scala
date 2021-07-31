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
    
    @scala.inline
    def apply(): AttributeValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttributeValue]
    }
    
    @scala.inline
    implicit class AttributeValueMutableBuilder[Self <: AttributeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: String): Self = StObject.set(x, "B", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOL(value: Boolean): Self = StObject.set(x, "BOOL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBOOLUndefined: Self = StObject.set(x, "BOOL", js.undefined)
      
      @scala.inline
      def setBS(value: js.Array[String]): Self = StObject.set(x, "BS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBSUndefined: Self = StObject.set(x, "BS", js.undefined)
      
      @scala.inline
      def setBSVarargs(value: String*): Self = StObject.set(x, "BS", js.Array(value :_*))
      
      @scala.inline
      def setBUndefined: Self = StObject.set(x, "B", js.undefined)
      
      @scala.inline
      def setL(value: js.Array[AttributeValue]): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLUndefined: Self = StObject.set(x, "L", js.undefined)
      
      @scala.inline
      def setLVarargs(value: AttributeValue*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      @scala.inline
      def setM(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMUndefined: Self = StObject.set(x, "M", js.undefined)
      
      @scala.inline
      def setN(value: String): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNS(value: js.Array[String]): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNSUndefined: Self = StObject.set(x, "NS", js.undefined)
      
      @scala.inline
      def setNSVarargs(value: String*): Self = StObject.set(x, "NS", js.Array(value :_*))
      
      @scala.inline
      def setNULL(value: Boolean): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNULLUndefined: Self = StObject.set(x, "NULL", js.undefined)
      
      @scala.inline
      def setNUndefined: Self = StObject.set(x, "N", js.undefined)
      
      @scala.inline
      def setS(value: String): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSS(value: js.Array[String]): Self = StObject.set(x, "SS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSSUndefined: Self = StObject.set(x, "SS", js.undefined)
      
      @scala.inline
      def setSSVarargs(value: String*): Self = StObject.set(x, "SS", js.Array(value :_*))
      
      @scala.inline
      def setSUndefined: Self = StObject.set(x, "S", js.undefined)
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
    
    var userIdentity: js.UndefOr[js.Any] = js.undefined
  }
  object DynamoDBRecord {
    
    @scala.inline
    def apply(): DynamoDBRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamoDBRecord]
    }
    
    @scala.inline
    implicit class DynamoDBRecordMutableBuilder[Self <: DynamoDBRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwsRegion(value: String): Self = StObject.set(x, "awsRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwsRegionUndefined: Self = StObject.set(x, "awsRegion", js.undefined)
      
      @scala.inline
      def setDynamodb(value: StreamRecord): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
      
      @scala.inline
      def setEventID(value: String): Self = StObject.set(x, "eventID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventIDUndefined: Self = StObject.set(x, "eventID", js.undefined)
      
      @scala.inline
      def setEventName(value: INSERT | MODIFY | REMOVE): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceARN(value: String): Self = StObject.set(x, "eventSourceARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceARNUndefined: Self = StObject.set(x, "eventSourceARN", js.undefined)
      
      @scala.inline
      def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      @scala.inline
      def setEventVersion(value: String): Self = StObject.set(x, "eventVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventVersionUndefined: Self = StObject.set(x, "eventVersion", js.undefined)
      
      @scala.inline
      def setUserIdentity(value: js.Any): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdentityUndefined: Self = StObject.set(x, "userIdentity", js.undefined)
    }
  }
  
  trait DynamoDBStreamEvent extends StObject {
    
    var Records: js.Array[DynamoDBRecord]
  }
  object DynamoDBStreamEvent {
    
    @scala.inline
    def apply(Records: js.Array[DynamoDBRecord]): DynamoDBStreamEvent = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBStreamEvent]
    }
    
    @scala.inline
    implicit class DynamoDBStreamEventMutableBuilder[Self <: DynamoDBStreamEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[DynamoDBRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: DynamoDBRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  
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
    
    @scala.inline
    def apply(): StreamRecord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamRecord]
    }
    
    @scala.inline
    implicit class StreamRecordMutableBuilder[Self <: StreamRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApproximateCreationDateTime(value: Double): Self = StObject.set(x, "ApproximateCreationDateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApproximateCreationDateTimeUndefined: Self = StObject.set(x, "ApproximateCreationDateTime", js.undefined)
      
      @scala.inline
      def setKeys(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
      
      @scala.inline
      def setNewImage(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "NewImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewImageUndefined: Self = StObject.set(x, "NewImage", js.undefined)
      
      @scala.inline
      def setOldImage(value: StringDictionary[AttributeValue]): Self = StObject.set(x, "OldImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldImageUndefined: Self = StObject.set(x, "OldImage", js.undefined)
      
      @scala.inline
      def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceNumberUndefined: Self = StObject.set(x, "SequenceNumber", js.undefined)
      
      @scala.inline
      def setSizeBytes(value: Double): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
      
      @scala.inline
      def setStreamViewType(value: KEYS_ONLY | NEW_IMAGE | OLD_IMAGE | NEW_AND_OLD_IMAGES): Self = StObject.set(x, "StreamViewType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamViewTypeUndefined: Self = StObject.set(x, "StreamViewType", js.undefined)
    }
  }
}
