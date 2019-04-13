package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyCacheSubnetGroupMessage extends js.Object {
  /**
    * A description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String
  /**
    * The EC2 subnet IDs for the cache subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.undefined
}

object ModifyCacheSubnetGroupMessage {
  @scala.inline
  def apply(
    CacheSubnetGroupName: String,
    CacheSubnetGroupDescription: String = null,
    SubnetIds: SubnetIdentifierList = null
  ): ModifyCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName)
    if (CacheSubnetGroupDescription != null) __obj.updateDynamic("CacheSubnetGroupDescription")(CacheSubnetGroupDescription)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
  }
}

