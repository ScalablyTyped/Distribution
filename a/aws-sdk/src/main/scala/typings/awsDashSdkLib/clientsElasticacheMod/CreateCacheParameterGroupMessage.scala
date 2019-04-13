package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCacheParameterGroupMessage extends js.Object {
  /**
    * The name of the cache parameter group family that the cache parameter group can be used with. Valid values are: memcached1.4 | redis2.6 | redis2.8 | redis3.2 | redis4.0 
    */
  var CacheParameterGroupFamily: String
  /**
    * A user-specified name for the cache parameter group.
    */
  var CacheParameterGroupName: String
  /**
    * A user-specified description for the cache parameter group.
    */
  var Description: String
}

object CreateCacheParameterGroupMessage {
  @scala.inline
  def apply(CacheParameterGroupFamily: String, CacheParameterGroupName: String, Description: String): CreateCacheParameterGroupMessage = {
    val __obj = js.Dynamic.literal(CacheParameterGroupFamily = CacheParameterGroupFamily, CacheParameterGroupName = CacheParameterGroupName, Description = Description)
  
    __obj.asInstanceOf[CreateCacheParameterGroupMessage]
  }
}

