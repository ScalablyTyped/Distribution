package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationSubnetGroupMessage extends js.Object {
  /**
    * The description for the subnet group.
    */
  var ReplicationSubnetGroupDescription: String
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string. Constraints: Must contain no more than 255 alphanumeric characters, periods, spaces, underscores, or hyphens. Must not be "default". Example: mySubnetgroup 
    */
  var ReplicationSubnetGroupIdentifier: String
  /**
    * One or more subnet IDs to be assigned to the subnet group.
    */
  var SubnetIds: SubnetIdentifierList
  /**
    * One or more tags to be assigned to the subnet group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateReplicationSubnetGroupMessage {
  @scala.inline
  def apply(
    ReplicationSubnetGroupDescription: String,
    ReplicationSubnetGroupIdentifier: String,
    SubnetIds: SubnetIdentifierList,
    Tags: TagList = null
  ): CreateReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupDescription = ReplicationSubnetGroupDescription, ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier, SubnetIds = SubnetIds)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateReplicationSubnetGroupMessage]
  }
}

