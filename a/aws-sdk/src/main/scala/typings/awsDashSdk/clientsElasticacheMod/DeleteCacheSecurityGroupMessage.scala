package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCacheSecurityGroupMessage extends js.Object {
  /**
    * The name of the cache security group to delete.  You cannot delete the default security group. 
    */
  var CacheSecurityGroupName: String = js.native
}

object DeleteCacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
  }
}

