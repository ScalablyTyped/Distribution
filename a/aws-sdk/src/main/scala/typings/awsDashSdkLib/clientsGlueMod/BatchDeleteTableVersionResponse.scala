package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteTableVersionResponse extends js.Object {
  /**
    * A list of errors encountered while trying to delete the specified table versions.
    */
  var Errors: js.UndefOr[TableVersionErrors] = js.undefined
}

object BatchDeleteTableVersionResponse {
  @scala.inline
  def apply(Errors: TableVersionErrors = null): BatchDeleteTableVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    __obj.asInstanceOf[BatchDeleteTableVersionResponse]
  }
}

