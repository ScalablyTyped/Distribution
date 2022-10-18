package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogDestinationConfig extends StObject {
  
  /**
    * The named location for the logs, provided in a key:value mapping that is specific to the chosen destination type.    For an Amazon S3 bucket, provide the name of the bucket, with key bucketName, and optionally provide a prefix, with key prefix. The following example specifies an Amazon S3 bucket named DOC-EXAMPLE-BUCKET and the prefix alerts:   "LogDestination": { "bucketName": "DOC-EXAMPLE-BUCKET", "prefix": "alerts" }    For a CloudWatch log group, provide the name of the CloudWatch log group, with key logGroup. The following example specifies a log group named alert-log-group:   "LogDestination": { "logGroup": "alert-log-group" }    For a Kinesis Data Firehose delivery stream, provide the name of the delivery stream, with key deliveryStream. The following example specifies a delivery stream named alert-delivery-stream:   "LogDestination": { "deliveryStream": "alert-delivery-stream" }   
    */
  var LogDestination: LogDestinationMap
  
  /**
    * The type of storage destination to send these logs to. You can send logs to an Amazon S3 bucket, a CloudWatch log group, or a Kinesis Data Firehose delivery stream.
    */
  var LogDestinationType: typings.awsSdk.clientsNetworkfirewallMod.LogDestinationType
  
  /**
    * The type of log to send. Alert logs report traffic that matches a StatefulRule with an action setting that sends an alert log message. Flow logs are standard network traffic flow logs. 
    */
  var LogType: typings.awsSdk.clientsNetworkfirewallMod.LogType
}
object LogDestinationConfig {
  
  inline def apply(LogDestination: LogDestinationMap, LogDestinationType: LogDestinationType, LogType: LogType): LogDestinationConfig = {
    val __obj = js.Dynamic.literal(LogDestination = LogDestination.asInstanceOf[js.Any], LogDestinationType = LogDestinationType.asInstanceOf[js.Any], LogType = LogType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogDestinationConfig]
  }
  
  extension [Self <: LogDestinationConfig](x: Self) {
    
    inline def setLogDestination(value: LogDestinationMap): Self = StObject.set(x, "LogDestination", value.asInstanceOf[js.Any])
    
    inline def setLogDestinationType(value: LogDestinationType): Self = StObject.set(x, "LogDestinationType", value.asInstanceOf[js.Any])
    
    inline def setLogType(value: LogType): Self = StObject.set(x, "LogType", value.asInstanceOf[js.Any])
  }
}
