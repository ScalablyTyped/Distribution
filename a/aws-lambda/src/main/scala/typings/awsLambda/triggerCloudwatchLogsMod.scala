package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCloudwatchLogsMod {
  
  trait CloudWatchLogsDecodedData extends StObject {
    
    var logEvents: js.Array[CloudWatchLogsLogEvent]
    
    var logGroup: String
    
    var logStream: String
    
    var messageType: String
    
    var owner: String
    
    var subscriptionFilters: js.Array[String]
  }
  object CloudWatchLogsDecodedData {
    
    inline def apply(
      logEvents: js.Array[CloudWatchLogsLogEvent],
      logGroup: String,
      logStream: String,
      messageType: String,
      owner: String,
      subscriptionFilters: js.Array[String]
    ): CloudWatchLogsDecodedData = {
      val __obj = js.Dynamic.literal(logEvents = logEvents.asInstanceOf[js.Any], logGroup = logGroup.asInstanceOf[js.Any], logStream = logStream.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], subscriptionFilters = subscriptionFilters.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsDecodedData]
    }
    
    extension [Self <: CloudWatchLogsDecodedData](x: Self) {
      
      inline def setLogEvents(value: js.Array[CloudWatchLogsLogEvent]): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      inline def setLogEventsVarargs(value: CloudWatchLogsLogEvent*): Self = StObject.set(x, "logEvents", js.Array(value*))
      
      inline def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      inline def setLogStream(value: String): Self = StObject.set(x, "logStream", value.asInstanceOf[js.Any])
      
      inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionFilters(value: js.Array[String]): Self = StObject.set(x, "subscriptionFilters", value.asInstanceOf[js.Any])
      
      inline def setSubscriptionFiltersVarargs(value: String*): Self = StObject.set(x, "subscriptionFilters", js.Array(value*))
    }
  }
  
  trait CloudWatchLogsEvent extends StObject {
    
    var awslogs: CloudWatchLogsEventData
  }
  object CloudWatchLogsEvent {
    
    inline def apply(awslogs: CloudWatchLogsEventData): CloudWatchLogsEvent = {
      val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsEvent]
    }
    
    extension [Self <: CloudWatchLogsEvent](x: Self) {
      
      inline def setAwslogs(value: CloudWatchLogsEventData): Self = StObject.set(x, "awslogs", value.asInstanceOf[js.Any])
    }
  }
  
  trait CloudWatchLogsEventData extends StObject {
    
    var data: String
  }
  object CloudWatchLogsEventData {
    
    inline def apply(data: String): CloudWatchLogsEventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsEventData]
    }
    
    extension [Self <: CloudWatchLogsEventData](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  
  trait CloudWatchLogsLogEvent extends StObject {
    
    var extractedFields: js.UndefOr[CloudWatchLogsLogEventExtractedFields] = js.undefined
    
    var id: String
    
    var message: String
    
    var timestamp: Double
  }
  object CloudWatchLogsLogEvent {
    
    inline def apply(id: String, message: String, timestamp: Double): CloudWatchLogsLogEvent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsLogEvent]
    }
    
    extension [Self <: CloudWatchLogsLogEvent](x: Self) {
      
      inline def setExtractedFields(value: CloudWatchLogsLogEventExtractedFields): Self = StObject.set(x, "extractedFields", value.asInstanceOf[js.Any])
      
      inline def setExtractedFieldsUndefined: Self = StObject.set(x, "extractedFields", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudWatchLogsLogEventExtractedFields = StringDictionary[js.UndefOr[String]]
}
