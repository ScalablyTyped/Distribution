package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableToPointInTimeOutput extends js.Object {
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
  ] = js.undefined
}

object RestoreTableToPointInTimeOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
}

