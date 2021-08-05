package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkGroupConfiguration extends StObject {
  
  /**
    * The upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false", client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates that the Amazon CloudWatch metrics are enabled for the workgroup.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to true, allows members assigned to a workgroup to reference Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The configuration for the workgroup, which includes the location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. To run the query, you must specify the query results location using one of the ways: either in the workgroup using this setting, or for individual queries (client-side), using ResultConfiguration$OutputLocation. If none of them is set, Athena issues an error that no output location is provided. For more information, see Query Results.
    */
  var ResultConfiguration: js.UndefOr[typings.awsSdk.athenaMod.ResultConfiguration] = js.undefined
}
object WorkGroupConfiguration {
  
  inline def apply(): WorkGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfiguration]
  }
  
  extension [Self <: WorkGroupConfiguration](x: Self) {
    
    inline def setBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = StObject.set(x, "BytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "BytesScannedCutoffPerQuery", js.undefined)
    
    inline def setEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = StObject.set(x, "EnforceWorkGroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEnforceWorkGroupConfigurationUndefined: Self = StObject.set(x, "EnforceWorkGroupConfiguration", js.undefined)
    
    inline def setPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublishCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", js.undefined)
    
    inline def setRequesterPaysEnabled(value: BoxedBoolean): Self = StObject.set(x, "RequesterPaysEnabled", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysEnabledUndefined: Self = StObject.set(x, "RequesterPaysEnabled", js.undefined)
    
    inline def setResultConfiguration(value: ResultConfiguration): Self = StObject.set(x, "ResultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUndefined: Self = StObject.set(x, "ResultConfiguration", js.undefined)
  }
}
