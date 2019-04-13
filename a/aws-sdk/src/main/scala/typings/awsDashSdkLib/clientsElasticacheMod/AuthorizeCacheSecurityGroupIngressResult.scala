package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeCacheSecurityGroupIngressResult extends js.Object {
  var CacheSecurityGroup: js.UndefOr[CacheSecurityGroup] = js.undefined
}

object AuthorizeCacheSecurityGroupIngressResult {
  @scala.inline
  def apply(CacheSecurityGroup: CacheSecurityGroup = null): AuthorizeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (CacheSecurityGroup != null) __obj.updateDynamic("CacheSecurityGroup")(CacheSecurityGroup)
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
  }
}

