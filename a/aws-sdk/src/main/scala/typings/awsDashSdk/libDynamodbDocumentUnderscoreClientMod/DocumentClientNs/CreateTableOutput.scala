package typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[
    typings.awsDashSdk.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs.TableDescription
  ] = js.undefined
}

object CreateTableOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): CreateTableOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[CreateTableOutput]
  }
}

