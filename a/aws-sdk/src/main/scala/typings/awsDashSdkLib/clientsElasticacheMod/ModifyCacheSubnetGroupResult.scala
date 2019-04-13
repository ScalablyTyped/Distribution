package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCacheSubnetGroupResult extends js.Object {
  var CacheSubnetGroup: js.UndefOr[CacheSubnetGroup] = js.undefined
}

object ModifyCacheSubnetGroupResult {
  @scala.inline
  def apply(CacheSubnetGroup: CacheSubnetGroup = null): ModifyCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSubnetGroup != null) __obj.updateDynamic("CacheSubnetGroup")(CacheSubnetGroup)
    __obj.asInstanceOf[ModifyCacheSubnetGroupResult]
  }
}

