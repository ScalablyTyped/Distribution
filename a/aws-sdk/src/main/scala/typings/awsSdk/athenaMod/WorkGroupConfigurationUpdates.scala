package typings.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkGroupConfigurationUpdates extends StObject {
  
  /**
    * The upper limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan.
    */
  var BytesScannedCutoffPerQuery: js.UndefOr[BytesScannedCutoffValue] = js.undefined
  
  /**
    * If set to "true", the settings for the workgroup override client-side settings. If set to "false" client-side settings are used. For more information, see Workgroup Settings Override Client-Side Settings.
    */
  var EnforceWorkGroupConfiguration: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates whether this workgroup enables publishing metrics to Amazon CloudWatch.
    */
  var PublishCloudWatchMetricsEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Indicates that the data usage control limit per query is removed. WorkGroupConfiguration$BytesScannedCutoffPerQuery 
    */
  var RemoveBytesScannedCutoffPerQuery: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * If set to true, allows members assigned to a workgroup to specify Amazon S3 Requester Pays buckets in queries. If set to false, workgroup members cannot query data from Requester Pays buckets, and queries that retrieve data from Requester Pays buckets cause an error. The default is false. For more information about Requester Pays buckets, see Requester Pays Buckets in the Amazon Simple Storage Service Developer Guide.
    */
  var RequesterPaysEnabled: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
    */
  var ResultConfigurationUpdates: js.UndefOr[typings.awsSdk.athenaMod.ResultConfigurationUpdates] = js.undefined
}
object WorkGroupConfigurationUpdates {
  
  inline def apply(): WorkGroupConfigurationUpdates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkGroupConfigurationUpdates]
  }
  
  extension [Self <: WorkGroupConfigurationUpdates](x: Self) {
    
    inline def setBytesScannedCutoffPerQuery(value: BytesScannedCutoffValue): Self = StObject.set(x, "BytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "BytesScannedCutoffPerQuery", js.undefined)
    
    inline def setEnforceWorkGroupConfiguration(value: BoxedBoolean): Self = StObject.set(x, "EnforceWorkGroupConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEnforceWorkGroupConfigurationUndefined: Self = StObject.set(x, "EnforceWorkGroupConfiguration", js.undefined)
    
    inline def setPublishCloudWatchMetricsEnabled(value: BoxedBoolean): Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", value.asInstanceOf[js.Any])
    
    inline def setPublishCloudWatchMetricsEnabledUndefined: Self = StObject.set(x, "PublishCloudWatchMetricsEnabled", js.undefined)
    
    inline def setRemoveBytesScannedCutoffPerQuery(value: BoxedBoolean): Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
    
    inline def setRemoveBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "RemoveBytesScannedCutoffPerQuery", js.undefined)
    
    inline def setRequesterPaysEnabled(value: BoxedBoolean): Self = StObject.set(x, "RequesterPaysEnabled", value.asInstanceOf[js.Any])
    
    inline def setRequesterPaysEnabledUndefined: Self = StObject.set(x, "RequesterPaysEnabled", js.undefined)
    
    inline def setResultConfigurationUpdates(value: ResultConfigurationUpdates): Self = StObject.set(x, "ResultConfigurationUpdates", value.asInstanceOf[js.Any])
    
    inline def setResultConfigurationUpdatesUndefined: Self = StObject.set(x, "ResultConfigurationUpdates", js.undefined)
  }
}
