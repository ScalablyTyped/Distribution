package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchPermissionsFailureEntry extends js.Object {
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.undefined
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.undefined
}

object BatchPermissionsFailureEntry {
  @scala.inline
  def apply(Error: ErrorDetail = null, RequestEntry: BatchPermissionsRequestEntry = null): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (RequestEntry != null) __obj.updateDynamic("RequestEntry")(RequestEntry)
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
}

