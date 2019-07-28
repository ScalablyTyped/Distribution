package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeCacheSecurityGroupIngressResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.CacheSecurityGroup] = js.undefined
}

object RevokeCacheSecurityGroupIngressResult {
  @scala.inline
  def apply(CacheSecurityGroup: CacheSecurityGroup = null): RevokeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroup != null) __obj.updateDynamic("CacheSecurityGroup")(CacheSecurityGroup)
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
  }
}

