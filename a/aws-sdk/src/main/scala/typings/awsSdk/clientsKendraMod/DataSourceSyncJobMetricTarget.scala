package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceSyncJobMetricTarget extends StObject {
  
  /**
    * The ID of the data source that is running the sync job.
    */
  var DataSourceId: typings.awsSdk.clientsKendraMod.DataSourceId
  
  /**
    * The ID of the sync job that is running on the data source. If the ID of a sync job is not provided and there is a sync job running, then the ID of this sync job is used and metrics are generated for this sync job. If the ID of a sync job is not provided and there is no sync job running, then no metrics are generated and documents are indexed/deleted at the index level without sync job metrics included.
    */
  var DataSourceSyncJobId: js.UndefOr[typings.awsSdk.clientsKendraMod.DataSourceSyncJobId] = js.undefined
}
object DataSourceSyncJobMetricTarget {
  
  inline def apply(DataSourceId: DataSourceId): DataSourceSyncJobMetricTarget = {
    val __obj = js.Dynamic.literal(DataSourceId = DataSourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceSyncJobMetricTarget]
  }
  
  extension [Self <: DataSourceSyncJobMetricTarget](x: Self) {
    
    inline def setDataSourceId(value: DataSourceId): Self = StObject.set(x, "DataSourceId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSyncJobId(value: DataSourceSyncJobId): Self = StObject.set(x, "DataSourceSyncJobId", value.asInstanceOf[js.Any])
    
    inline def setDataSourceSyncJobIdUndefined: Self = StObject.set(x, "DataSourceSyncJobId", js.undefined)
  }
}
