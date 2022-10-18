package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpEndpointDestinationUpdate extends StObject {
  
  /**
    * Describes buffering options that can be applied to the data before it is delivered to the HTTPS endpoint destination. Kinesis Data Firehose teats these options as hints, and it might choose to use more optimal values. The SizeInMBs and IntervalInSeconds parameters are optional. However, if specify a value for one of them, you must also provide a value for the other. 
    */
  var BufferingHints: js.UndefOr[HttpEndpointBufferingHints] = js.undefined
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * Describes the configuration of the HTTP endpoint destination.
    */
  var EndpointConfiguration: js.UndefOr[HttpEndpointConfiguration] = js.undefined
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The configuration of the request sent to the HTTP endpoint specified as the destination.
    */
  var RequestConfiguration: js.UndefOr[HttpEndpointRequestConfiguration] = js.undefined
  
  /**
    * Describes the retry behavior in case Kinesis Data Firehose is unable to deliver data to the specified HTTP endpoint destination, or if it doesn't receive a valid acknowledgment of receipt from the specified HTTP endpoint destination.
    */
  var RetryOptions: js.UndefOr[HttpEndpointRetryOptions] = js.undefined
  
  /**
    * Kinesis Data Firehose uses this IAM role for all the permissions that the delivery stream needs.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
  
  /**
    * Describes the S3 bucket backup options for the data that Kinesis Firehose delivers to the HTTP endpoint destination. You can back up all documents (AllData) or only the documents that Kinesis Data Firehose could not deliver to the specified HTTP endpoint destination (FailedDataOnly).
    */
  var S3BackupMode: js.UndefOr[HttpEndpointS3BackupMode] = js.undefined
  
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
}
object HttpEndpointDestinationUpdate {
  
  inline def apply(): HttpEndpointDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpEndpointDestinationUpdate]
  }
  
  extension [Self <: HttpEndpointDestinationUpdate](x: Self) {
    
    inline def setBufferingHints(value: HttpEndpointBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setEndpointConfiguration(value: HttpEndpointConfiguration): Self = StObject.set(x, "EndpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "EndpointConfiguration", js.undefined)
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRequestConfiguration(value: HttpEndpointRequestConfiguration): Self = StObject.set(x, "RequestConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRequestConfigurationUndefined: Self = StObject.set(x, "RequestConfiguration", js.undefined)
    
    inline def setRetryOptions(value: HttpEndpointRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setS3BackupMode(value: HttpEndpointS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    inline def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    inline def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
  }
}
