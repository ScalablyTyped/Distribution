package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartReplicationTaskAssessmentResponse extends js.Object {
  /**
    *  The assessed replication task. 
    */
  var ReplicationTask: js.UndefOr[ReplicationTask] = js.undefined
}

object StartReplicationTaskAssessmentResponse {
  @scala.inline
  def apply(ReplicationTask: ReplicationTask = null): StartReplicationTaskAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTask != null) __obj.updateDynamic("ReplicationTask")(ReplicationTask)
    __obj.asInstanceOf[StartReplicationTaskAssessmentResponse]
  }
}

