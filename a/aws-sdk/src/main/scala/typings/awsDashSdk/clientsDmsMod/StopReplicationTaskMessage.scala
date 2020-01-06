package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopReplicationTaskMessage extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the replication task to be stopped.
    */
  var ReplicationTaskArn: String = js.native
}

object StopReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): StopReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopReplicationTaskMessage]
  }
}

