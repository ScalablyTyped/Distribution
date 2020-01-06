package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteTableVersionResponse extends js.Object {
  /**
    * A list of errors encountered while trying to delete the specified table versions.
    */
  var Errors: js.UndefOr[TableVersionErrors] = js.native
}

object BatchDeleteTableVersionResponse {
  @scala.inline
  def apply(Errors: TableVersionErrors = null): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
}

