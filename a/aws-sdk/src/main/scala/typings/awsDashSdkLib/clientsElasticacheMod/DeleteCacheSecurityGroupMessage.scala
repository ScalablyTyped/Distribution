package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCacheSecurityGroupMessage extends js.Object {
  /**
    * The name of the cache security group to delete.  You cannot delete the default security group. 
    */
  var CacheSecurityGroupName: String
}

object DeleteCacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName)
  
    __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
  }
}

