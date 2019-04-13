package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCacheSecurityGroupMessage extends js.Object {
  /**
    * A name for the cache security group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters. Cannot be the word "Default". Example: mysecuritygroup 
    */
  var CacheSecurityGroupName: String
  /**
    * A description for the cache security group.
    */
  var Description: String
}

object CreateCacheSecurityGroupMessage {
  @scala.inline
  def apply(CacheSecurityGroupName: String, Description: String): CreateCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName, Description = Description)
  
    __obj.asInstanceOf[CreateCacheSecurityGroupMessage]
  }
}

