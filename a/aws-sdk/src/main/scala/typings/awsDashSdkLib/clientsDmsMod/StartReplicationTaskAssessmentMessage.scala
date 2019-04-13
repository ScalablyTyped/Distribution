package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReplicationTaskAssessmentMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String
}

object StartReplicationTaskAssessmentMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): StartReplicationTaskAssessmentMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn)
  
    __obj.asInstanceOf[StartReplicationTaskAssessmentMessage]
  }
}

