package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopReplicationTaskMessage extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the replication task to be stopped.
    */
  var ReplicationTaskArn: String
}

object StopReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): StopReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn)
  
    __obj.asInstanceOf[StopReplicationTaskMessage]
  }
}

