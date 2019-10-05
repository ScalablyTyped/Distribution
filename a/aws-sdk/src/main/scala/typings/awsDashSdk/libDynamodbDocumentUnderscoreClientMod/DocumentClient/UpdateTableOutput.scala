package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClient.TableDescription
  ] = js.undefined
}

object UpdateTableOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[UpdateTableOutput]
  }
}

