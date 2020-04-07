package typings.awsSdk

import typings.awsSdk.elasticacheMod.BooleanOptional
import typings.awsSdk.elasticacheMod.IntegerOptional
import typings.awsSdk.elasticacheMod.String
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/elasticache.DescribeCacheClustersMessage & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeCacheClustersMess extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The user-supplied cluster identifier. If this parameter is specified, only information about that specific cluster is returned. This parameter isn't case sensitive.
    */
  var CacheClusterId: js.UndefOr[String] = js.native
  /**
    * An optional marker returned from a prior request. Use this marker for pagination of results from this operation. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: minimum 20; maximum 100.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.native
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to show only nodes (API/CLI: clusters) that are not members of a replication group. In practice, this mean Memcached and single node Redis clusters.
    */
  var ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.native
  /**
    * An optional flag that can be included in the DescribeCacheCluster request to retrieve information about the individual cache nodes.
    */
  var ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.native
}

object DescribeCacheClustersMess {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    CacheClusterId: String = null,
    Marker: String = null,
    MaxRecords: Int | Double = null,
    ShowCacheClustersNotInReplicationGroups: js.UndefOr[Boolean] = js.undefined,
    ShowCacheNodeInfo: js.UndefOr[Boolean] = js.undefined
  ): DescribeCacheClustersMess = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowCacheClustersNotInReplicationGroups)) __obj.updateDynamic("ShowCacheClustersNotInReplicationGroups")(ShowCacheClustersNotInReplicationGroups.asInstanceOf[js.Any])
    if (!js.isUndefined(ShowCacheNodeInfo)) __obj.updateDynamic("ShowCacheNodeInfo")(ShowCacheNodeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCacheClustersMess]
  }
}

