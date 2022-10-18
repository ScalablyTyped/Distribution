package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDestination extends StObject {
  
  /**
    * An object that contains information about an event destination that sends logging events to Amazon CloudWatch logs.
    */
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.CloudWatchLogsDestination] = js.undefined
  
  /**
    * When set to true events will be logged.
    */
  var Enabled: Boolean
  
  /**
    * The name of the EventDestination.
    */
  var EventDestinationName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.EventDestinationName
  
  /**
    * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KinesisFirehoseDestination] = js.undefined
  
  /**
    * An array of event types that determine which events to log.
    */
  var MatchingEventTypes: EventTypeList
  
  /**
    * An object that contains information about an event destination that sends logging events to Amazon SNS.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.SnsDestination] = js.undefined
}
object EventDestination {
  
  inline def apply(Enabled: Boolean, EventDestinationName: EventDestinationName, MatchingEventTypes: EventTypeList): EventDestination = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any], MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventDestination]
  }
  
  extension [Self <: EventDestination](x: Self) {
    
    inline def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypeList): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value*))
    
    inline def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    inline def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
