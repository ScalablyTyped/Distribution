package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootCacheClusterResult extends js.Object {
  var CacheCluster: js.UndefOr[CacheCluster] = js.undefined
}

object RebootCacheClusterResult {
  @scala.inline
  def apply(CacheCluster: CacheCluster = null): RebootCacheClusterResult = {
    val __obj = js.Dynamic.literal()
    if (CacheCluster != null) __obj.updateDynamic("CacheCluster")(CacheCluster)
    __obj.asInstanceOf[RebootCacheClusterResult]
  }
}

