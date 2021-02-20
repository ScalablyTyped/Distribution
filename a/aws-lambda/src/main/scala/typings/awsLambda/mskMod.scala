package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CREATE_TIME
import typings.awsLambda.awsLambdaStrings.LOG_APPEND_TIME
import typings.awsLambda.awsLambdaStrings.awsColonkafka
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskMod {
  
  @js.native
  trait MSKEvent extends StObject {
    
    var eventSource: awsColonkafka = js.native
    
    var eventSourceArn: String = js.native
    
    var records: StringDictionary[js.Array[MSKRecord]] = js.native
  }
  object MSKEvent {
    
    @scala.inline
    def apply(eventSource: awsColonkafka, eventSourceArn: String, records: StringDictionary[js.Array[MSKRecord]]): MSKEvent = {
      val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventSourceArn = eventSourceArn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSKEvent]
    }
    
    @scala.inline
    implicit class MSKEventMutableBuilder[Self <: MSKEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventSource(value: awsColonkafka): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceArn(value: String): Self = StObject.set(x, "eventSourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: StringDictionary[js.Array[MSKRecord]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type MSKHandler = Handler[MSKEvent, Unit]
  
  @js.native
  trait MSKRecord extends StObject {
    
    var key: String = js.native
    
    var offset: Double = js.native
    
    var partition: Double = js.native
    
    var timestamp: Double = js.native
    
    var timestampType: CREATE_TIME | LOG_APPEND_TIME = js.native
    
    var topic: String = js.native
    
    var value: String = js.native
  }
  object MSKRecord {
    
    @scala.inline
    def apply(
      key: String,
      offset: Double,
      partition: Double,
      timestamp: Double,
      timestampType: CREATE_TIME | LOG_APPEND_TIME,
      topic: String,
      value: String
    ): MSKRecord = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampType = timestampType.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSKRecord]
    }
    
    @scala.inline
    implicit class MSKRecordMutableBuilder[Self <: MSKRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampType(value: CREATE_TIME | LOG_APPEND_TIME): Self = StObject.set(x, "timestampType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
