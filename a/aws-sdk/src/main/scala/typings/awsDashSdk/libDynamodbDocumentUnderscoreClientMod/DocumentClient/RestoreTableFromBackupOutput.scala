package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromBackupOutput extends js.Object {
  /**
    * The description of the table created from an existing backup.
    */
  var TableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableDescription
  ] = js.undefined
}

object RestoreTableFromBackupOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
}

