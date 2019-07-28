package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCacheSubnetGroupResult extends js.Object {
  var CacheSubnetGroup: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheSubnetGroup] = js.undefined
}

object CreateCacheSubnetGroupResult {
  @scala.inline
  def apply(CacheSubnetGroup: CacheSubnetGroup = null): CreateCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroup != null) __obj.updateDynamic("CacheSubnetGroup")(CacheSubnetGroup)
    __obj.asInstanceOf[CreateCacheSubnetGroupResult]
  }
}

