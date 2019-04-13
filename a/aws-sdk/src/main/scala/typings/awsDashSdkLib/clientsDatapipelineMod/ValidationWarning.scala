package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationWarning extends js.Object {
  /**
    * The identifier of the object that contains the validation warning.
    */
  var id: js.UndefOr[id] = js.undefined
  /**
    * A description of the validation warning.
    */
  var warnings: js.UndefOr[validationMessages] = js.undefined
}

object ValidationWarning {
  @scala.inline
  def apply(id: id = null, warnings: validationMessages = null): ValidationWarning = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[ValidationWarning]
  }
}

