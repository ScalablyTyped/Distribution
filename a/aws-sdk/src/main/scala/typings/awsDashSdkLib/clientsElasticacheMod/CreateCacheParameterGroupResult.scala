package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCacheParameterGroupResult extends js.Object {
  var CacheParameterGroup: js.UndefOr[CacheParameterGroup] = js.undefined
}

object CreateCacheParameterGroupResult {
  @scala.inline
  def apply(CacheParameterGroup: CacheParameterGroup = null): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    if (CacheParameterGroup != null) __obj.updateDynamic("CacheParameterGroup")(CacheParameterGroup)
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
}

