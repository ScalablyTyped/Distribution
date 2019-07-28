package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationInstanceTaskLog extends js.Object {
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.undefined
}

object ReplicationInstanceTaskLog {
  @scala.inline
  def apply(
    ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.undefined,
    ReplicationTaskArn: String = null,
    ReplicationTaskName: String = null
  ): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReplicationInstanceTaskLogSize)) __obj.updateDynamic("ReplicationInstanceTaskLogSize")(ReplicationInstanceTaskLogSize)
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    if (ReplicationTaskName != null) __obj.updateDynamic("ReplicationTaskName")(ReplicationTaskName)
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
}

