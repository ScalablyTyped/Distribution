package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCacheClusterResult extends js.Object {
  var CacheCluster: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheCluster] = js.undefined
}

object DeleteCacheClusterResult {
  @scala.inline
  def apply(CacheCluster: CacheCluster = null): DeleteCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    if (CacheCluster != null) __obj.updateDynamic("CacheCluster")(CacheCluster)
    __obj.asInstanceOf[DeleteCacheClusterResult]
  }
}

