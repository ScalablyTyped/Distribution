package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUpdateActionsMessage extends StObject {
  
  /**
    * The cache cluster IDs
    */
  var CacheClusterIds: js.UndefOr[CacheClusterIdList] = js.undefined
  
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached 
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The replication group IDs
    */
  var ReplicationGroupIds: js.UndefOr[ReplicationGroupIdList] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[ServiceUpdateStatusList] = js.undefined
  
  /**
    * The range of time specified to search for service updates that are in available status
    */
  var ServiceUpdateTimeRange: js.UndefOr[TimeRangeFilter] = js.undefined
  
  /**
    * Dictates whether to include node level update status in the response 
    */
  var ShowNodeLevelUpdateStatus: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The status of the update action.
    */
  var UpdateActionStatus: js.UndefOr[UpdateActionStatusList] = js.undefined
}
object DescribeUpdateActionsMessage {
  
  inline def apply(): DescribeUpdateActionsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUpdateActionsMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUpdateActionsMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheClusterIds(value: CacheClusterIdList): Self = StObject.set(x, "CacheClusterIds", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdsUndefined: Self = StObject.set(x, "CacheClusterIds", js.undefined)
    
    inline def setCacheClusterIdsVarargs(value: String*): Self = StObject.set(x, "CacheClusterIds", js.Array(value*))
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setReplicationGroupIds(value: ReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroupIds", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdsUndefined: Self = StObject.set(x, "ReplicationGroupIds", js.undefined)
    
    inline def setReplicationGroupIdsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroupIds", js.Array(value*))
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
    
    inline def setServiceUpdateStatus(value: ServiceUpdateStatusList): Self = StObject.set(x, "ServiceUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateStatusUndefined: Self = StObject.set(x, "ServiceUpdateStatus", js.undefined)
    
    inline def setServiceUpdateStatusVarargs(value: ServiceUpdateStatus*): Self = StObject.set(x, "ServiceUpdateStatus", js.Array(value*))
    
    inline def setServiceUpdateTimeRange(value: TimeRangeFilter): Self = StObject.set(x, "ServiceUpdateTimeRange", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateTimeRangeUndefined: Self = StObject.set(x, "ServiceUpdateTimeRange", js.undefined)
    
    inline def setShowNodeLevelUpdateStatus(value: BooleanOptional): Self = StObject.set(x, "ShowNodeLevelUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setShowNodeLevelUpdateStatusUndefined: Self = StObject.set(x, "ShowNodeLevelUpdateStatus", js.undefined)
    
    inline def setUpdateActionStatus(value: UpdateActionStatusList): Self = StObject.set(x, "UpdateActionStatus", value.asInstanceOf[js.Any])
    
    inline def setUpdateActionStatusUndefined: Self = StObject.set(x, "UpdateActionStatus", js.undefined)
    
    inline def setUpdateActionStatusVarargs(value: UpdateActionStatus*): Self = StObject.set(x, "UpdateActionStatus", js.Array(value*))
  }
}
