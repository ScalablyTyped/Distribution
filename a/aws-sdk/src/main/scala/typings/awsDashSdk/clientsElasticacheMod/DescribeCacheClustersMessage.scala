package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCacheClustersMessage extends js.Object {
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

object DescribeCacheClustersMessage {
  @scala.inline
  def apply(
    CacheClusterId: String = null,
    Marker: String = null,
    MaxRecords: js.UndefOr[IntegerOptional] = js.undefined,
    ShowCacheClustersNotInReplicationGroups: js.UndefOr[BooleanOptional] = js.undefined,
    ShowCacheNodeInfo: js.UndefOr[BooleanOptional] = js.undefined
  ): DescribeCacheClustersMessage = {
    val __obj = js.Dynamic.literal()
    if (CacheClusterId != null) __obj.updateDynamic("CacheClusterId")(CacheClusterId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxRecords)) __obj.updateDynamic("MaxRecords")(MaxRecords)
    if (!js.isUndefined(ShowCacheClustersNotInReplicationGroups)) __obj.updateDynamic("ShowCacheClustersNotInReplicationGroups")(ShowCacheClustersNotInReplicationGroups)
    if (!js.isUndefined(ShowCacheNodeInfo)) __obj.updateDynamic("ShowCacheNodeInfo")(ShowCacheNodeInfo)
    __obj.asInstanceOf[DescribeCacheClustersMessage]
  }
}

