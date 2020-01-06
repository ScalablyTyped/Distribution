package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  /**
    * A description of the validation error.
    */
  var errors: js.UndefOr[validationMessages] = js.native
  /**
    * The identifier of the object that contains the validation error.
    */
  var id: js.UndefOr[typings.awsDashSdk.clientsDatapipelineMod.id] = js.native
}

object ValidationError {
  @scala.inline
  def apply(errors: validationMessages = null, id: id = null): ValidationError = {
    val __obj = js.Dynamic.literal()
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

