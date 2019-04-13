package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordError extends js.Object {
  /**
    * The numeric value of the error.
    */
  var Code: js.UndefOr[ErrorCode] = js.undefined
  /**
    * The description of the error.
    */
  var Description: js.UndefOr[ErrorDescription] = js.undefined
}

object RecordError {
  @scala.inline
  def apply(Code: ErrorCode = null, Description: ErrorDescription = null): RecordError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[RecordError]
  }
}

