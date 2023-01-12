package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CREATE_TIME
import typings.awsLambda.awsLambdaStrings.LOG_APPEND_TIME
import typings.awsLambda.awsLambdaStrings.awsColonkafka
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerMskMod {
  
  trait MSKEvent extends StObject {
    
    var eventSource: awsColonkafka
    
    var eventSourceArn: String
    
    var records: StringDictionary[js.Array[MSKRecord]]
  }
  object MSKEvent {
    
    inline def apply(eventSourceArn: String, records: StringDictionary[js.Array[MSKRecord]]): MSKEvent = {
      val __obj = js.Dynamic.literal(eventSource = "aws:kafka", eventSourceArn = eventSourceArn.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSKEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MSKEvent] (val x: Self) extends AnyVal {
      
      inline def setEventSource(value: awsColonkafka): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceArn(value: String): Self = StObject.set(x, "eventSourceArn", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: StringDictionary[js.Array[MSKRecord]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type MSKHandler = Handler[MSKEvent, Unit]
  
  trait MSKRecord extends StObject {
    
    var headers: js.Array[MSKRecordHeader]
    
    var key: String
    
    var offset: Double
    
    var partition: Double
    
    var timestamp: Double
    
    var timestampType: CREATE_TIME | LOG_APPEND_TIME
    
    var topic: String
    
    var value: String
  }
  object MSKRecord {
    
    inline def apply(
      headers: js.Array[MSKRecordHeader],
      key: String,
      offset: Double,
      partition: Double,
      timestamp: Double,
      timestampType: CREATE_TIME | LOG_APPEND_TIME,
      topic: String,
      value: String
    ): MSKRecord = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampType = timestampType.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MSKRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MSKRecord] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Array[MSKRecordHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: MSKRecordHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampType(value: CREATE_TIME | LOG_APPEND_TIME): Self = StObject.set(x, "timestampType", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type MSKRecordHeader = StringDictionary[js.Array[Double]]
}
