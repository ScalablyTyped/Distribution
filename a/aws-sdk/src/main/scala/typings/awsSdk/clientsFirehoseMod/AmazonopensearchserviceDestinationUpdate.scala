package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonopensearchserviceDestinationUpdate extends StObject {
  
  /**
    * The buffering options. If no value is specified, AmazonopensearchBufferingHints object default values are used. 
    */
  var BufferingHints: js.UndefOr[AmazonopensearchserviceBufferingHints] = js.undefined
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The endpoint to use when communicating with the cluster. Specify either this ClusterEndpoint or the DomainARN field. 
    */
  var ClusterEndpoint: js.UndefOr[AmazonopensearchserviceClusterEndpoint] = js.undefined
  
  /**
    * The ARN of the Amazon OpenSearch Service domain. The IAM role must have permissions for DescribeDomain, DescribeDomains, and DescribeDomainConfig after assuming the IAM role specified in RoleARN.
    */
  var DomainARN: js.UndefOr[AmazonopensearchserviceDomainARN] = js.undefined
  
  /**
    * The Amazon OpenSearch Service index name.
    */
  var IndexName: js.UndefOr[AmazonopensearchserviceIndexName] = js.undefined
  
  /**
    * The Amazon OpenSearch Service index rotation period. Index rotation appends a timestamp to IndexName to facilitate the expiration of old data.
    */
  var IndexRotationPeriod: js.UndefOr[AmazonopensearchserviceIndexRotationPeriod] = js.undefined
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The retry behavior in case Kinesis Data Firehose is unable to deliver documents to Amazon OpenSearch Service. The default value is 300 (5 minutes). 
    */
  var RetryOptions: js.UndefOr[AmazonopensearchserviceRetryOptions] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be assumed by Kinesis Data Firehose for calling the Amazon OpenSearch Service Configuration API and for indexing documents. 
    */
  var RoleARN: js.UndefOr[typings.awsSdk.clientsFirehoseMod.RoleARN] = js.undefined
  
  var S3Update: js.UndefOr[S3DestinationUpdate] = js.undefined
  
  /**
    * The Amazon OpenSearch Service type name. For Elasticsearch 6.x, there can be only one type per index. If you try to specify a new type for an existing index that already has another type, Kinesis Data Firehose returns an error during runtime.  If you upgrade Elasticsearch from 6.x to 7.x and don’t update your delivery stream, Kinesis Data Firehose still delivers data to Elasticsearch with the old index name and type name. If you want to update your delivery stream with a new index name, provide an empty string for TypeName. 
    */
  var TypeName: js.UndefOr[AmazonopensearchserviceTypeName] = js.undefined
}
object AmazonopensearchserviceDestinationUpdate {
  
  inline def apply(): AmazonopensearchserviceDestinationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonopensearchserviceDestinationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonopensearchserviceDestinationUpdate] (val x: Self) extends AnyVal {
    
    inline def setBufferingHints(value: AmazonopensearchserviceBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setClusterEndpoint(value: AmazonopensearchserviceClusterEndpoint): Self = StObject.set(x, "ClusterEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpointUndefined: Self = StObject.set(x, "ClusterEndpoint", js.undefined)
    
    inline def setDomainARN(value: AmazonopensearchserviceDomainARN): Self = StObject.set(x, "DomainARN", value.asInstanceOf[js.Any])
    
    inline def setDomainARNUndefined: Self = StObject.set(x, "DomainARN", js.undefined)
    
    inline def setIndexName(value: AmazonopensearchserviceIndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setIndexRotationPeriod(value: AmazonopensearchserviceIndexRotationPeriod): Self = StObject.set(x, "IndexRotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setIndexRotationPeriodUndefined: Self = StObject.set(x, "IndexRotationPeriod", js.undefined)
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRetryOptions(value: AmazonopensearchserviceRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
    
    inline def setS3Update(value: S3DestinationUpdate): Self = StObject.set(x, "S3Update", value.asInstanceOf[js.Any])
    
    inline def setS3UpdateUndefined: Self = StObject.set(x, "S3Update", js.undefined)
    
    inline def setTypeName(value: AmazonopensearchserviceTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
  }
}
