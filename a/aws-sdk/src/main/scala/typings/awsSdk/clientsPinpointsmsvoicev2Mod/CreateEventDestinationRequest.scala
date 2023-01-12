package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventDestinationRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * An object that contains information about an event destination for logging to Amazon CloudWatch logs.
    */
  var CloudWatchLogsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.CloudWatchLogsDestination] = js.undefined
  
  /**
    * Either the name of the configuration set or the configuration set ARN to apply event logging to. The ConfigurateSetName and ConfigurationSetArn can be found using the DescribeConfigurationSets action.
    */
  var ConfigurationSetName: ConfigurationSetNameOrArn
  
  /**
    * The name that identifies the event destination.
    */
  var EventDestinationName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.EventDestinationName
  
  /**
    * An object that contains information about an event destination for logging to Amazon Kinesis Data Firehose.
    */
  var KinesisFirehoseDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KinesisFirehoseDestination] = js.undefined
  
  /**
    * An array of event types that determine which events to log. If "ALL" is used, then Amazon Pinpoint logs every event type.
    */
  var MatchingEventTypes: EventTypeList
  
  /**
    * An object that contains information about an event destination for logging to Amazon SNS.
    */
  var SnsDestination: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.SnsDestination] = js.undefined
}
object CreateEventDestinationRequest {
  
  inline def apply(
    ConfigurationSetName: ConfigurationSetNameOrArn,
    EventDestinationName: EventDestinationName,
    MatchingEventTypes: EventTypeList
  ): CreateEventDestinationRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], EventDestinationName = EventDestinationName.asInstanceOf[js.Any], MatchingEventTypes = MatchingEventTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCloudWatchLogsDestination(value: CloudWatchLogsDestination): Self = StObject.set(x, "CloudWatchLogsDestination", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLogsDestinationUndefined: Self = StObject.set(x, "CloudWatchLogsDestination", js.undefined)
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setEventDestinationName(value: EventDestinationName): Self = StObject.set(x, "EventDestinationName", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestination(value: KinesisFirehoseDestination): Self = StObject.set(x, "KinesisFirehoseDestination", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseDestinationUndefined: Self = StObject.set(x, "KinesisFirehoseDestination", js.undefined)
    
    inline def setMatchingEventTypes(value: EventTypeList): Self = StObject.set(x, "MatchingEventTypes", value.asInstanceOf[js.Any])
    
    inline def setMatchingEventTypesVarargs(value: EventType*): Self = StObject.set(x, "MatchingEventTypes", js.Array(value*))
    
    inline def setSnsDestination(value: SnsDestination): Self = StObject.set(x, "SnsDestination", value.asInstanceOf[js.Any])
    
    inline def setSnsDestinationUndefined: Self = StObject.set(x, "SnsDestination", js.undefined)
  }
}
