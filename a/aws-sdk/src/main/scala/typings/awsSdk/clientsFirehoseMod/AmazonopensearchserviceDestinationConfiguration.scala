package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonopensearchserviceDestinationConfiguration extends StObject {
  
  var BufferingHints: js.UndefOr[AmazonopensearchserviceBufferingHints] = js.undefined
  
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  var ClusterEndpoint: js.UndefOr[AmazonopensearchserviceClusterEndpoint] = js.undefined
  
  var DomainARN: js.UndefOr[AmazonopensearchserviceDomainARN] = js.undefined
  
  var IndexName: AmazonopensearchserviceIndexName
  
  var IndexRotationPeriod: js.UndefOr[AmazonopensearchserviceIndexRotationPeriod] = js.undefined
  
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  var RetryOptions: js.UndefOr[AmazonopensearchserviceRetryOptions] = js.undefined
  
  var RoleARN: typings.awsSdk.clientsFirehoseMod.RoleARN
  
  var S3BackupMode: js.UndefOr[AmazonopensearchserviceS3BackupMode] = js.undefined
  
  var S3Configuration: S3DestinationConfiguration
  
  var TypeName: js.UndefOr[AmazonopensearchserviceTypeName] = js.undefined
  
  var VpcConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.VpcConfiguration] = js.undefined
}
object AmazonopensearchserviceDestinationConfiguration {
  
  inline def apply(
    IndexName: AmazonopensearchserviceIndexName,
    RoleARN: RoleARN,
    S3Configuration: S3DestinationConfiguration
  ): AmazonopensearchserviceDestinationConfiguration = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any], S3Configuration = S3Configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmazonopensearchserviceDestinationConfiguration]
  }
  
  extension [Self <: AmazonopensearchserviceDestinationConfiguration](x: Self) {
    
    inline def setBufferingHints(value: AmazonopensearchserviceBufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setClusterEndpoint(value: AmazonopensearchserviceClusterEndpoint): Self = StObject.set(x, "ClusterEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpointUndefined: Self = StObject.set(x, "ClusterEndpoint", js.undefined)
    
    inline def setDomainARN(value: AmazonopensearchserviceDomainARN): Self = StObject.set(x, "DomainARN", value.asInstanceOf[js.Any])
    
    inline def setDomainARNUndefined: Self = StObject.set(x, "DomainARN", js.undefined)
    
    inline def setIndexName(value: AmazonopensearchserviceIndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexRotationPeriod(value: AmazonopensearchserviceIndexRotationPeriod): Self = StObject.set(x, "IndexRotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setIndexRotationPeriodUndefined: Self = StObject.set(x, "IndexRotationPeriod", js.undefined)
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRetryOptions(value: AmazonopensearchserviceRetryOptions): Self = StObject.set(x, "RetryOptions", value.asInstanceOf[js.Any])
    
    inline def setRetryOptionsUndefined: Self = StObject.set(x, "RetryOptions", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setS3BackupMode(value: AmazonopensearchserviceS3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
    
    inline def setS3Configuration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3Configuration", value.asInstanceOf[js.Any])
    
    inline def setTypeName(value: AmazonopensearchserviceTypeName): Self = StObject.set(x, "TypeName", value.asInstanceOf[js.Any])
    
    inline def setTypeNameUndefined: Self = StObject.set(x, "TypeName", js.undefined)
    
    inline def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
