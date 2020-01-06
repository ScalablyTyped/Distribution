package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootCacheClusterResult extends js.Object {
  var CacheCluster: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheCluster] = js.native
}

object RebootCacheClusterResult {
  @scala.inline
  def apply(CacheCluster: CacheCluster = null): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    if (CacheCluster != null) __obj.updateDynamic("CacheCluster")(CacheCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
}

