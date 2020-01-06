package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordError extends js.Object {
  /**
    * The numeric value of the error.
    */
  var Code: js.UndefOr[ErrorCode] = js.native
  /**
    * The description of the error.
    */
  var Description: js.UndefOr[ErrorDescription] = js.native
}

object RecordError {
  @scala.inline
  def apply(Code: ErrorCode = null, Description: ErrorDescription = null): RecordError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordError]
  }
}

