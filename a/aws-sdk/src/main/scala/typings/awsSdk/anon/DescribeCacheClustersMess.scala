package typings.awsSdk.anon

import typings.awsSdk.elasticacheMod.BooleanOptional
import typings.awsSdk.elasticacheMod.IntegerOptional
import typings.awsSdk.elasticacheMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/elasticache.DescribeCacheClustersMessage & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCacheClustersMess extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cluster is returned. This parameter isn't case sensitive.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to show only nodes (API/CLI: clusters) that are not members of a replication group. In practice, this mean Memcached and single node Redis clusters.
    */
  var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the individual cache nodes.
    */
  var ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
}
object DescribeCacheClustersMess {
  
  inline def apply(): DescribeCacheClustersMess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheClustersMess]
  }
  
  extension [Self <: DescribeCacheClustersMess](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setShowCacheClustersNotInReplicationGroups(value: BooleanOptional): Self = StObject.set(x, "ShowCacheClustersNotInReplicationGroups", value.asInstanceOf[js.Any])
    
    inline def setShowCacheClustersNotInReplicationGroupsUndefined: Self = StObject.set(x, "ShowCacheClustersNotInReplicationGroups", js.undefined)
    
    inline def setShowCacheNodeInfo(value: BooleanOptional): Self = StObject.set(x, "ShowCacheNodeInfo", value.asInstanceOf[js.Any])
    
    inline def setShowCacheNodeInfoUndefined: Self = StObject.set(x, "ShowCacheNodeInfo", js.undefined)
  }
}
