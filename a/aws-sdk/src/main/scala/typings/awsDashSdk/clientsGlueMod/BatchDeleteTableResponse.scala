package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteTableResponse extends js.Object {
  /**
    * A list of errors encountered in attempting to delete the specified tables.
    */
  var Errors: js.UndefOr[TableErrors] = js.undefined
}

object BatchDeleteTableResponse {
  @scala.inline
  def apply(Errors: TableErrors = null): BatchDeleteTableResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    __obj.asInstanceOf[BatchDeleteTableResponse]
  }
}

