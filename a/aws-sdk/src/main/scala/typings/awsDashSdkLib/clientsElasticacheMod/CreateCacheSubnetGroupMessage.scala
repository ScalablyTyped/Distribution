package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCacheSubnetGroupMessage extends js.Object {
  /**
    * A description for the cache subnet group.
    */
  var CacheSubnetGroupDescription: String
  /**
    * A name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String
  /**
    * A list of VPC subnet IDs for the cache subnet group.
    */
  var SubnetIds: SubnetIdentifierList
}

object CreateCacheSubnetGroupMessage {
  @scala.inline
  def apply(CacheSubnetGroupDescription: String, CacheSubnetGroupName: String, SubnetIds: SubnetIdentifierList): CreateCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupDescription = CacheSubnetGroupDescription, CacheSubnetGroupName = CacheSubnetGroupName, SubnetIds = SubnetIds)
  
    __obj.asInstanceOf[CreateCacheSubnetGroupMessage]
  }
}

