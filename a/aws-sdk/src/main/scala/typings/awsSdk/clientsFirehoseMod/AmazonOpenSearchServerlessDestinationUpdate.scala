package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonOpenSearchServerlessDestinationUpdate extends StObject {
  
  /**
    * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used.
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
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for Amazon OpenSearch Service. The default value is 300 (5 minutes).
    */
  var RetryOptions: js.UndefOr[AmazonOpenSearchServerlessRetryOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
  
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
}
object AmazonOpenSearchServerlessDestinationUpdate {
  
  inline def apply(): AmazonOpenSearchServerlessDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonOpenSearchServerlessDestinationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonOpenSearchServerlessDestinationUpdate] (val x: Self) extends AnyVal {
    
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
    
    inline def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    inline def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
  }
}
