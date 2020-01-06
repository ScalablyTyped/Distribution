package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteReplicationSubnetGroupMessage extends js.Object {
  /**
    * The subnet group name of the replication instance.
    */
  var ReplicationSubnetGroupIdentifier: String = js.native
}

object DeleteReplicationSubnetGroupMessage {
  @scala.inline
  def apply(ReplicationSubnetGroupIdentifier: String): DeleteReplicationSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ReplicationSubnetGroupIdentifier = ReplicationSubnetGroupIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteReplicationSubnetGroupMessage]
  }
}

