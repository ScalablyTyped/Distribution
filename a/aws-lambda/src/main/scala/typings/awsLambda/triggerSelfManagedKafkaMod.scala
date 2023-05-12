package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.awsLambdaStrings.CREATE_TIME
import typings.awsLambda.awsLambdaStrings.LOG_APPEND_TIME
import typings.awsLambda.awsLambdaStrings.SelfManagedKafka
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerSelfManagedKafkaMod {
  
  trait SelfManagedKafkaEvent extends StObject {
    
    var bootstrapServers: String
    
    var eventSource: SelfManagedKafka
    
    var records: StringDictionary[js.Array[SelfManagedKafkaRecord]]
  }
  object SelfManagedKafkaEvent {
    
    inline def apply(bootstrapServers: String, records: StringDictionary[js.Array[SelfManagedKafkaRecord]]): SelfManagedKafkaEvent = {
      val __obj = js.Dynamic.literal(bootstrapServers = bootstrapServers.asInstanceOf[js.Any], eventSource = "SelfManagedKafka", records = records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfManagedKafkaEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelfManagedKafkaEvent] (val x: Self) extends AnyVal {
      
      inline def setBootstrapServers(value: String): Self = StObject.set(x, "bootstrapServers", value.asInstanceOf[js.Any])
      
      inline def setEventSource(value: SelfManagedKafka): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setRecords(value: StringDictionary[js.Array[SelfManagedKafkaRecord]]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    }
  }
  
  type SelfManagedKafkaHandler = Handler[SelfManagedKafkaEvent, Unit]
  
  trait SelfManagedKafkaRecord extends StObject {
    
    var headers: js.Array[SelfManagedKafkaRecordHeader]
    
    var key: String
    
    var offset: Double
    
    var partition: Double
    
    var timestamp: Double
    
    var timestampType: CREATE_TIME | LOG_APPEND_TIME
    
    var topic: String
    
    var value: String
  }
  object SelfManagedKafkaRecord {
    
    inline def apply(
      headers: js.Array[SelfManagedKafkaRecordHeader],
      key: String,
      offset: Double,
      partition: Double,
      timestamp: Double,
      timestampType: CREATE_TIME | LOG_APPEND_TIME,
      topic: String,
      value: String
    ): SelfManagedKafkaRecord = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampType = timestampType.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelfManagedKafkaRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelfManagedKafkaRecord] (val x: Self) extends AnyVal {
      
      inline def setHeaders(value: js.Array[SelfManagedKafkaRecordHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: SelfManagedKafkaRecordHeader*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampType(value: CREATE_TIME | LOG_APPEND_TIME): Self = StObject.set(x, "timestampType", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelfManagedKafkaRecordHeader = StringDictionary[js.Array[Double]]
}
