package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkGroupConfiguration extends StObject {
  
  /**
    * Specifies a user defined JSON string that is passed to the notebook engine.
    */
  var AdditionalConfiguration: js.UndefOr[NameString] = js.undefined
  
  /**
    * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  
  /**
    * Specifies the KMS key that is used to encrypt the user's data stores in Athena.
    */
  var CustomerContentEncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.CustomerContentEncryptionConfiguration] = js.undefined
  
  /**
    * Enforces a minimal level of encryption for the workgroup for query and calculation results that are written to Amazon S3. When enabled, workgroup users can set encryption only to the minimum level set by the administrator or higher when they submit queries. The EnforceWorkGroupConfiguration setting takes precedence over the EnableMinimumEncryptionConfiguration flag. This means that if EnforceWorkGroupConfiguration is true, the EnableMinimumEncryptionConfiguration flag is ignored, and the workgroup configuration for encryption is used.
    */
  var EnableMinimumEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The engine version that all queries running on the workgroup use. Queries on the AmazonAthenaPreviewFunctionality workgroup run on the preview engine regardless of this setting.
    */
  var EngineVersion: js.UndefOr[typings.awsSdk.clientsAthenaMod.EngineVersion] = js.undefined
  
  /**
    * Role used in a session for accessing the user's resources.
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to true, allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The configuration for the workgroup, which includes the location in Amazon S3 where query and calculation results are stored and the encryption option, if any, used for query and calculation results. To run the query, you must specify the query results location using one of the ways: either in the workgroup using this setting, or for individual queries (client-side), using ResultConfiguration$OutputLocation. If none of them is set, Athena issues an error that no output location is provided. For more information, see Working with query results, recent queries, and output files.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultConfiguration] = js.undefined
}
object WorkGroupConfiguration {
  
  inline def apply(): WorkGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkGroupConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAdditionalConfiguration(value: NameString): Self = StObject.set(x, "AdditionalConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAdditionalConfigurationUndefined: Self = StObject.set(x, "AdditionalConfiguration", js.undefined)
    
    inline def setBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = StObject.set(x, "BytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "BytesScannedCutoffPerQuery", js.undefined)
    
    inline def setCustomerContentEncryptionConfiguration(value: CustomerContentEncryptionConfiguration): Self = StObject.set(x, "CustomerContentEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCustomerContentEncryptionConfigurationUndefined: Self = StObject.set(x, "CustomerContentEncryptionConfiguration", js.undefined)
    
    inline def setEnableMinimumEncryptionConfiguration(value: BoxedBoolean): Self = StObject.set(x, "EnableMinimumEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEnableMinimumEncryptionConfigurationUndefined: Self = StObject.set(x, "EnableMinimumEncryptionConfiguration", js.undefined)
    
    inline def setEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = StObject.set(x, "EnforceWorkGroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEnforceWorkGroupConfigurationUndefined: Self = StObject.set(x, "EnforceWorkGroupConfiguration", js.undefined)
    
    inline def setEngineVersion(value: EngineVersion): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setExecutionRole(value: RoleArn): Self = StObject.set(x, "ExecutionRole", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleUndefined: Self = StObject.set(x, "ExecutionRole", js.undefined)
    
    inline def setPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublishCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", js.undefined)
    
    inline def setRequesterPaysEnabled(value: BoxedBoolean): Self = StObject.set(x, "RequesterPaysEnabled", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysEnabledUndefined: Self = StObject.set(x, "RequesterPaysEnabled", js.undefined)
    
    inline def setResultConfiguration(value: ResultConfiguration): Self = StObject.set(x, "ResultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUndefined: Self = StObject.set(x, "ResultConfiguration", js.undefined)
  }
}
