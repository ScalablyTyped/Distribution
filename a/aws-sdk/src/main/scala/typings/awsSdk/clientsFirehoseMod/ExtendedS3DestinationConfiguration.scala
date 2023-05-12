package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedS3DestinationConfiguration extends StObject {
  
  /**
    * The ARN of the S3 bucket. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.
    */
  var BucketARN: typings.awsSdk.clientsFirehoseMod.BucketARN
  
  /**
    * The buffering option.
    */
  var BufferingHints: js.UndefOr[typings.awsSdk.clientsFirehoseMod.BufferingHints] = js.undefined
  
  /**
    * The Amazon CloudWatch logging options for your delivery stream.
    */
  var CloudWatchLoggingOptions: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CloudWatchLoggingOptions] = js.undefined
  
  /**
    * The compression format. If no value is specified, the default is UNCOMPRESSED.
    */
  var CompressionFormat: js.UndefOr[typings.awsSdk.clientsFirehoseMod.CompressionFormat] = js.undefined
  
  /**
    * The serializer, deserializer, and schema for converting data from the JSON format to the Parquet or ORC format before writing it to Amazon S3.
    */
  var DataFormatConversionConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.DataFormatConversionConfiguration] = js.undefined
  
  /**
    * The configuration of the dynamic partitioning mechanism that creates smaller data sets from the streaming data by partitioning it based on partition keys. Currently, dynamic partitioning is only supported for Amazon S3 destinations. 
    */
  var DynamicPartitioningConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.DynamicPartitioningConfiguration] = js.undefined
  
  /**
    * The encryption configuration. If no value is specified, the default is no encryption.
    */
  var EncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.EncryptionConfiguration] = js.undefined
  
  /**
    * A prefix that Kinesis Data Firehose evaluates and adds to failed records before writing them to S3. This prefix appears immediately following the bucket name. For information about how to specify this prefix, see Custom Prefixes for Amazon S3 Objects.
    */
  var ErrorOutputPrefix: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ErrorOutputPrefix] = js.undefined
  
  /**
    * The "YYYY/MM/DD/HH" time format prefix is automatically used for delivered Amazon S3 files. You can also specify a custom prefix, as described in Custom Prefixes for Amazon S3 Objects.
    */
  var Prefix: js.UndefOr[typings.awsSdk.clientsFirehoseMod.Prefix] = js.undefined
  
  /**
    * The data processing configuration.
    */
  var ProcessingConfiguration: js.UndefOr[typings.awsSdk.clientsFirehoseMod.ProcessingConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services credentials. For more information, see Amazon Resource Names (ARNs) and Amazon Web Services Service Namespaces.
    */
  var RoleARN: typings.awsSdk.clientsFirehoseMod.RoleARN
  
  /**
    * The configuration for backup in Amazon S3.
    */
  var S3BackupConfiguration: js.UndefOr[S3DestinationConfiguration] = js.undefined
  
  /**
    * The Amazon S3 backup mode. After you create a delivery stream, you can update it to enable Amazon S3 backup if it is disabled. If backup is enabled, you can't update the delivery stream to disable it. 
    */
  var S3BackupMode: js.UndefOr[typings.awsSdk.clientsFirehoseMod.S3BackupMode] = js.undefined
}
object ExtendedS3DestinationConfiguration {
  
  inline def apply(BucketARN: BucketARN, RoleARN: RoleARN): ExtendedS3DestinationConfiguration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedS3DestinationConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtendedS3DestinationConfiguration] (val x: Self) extends AnyVal {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setBufferingHints(value: BufferingHints): Self = StObject.set(x, "BufferingHints", value.asInstanceOf[js.Any])
    
    inline def setBufferingHintsUndefined: Self = StObject.set(x, "BufferingHints", js.undefined)
    
    inline def setCloudWatchLoggingOptions(value: CloudWatchLoggingOptions): Self = StObject.set(x, "CloudWatchLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchLoggingOptionsUndefined: Self = StObject.set(x, "CloudWatchLoggingOptions", js.undefined)
    
    inline def setCompressionFormat(value: CompressionFormat): Self = StObject.set(x, "CompressionFormat", value.asInstanceOf[js.Any])
    
    inline def setCompressionFormatUndefined: Self = StObject.set(x, "CompressionFormat", js.undefined)
    
    inline def setDataFormatConversionConfiguration(value: DataFormatConversionConfiguration): Self = StObject.set(x, "DataFormatConversionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDataFormatConversionConfigurationUndefined: Self = StObject.set(x, "DataFormatConversionConfiguration", js.undefined)
    
    inline def setDynamicPartitioningConfiguration(value: DynamicPartitioningConfiguration): Self = StObject.set(x, "DynamicPartitioningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDynamicPartitioningConfigurationUndefined: Self = StObject.set(x, "DynamicPartitioningConfiguration", js.undefined)
    
    inline def setEncryptionConfiguration(value: EncryptionConfiguration): Self = StObject.set(x, "EncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "EncryptionConfiguration", js.undefined)
    
    inline def setErrorOutputPrefix(value: ErrorOutputPrefix): Self = StObject.set(x, "ErrorOutputPrefix", value.asInstanceOf[js.Any])
    
    inline def setErrorOutputPrefixUndefined: Self = StObject.set(x, "ErrorOutputPrefix", js.undefined)
    
    inline def setPrefix(value: Prefix): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    inline def setProcessingConfiguration(value: ProcessingConfiguration): Self = StObject.set(x, "ProcessingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "ProcessingConfiguration", js.undefined)
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    inline def setS3BackupConfiguration(value: S3DestinationConfiguration): Self = StObject.set(x, "S3BackupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setS3BackupConfigurationUndefined: Self = StObject.set(x, "S3BackupConfiguration", js.undefined)
    
    inline def setS3BackupMode(value: S3BackupMode): Self = StObject.set(x, "S3BackupMode", value.asInstanceOf[js.Any])
    
    inline def setS3BackupModeUndefined: Self = StObject.set(x, "S3BackupMode", js.undefined)
  }
}
