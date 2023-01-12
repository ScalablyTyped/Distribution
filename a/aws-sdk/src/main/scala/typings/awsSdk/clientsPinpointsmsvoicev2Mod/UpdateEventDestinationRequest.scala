package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventDestinationRequest extends StObject {
  
  /**
    * An object that contains information about an event destination that sends data to CloudWatch Logs.
    */
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.CloudWatchLogsDestination] = js.undefined
  
  /**
    * The configuration set to update with the new event destination. Valid values for this can be the ConfigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
  
  /**
    * When set to true logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name to use for the event destination.
    */
  var EventDestinationName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.EventDestinationName
  
  /**
    * An object that contains information about an event destination for logging to Kinesis Data Firehose.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KinesisFirehoseDestination] = js.undefined
  
  /**
    * An array of event types that determine which events to log.
    */
  var MatchingEventTypes: js.UndefOr[EventTypeList] = js.undefined
  
  /**
    * An object that contains information about an event destination that sends data to Amazon SNS.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.SnsDestination] = js.undefined
}
object UpdateEventDestinationRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetNameOrArn, EventDestinationName: EventDestinationName): UpdateEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEventDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypeList): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesUndefined: Self = StObject.set(x, "MatchingEventTypes", js.undefined)
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value*))
    
    inline def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    inline def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
