package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkGroupConfigurationUpdates extends StObject {
  
  /**
    * Contains a user defined string in JSON format for a Spark-enabled workgroup.
    */
  var AdditionalConfiguration: js.UndefOr[NameString] = js.undefined
  
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  
  var CustomerContentEncryptionConfiguration: js.UndefOr[typings.awsSdk.clientsAthenaMod.CustomerContentEncryptionConfiguration] = js.undefined
  
  /**
    * Enforces a minimal level of encryption for the workgroup for query and calculation results that are written to Amazon S3. When enabled, workgroup users can set encryption only to the minimum level set by the administrator or higher when they submit queries. This setting does not apply to Spark-enabled workgroups. The EnforceWorkGroupConfiguration setting takes precedence over the EnableMinimumEncryptionConfiguration flag. This means that if EnforceWorkGroupConfiguration is true, the EnableMinimumEncryptionConfiguration flag is ignored, and the workgroup configuration for encryption is used.
    */
  var EnableMinimumEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The engine version requested when a workgroup is updated. After the update, all queries on the workgroup run on the requested engine version. If no value was previously set, the default is Auto. Queries on the AmazonAthenaPreviewFunctionality workgroup run on the preview engine regardless of this setting.
    */
  var EngineVersion: js.UndefOr[typings.awsSdk.clientsAthenaMod.EngineVersion] = js.undefined
  
  /**
    * Contains the ARN of the execution role for the workgroup
    */
  var ExecutionRole: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Removes content encryption configuration for a workgroup.
    */
  var RemoveCustomerContentEncryptionConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to true, allows members assigned to a workgroup to specify Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typings.awsSdk.clientsAthenaMod.ResultConfigurationUpdates] = js.undefined
}
object WorkGroupConfigurationUpdates {
  
  inline def apply(): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkGroupConfigurationUpdates] (val x: Self) extends AnyVal {
    
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
    
    inline def setRemoveBytesScannedCutoffPerQuery(value: BoxedBoolean): Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    inline def setRemoveBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", js.undefined)
    
    inline def setRemoveCustomerContentEncryptionConfiguration(value: BoxedBoolean): Self = StObject.set(x, "RemoveCustomerContentEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRemoveCustomerContentEncryptionConfigurationUndefined: Self = StObject.set(x, "RemoveCustomerContentEncryptionConfiguration", js.undefined)
    
    inline def setRequesterPaysEnabled(value: BoxedBoolean): Self = StObject.set(x, "RequesterPaysEnabled", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysEnabledUndefined: Self = StObject.set(x, "RequesterPaysEnabled", js.undefined)
    
    inline def setResultConfigurationUpdates(value: ResultConfigurationUpdates): Self = StObject.set(x, "ResultConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUpdatesUndefined: Self = StObject.set(x, "ResultConfigurationUpdates", js.undefined)
  }
}
