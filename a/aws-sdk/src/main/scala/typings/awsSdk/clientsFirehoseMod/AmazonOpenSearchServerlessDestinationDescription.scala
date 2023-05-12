package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonOpenSearchServerlessDestinationDescription extends StObject {
  
  /**
    * The buffering options.
    */
  var BufferingHints: js.UndefOr[AmazonOpenSearchServerlessBufferingHints] = js.undefined
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The endpoint to use when communicating with the collection in the Serverless offering for Amazon OpenSearch Service.
    */
  var CollectionEndpoint: js.UndefOr[AmazonOpenSearchServerlessCollectionEndpoint] = js.undefined
  
  /**
    * The Serverless offering for Amazon OpenSearch Service index name.
    */
  var IndexName: js.UndefOr[AmazonOpenSearchServerlessIndexName] = js.undefined
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The Serverless offering for Amazon OpenSearch Service retry options.
    */
  var RetryOptions: js.UndefOr[AmazonOpenSearchServerlessRetryOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the AWS credentials.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
  
  /**
    * The Amazon S3 backup mode.
    */
  var S3BackupMode: js.UndefOr[AmazonOpenSearchServerlessS3BackupMode] = js.undefined
  
  var S3DestinationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.S3DestinationDescription] = js.undefined
  
  var VpcConfigurationDescription: js.UndefOr[typings.awsSdk.clientsFirehoseMod.VpcConfigurationDescription] = js.undefined
}
object AmazonOpenSearchServerlessDestinationDescription {
  
  inline def apply(): AmazonOpenSearchServerlessDestinationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonOpenSearchServerlessDestinationDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonOpenSearchServerlessDestinationDescription] (val x: Self) extends AnyVal {
    
    inline def setBufferingHints(value: AmazonOpenSearchServerlessBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setCollectionEndpoint(value: AmazonOpenSearchServerlessCollectionEndpoint): Self = StObject.set(x, "CollectionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCollectionEndpointUndefined: Self = StObject.set(x, "CollectionEndpoint", js.undefined)
    
    inline def setIndexName(value: AmazonOpenSearchServerlessIndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRetryOptions(value: AmazonOpenSearchServerlessRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setS3BackupMode(value: AmazonOpenSearchServerlessS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    inline def setS3DestinationDescription(value: S3DestinationDescription): Self = StObject.set(x, "S3DestinationDescription", value.asInstanceOf[js.Any])
    
    inline def setS3DestinationDescriptionUndefined: Self = StObject.set(x, "S3DestinationDescription", js.undefined)
    
    inline def setVpcConfigurationDescription(value: VpcConfigurationDescription): Self = StObject.set(x, "VpcConfigurationDescription", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationDescriptionUndefined: Self = StObject.set(x, "VpcConfigurationDescription", js.undefined)
  }
}
