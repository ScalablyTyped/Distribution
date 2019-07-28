package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTableOutput extends js.Object {
  /**
    * Represents the properties of the table.
    */
  var TableDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableDescription] = js.undefined
}

object UpdateTableOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): UpdateTableOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[UpdateTableOutput]
  }
}

