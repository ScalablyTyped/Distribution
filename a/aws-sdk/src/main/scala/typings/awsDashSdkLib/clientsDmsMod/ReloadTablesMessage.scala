package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReloadTablesMessage extends js.Object {
  /**
    * Options for reload. Specify data-reload to reload the data and re-validate it if validation is enabled. Specify validate-only to re-validate the table. This option applies only when validation is enabled for the task.  Valid values: data-reload, validate-only Default value is data-reload.
    */
  var ReloadOption: js.UndefOr[ReloadOptionValue] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: String
  /**
    * The name and schema of the table to be reloaded. 
    */
  var TablesToReload: TableListToReload
}

object ReloadTablesMessage {
  @scala.inline
  def apply(
    ReplicationTaskArn: String,
    TablesToReload: TableListToReload,
    ReloadOption: ReloadOptionValue = null
  ): ReloadTablesMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn, TablesToReload = TablesToReload)
    if (ReloadOption != null) __obj.updateDynamic("ReloadOption")(ReloadOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReloadTablesMessage]
  }
}

