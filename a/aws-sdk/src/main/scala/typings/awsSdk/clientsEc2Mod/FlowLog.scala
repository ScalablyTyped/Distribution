package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowLog extends StObject {
  
  /**
    * The date and time the flow log was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM role that allows the service to publish flow logs across accounts.
    */
  var DeliverCrossAccountRole: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the error that occurred. Rate limited indicates that CloudWatch Logs throttling has been applied for one or more network interfaces, or that you've reached the limit on the number of log groups that you can create. Access error indicates that the IAM role associated with the flow log does not have sufficient permissions to publish to CloudWatch Logs. Unknown error indicates an internal error.
    */
  var DeliverLogsErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role allows the service to publish logs to CloudWatch Logs.
    */
  var DeliverLogsPermissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the logs delivery (SUCCESS | FAILED).
    */
  var DeliverLogsStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The destination options.
    */
  var DestinationOptions: js.UndefOr[DestinationOptionsResponse] = js.undefined
  
  /**
    * The ID of the flow log.
    */
  var FlowLogId: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the flow log (ACTIVE).
    */
  var FlowLogStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the destination for the flow log data.
    */
  var LogDestination: js.UndefOr[String] = js.undefined
  
  /**
    * The type of destination for the flow log data.
    */
  var LogDestinationType: js.UndefOr[typings.awsSdk.clientsEc2Mod.LogDestinationType] = js.undefined
  
  /**
    * The format of the flow log record.
    */
  var LogFormat: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the flow log group.
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum interval of time, in seconds, during which a flow of packets is captured and aggregated into a flow log record. When a network interface is attached to a Nitro-based instance, the aggregation interval is always 60 seconds (1 minute) or less, regardless of the specified value. Valid Values: 60 | 600 
    */
  var MaxAggregationInterval: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the resource being monitored.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The tags for the flow log.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of traffic captured for the flow log.
    */
  var TrafficType: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficType] = js.undefined
}
object FlowLog {
  
  inline def apply(): FlowLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlowLog] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeliverCrossAccountRole(value: String): Self = StObject.set(x, "DeliverCrossAccountRole", value.asInstanceOf[js.Any])
    
    inline def setDeliverCrossAccountRoleUndefined: Self = StObject.set(x, "DeliverCrossAccountRole", js.undefined)
    
    inline def setDeliverLogsErrorMessage(value: String): Self = StObject.set(x, "DeliverLogsErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsErrorMessageUndefined: Self = StObject.set(x, "DeliverLogsErrorMessage", js.undefined)
    
    inline def setDeliverLogsPermissionArn(value: String): Self = StObject.set(x, "DeliverLogsPermissionArn", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsPermissionArnUndefined: Self = StObject.set(x, "DeliverLogsPermissionArn", js.undefined)
    
    inline def setDeliverLogsStatus(value: String): Self = StObject.set(x, "DeliverLogsStatus", value.asInstanceOf[js.Any])
    
    inline def setDeliverLogsStatusUndefined: Self = StObject.set(x, "DeliverLogsStatus", js.undefined)
    
    inline def setDestinationOptions(value: DestinationOptionsResponse): Self = StObject.set(x, "DestinationOptions", value.asInstanceOf[js.Any])
    
    inline def setDestinationOptionsUndefined: Self = StObject.set(x, "DestinationOptions", js.undefined)
    
    inline def setFlowLogId(value: String): Self = StObject.set(x, "FlowLogId", value.asInstanceOf[js.Any])
    
    inline def setFlowLogIdUndefined: Self = StObject.set(x, "FlowLogId", js.undefined)
    
    inline def setFlowLogStatus(value: String): Self = StObject.set(x, "FlowLogStatus", value.asInstanceOf[js.Any])
    
    inline def setFlowLogStatusUndefined: Self = StObject.set(x, "FlowLogStatus", js.undefined)
    
    inline def setLogDestination(value: String): Self = StObject.set(x, "LogDestination", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationTypeUndefined: Self = StObject.set(x, "LogDestinationType", js.undefined)
    
    inline def setLogDestinationUndefined: Self = StObject.set(x, "LogDestination", js.undefined)
    
    inline def setLogFormat(value: String): Self = StObject.set(x, "LogFormat", value.asInstanceOf[js.Any])
    
    inline def setLogFormatUndefined: Self = StObject.set(x, "LogFormat", js.undefined)
    
    inline def setLogGroupName(value: String): Self = StObject.set(x, "LogGroupName", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNameUndefined: Self = StObject.set(x, "LogGroupName", js.undefined)
    
    inline def setMaxAggregationInterval(value: Integer): Self = StObject.set(x, "MaxAggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setMaxAggregationIntervalUndefined: Self = StObject.set(x, "MaxAggregationInterval", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrafficType(value: TrafficType): Self = StObject.set(x, "TrafficType", value.asInstanceOf[js.Any])
    
    inline def setTrafficTypeUndefined: Self = StObject.set(x, "TrafficType", js.undefined)
  }
}
