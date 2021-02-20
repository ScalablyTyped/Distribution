package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.handlerMod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudwatchLogsMod {
  
  @js.native
  trait CloudWatchLogsDecodedData extends StObject {
    
    var logEvents: js.Array[CloudWatchLogsLogEvent] = js.native
    
    var logGroup: String = js.native
    
    var logStream: String = js.native
    
    var messageType: String = js.native
    
    var owner: String = js.native
    
    var subscriptionFilters: js.Array[String] = js.native
  }
  object CloudWatchLogsDecodedData {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CloudWatchLogsDecodedDataMutableBuilder[Self <: CloudWatchLogsDecodedData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogEvents(value: js.Array[CloudWatchLogsLogEvent]): Self = StObject.set(x, "logEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogEventsVarargs(value: CloudWatchLogsLogEvent*): Self = StObject.set(x, "logEvents", js.Array(value :_*))
      
      @scala.inline
      def setLogGroup(value: String): Self = StObject.set(x, "logGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogStream(value: String): Self = StObject.set(x, "logStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionFilters(value: js.Array[String]): Self = StObject.set(x, "subscriptionFilters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionFiltersVarargs(value: String*): Self = StObject.set(x, "subscriptionFilters", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CloudWatchLogsEvent extends StObject {
    
    var awslogs: CloudWatchLogsEventData = js.native
  }
  object CloudWatchLogsEvent {
    
    @scala.inline
    def apply(awslogs: CloudWatchLogsEventData): CloudWatchLogsEvent = {
      val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsEvent]
    }
    
    @scala.inline
    implicit class CloudWatchLogsEventMutableBuilder[Self <: CloudWatchLogsEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAwslogs(value: CloudWatchLogsEventData): Self = StObject.set(x, "awslogs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudWatchLogsEventData extends StObject {
    
    var data: String = js.native
  }
  object CloudWatchLogsEventData {
    
    @scala.inline
    def apply(data: String): CloudWatchLogsEventData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsEventData]
    }
    
    @scala.inline
    implicit class CloudWatchLogsEventDataMutableBuilder[Self <: CloudWatchLogsEventData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  
  @js.native
  trait CloudWatchLogsLogEvent extends StObject {
    
    var extractedFields: js.UndefOr[StringDictionary[String]] = js.native
    
    var id: String = js.native
    
    var message: String = js.native
    
    var timestamp: Double = js.native
  }
  object CloudWatchLogsLogEvent {
    
    @scala.inline
    def apply(id: String, message: String, timestamp: Double): CloudWatchLogsLogEvent = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudWatchLogsLogEvent]
    }
    
    @scala.inline
    implicit class CloudWatchLogsLogEventMutableBuilder[Self <: CloudWatchLogsLogEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtractedFields(value: StringDictionary[String]): Self = StObject.set(x, "extractedFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractedFieldsUndefined: Self = StObject.set(x, "extractedFields", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
