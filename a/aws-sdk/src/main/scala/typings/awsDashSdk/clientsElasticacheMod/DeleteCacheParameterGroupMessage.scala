package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group to delete.  The specified cache security group must not be associated with any clusters. 
    */
  var CacheParameterGroupName: String
}

object DeleteCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupName: String): DeleteCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupName = CacheParameterGroupName)
  
    __obj.asInstanceOf[DeleteCacheParameterGroupMessage]
  }
}

