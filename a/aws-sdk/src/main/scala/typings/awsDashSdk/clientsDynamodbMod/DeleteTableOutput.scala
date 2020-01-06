package typings.awsDashSdk.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTableOutput extends js.Object {
  /**
    * Represents the properties of a table.
    */
  var TableDescription: js.UndefOr[typings.awsDashSdk.clientsDynamodbMod.TableDescription] = js.native
}

object DeleteTableOutput {
  @scala.inline
  def apply(TableDescription: TableDescription = null): DeleteTableOutput = {
    val __obj = js.Dynamic.literal()
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTableOutput]
  }
}

