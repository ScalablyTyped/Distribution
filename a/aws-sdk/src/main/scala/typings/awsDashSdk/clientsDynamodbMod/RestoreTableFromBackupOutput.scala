package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromBackupOutput extends js.Object {
  /**
    * The description of the table created from an existing backup.
    */
  var TableDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableDescription] = js.native
}

object RestoreTableFromBackupOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
}

