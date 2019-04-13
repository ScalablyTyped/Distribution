package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReplicationSubnetGroupMessage extends js.Object {
  /**
    * The description of the replication instance subnet group.
    */
  var ReplicationSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the replication instance subnet group.
    */
  var ReplicationSubnetGroupIdentifier: String
  /**
    * A list of subnet IDs.
    */
  var SubnetIds: SubnetIdentifierList
}

object ModifyReplicationSubnetGroupMessage {
  @scala.inline
  def apply(
    ReplicationSubnetGroupIdentifier: String,
    SubnetIds: SubnetIdentifierList,
    ReplicationSubnetGroupDescription: String = null
  ): ModifyReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier, SubnetIds = SubnetIds)
    if (ReplicationSubnetGroupDescription != null) __obj.updateDynamic("ReplicationSubnetGroupDescription")(ReplicationSubnetGroupDescription)
    __obj.asInstanceOf[ModifyReplicationSubnetGroupMessage]
  }
}

