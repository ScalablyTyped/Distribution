package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CREATE_TIME
import typings.awsLambda.awsLambdaStrings.LOG_APPEND_TIME
import typings.awsLambda.awsLambdaStrings.awsColonkafka
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mskMod {
  
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
    
    extension [Self <: MSKEvent](x: Self) {
      
      inline def setEventSource(value: awsColonkafka): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceArn(value: String): Self = StObject.set(x, "eventSourceArn", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: StringDictionary[js.Array[MSKRecord]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type MSKHandler = Handler[MSKEvent, Unit]
  
  trait MSKRecord extends StObject {
    
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
    
    extension [Self <: MSKRecord](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampType(value: CREATE_TIME | LOG_APPEND_TIME): Self = StObject.set(x, "timestampType", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
