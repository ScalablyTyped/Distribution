package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonOpenSearchServerlessDestinationConfiguration extends StObject {
  
  /**
    * The buffering options. If no value is specified, the default values for AmazonopensearchserviceBufferingHints are used.
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
  var IndexName: AmazonOpenSearchServerlessIndexName
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to the Serverless offering for Amazon OpenSearch Service. The default value is 300 (5 minutes).
    */
  var RetryOptions: js.UndefOr[AmazonOpenSearchServerlessRetryOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Serverless offering for Amazon OpenSearch Service Configuration API and for indexing documents.
    */
  var RoleARN: typings.awsSdk.clientsFirehoseMod.RoleARN
  
  /**
    * Defines how documents should be delivered to Amazon S3. When it is set to FailedDocumentsOnly, Kinesis Data Firehose writes any documents that could not be indexed to the configured Amazon S3 destination, with AmazonOpenSearchService-failed/ appended to the key prefix. When set to AllDocuments, Kinesis Data Firehose delivers all incoming records to Amazon S3, and also writes failed documents with AmazonOpenSearchService-failed/ appended to the prefix.
    */
  var S3BackupMode: js.UndefOr[AmazonOpenSearchServerlessS3BackupMode] = js.undefined
  
  var S3Configuration: S3DestinationConfiguration
  
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.VpcConfiguration] = js.undefined
}
object AmazonOpenSearchServerlessDestinationConfiguration {
  
  inline def apply(
    IndexName: AmazonOpenSearchServerlessIndexName,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration
  ): AmazonOpenSearchServerlessDestinationConfiguration = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonOpenSearchServerlessDestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonOpenSearchServerlessDestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBufferingHints(value: AmazonOpenSearchServerlessBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setCollectionEndpoint(value: AmazonOpenSearchServerlessCollectionEndpoint): Self = StObject.set(x, "CollectionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCollectionEndpointUndefined: Self = StObject.set(x, "CollectionEndpoint", js.undefined)
    
    inline def setIndexName(value: AmazonOpenSearchServerlessIndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRetryOptions(value: AmazonOpenSearchServerlessRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setS3BackupMode(value: AmazonOpenSearchServerlessS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    inline def setS3Configuration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
