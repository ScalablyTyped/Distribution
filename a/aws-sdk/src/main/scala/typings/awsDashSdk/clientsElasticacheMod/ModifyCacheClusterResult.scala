package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCacheClusterResult extends js.Object {
  var CacheCluster: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheCluster] = js.undefined
}

object ModifyCacheClusterResult {
  @scala.inline
  def apply(CacheCluster: CacheCluster = null): ModifyCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    if (CacheCluster != null) __obj.updateDynamic("CacheCluster")(CacheCluster)
    __obj.asInstanceOf[ModifyCacheClusterResult]
  }
}

