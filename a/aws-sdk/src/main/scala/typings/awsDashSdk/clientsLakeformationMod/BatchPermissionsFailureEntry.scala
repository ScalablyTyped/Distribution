package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPermissionsFailureEntry extends js.Object {
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.native
}

object BatchPermissionsFailureEntry {
  @scala.inline
  def apply(Error: ErrorDetail = null, RequestEntry: BatchPermissionsRequestEntry = null): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    if (RequestEntry != null) __obj.updateDynamic("RequestEntry")(RequestEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
}

