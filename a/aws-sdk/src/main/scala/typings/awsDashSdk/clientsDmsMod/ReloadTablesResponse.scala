package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReloadTablesResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
}

object ReloadTablesResponse {
  @scala.inline
  def apply(ReplicationTaskArn: String = null): ReloadTablesResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationTaskArn != null) __obj.updateDynamic("ReplicationTaskArn")(ReplicationTaskArn)
    __obj.asInstanceOf[ReloadTablesResponse]
  }
}

