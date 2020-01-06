package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartReplicationTaskAssessmentMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String = js.native
}

object StartReplicationTaskAssessmentMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): StartReplicationTaskAssessmentMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
  }
}

