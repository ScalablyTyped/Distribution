package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRoleResponse extends js.Object {
  /**
    * If the Success element contains false, this value is an array of one or more error messages that were generated during the test process.
    */
  var Messages: js.UndefOr[ExceptionMessages] = js.undefined
  /**
    * If the operation is successful, this value is true; otherwise, the value is false.
    */
  var Success: js.UndefOr[Success] = js.undefined
}

object TestRoleResponse {
  @scala.inline
  def apply(Messages: ExceptionMessages = null, Success: Success = null): TestRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages)
    if (Success != null) __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[TestRoleResponse]
  }
}

