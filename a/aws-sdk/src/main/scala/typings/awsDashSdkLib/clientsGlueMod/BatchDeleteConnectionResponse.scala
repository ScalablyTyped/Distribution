package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteConnectionResponse extends js.Object {
  /**
    * A map of the names of connections that were not successfully deleted to error details.
    */
  var Errors: js.UndefOr[ErrorByName] = js.undefined
  /**
    * A list of names of the connection definitions that were successfully deleted.
    */
  var Succeeded: js.UndefOr[NameStringList] = js.undefined
}

object BatchDeleteConnectionResponse {
  @scala.inline
  def apply(Errors: ErrorByName = null, Succeeded: NameStringList = null): BatchDeleteConnectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Errors != null) __obj.updateDynamic("Errors")(Errors)
    if (Succeeded != null) __obj.updateDynamic("Succeeded")(Succeeded)
    __obj.asInstanceOf[BatchDeleteConnectionResponse]
  }
}

