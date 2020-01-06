package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyCacheSubnetGroupMessage extends js.Object {
  /**
    * A description of the cache subnet group.
    */
  var CacheSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name for the cache subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters or hyphens. Example: mysubnetgroup 
    */
  var CacheSubnetGroupName: String = js.native
  /**
    * The EC2 subnet IDs for the cache subnet group.
    */
  var SubnetIds: js.UndefOr[SubnetIdentifierList] = js.native
}

object ModifyCacheSubnetGroupMessage {
  @scala.inline
  def apply(
    CacheSubnetGroupName: String,
    CacheSubnetGroupDescription: String = null,
    SubnetIds: SubnetIdentifierList = null
  ): ModifyCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    if (CacheSubnetGroupDescription != null) __obj.updateDynamic("CacheSubnetGroupDescription")(CacheSubnetGroupDescription.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyCacheSubnetGroupMessage]
  }
}

