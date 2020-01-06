package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRoleResponse extends js.Object {
  /**
    * If the Success element contains false, this value is an array of one or more error messages that were generated during the test process.
    */
  var Messages: js.UndefOr[ExceptionMessages] = js.native
  /**
    * If the operation is successful, this value is true; otherwise, the value is false.
    */
  var Success: js.UndefOr[typings.awsDashSdk.clientsElastictranscoderMod.Success] = js.native
}

object TestRoleResponse {
  @scala.inline
  def apply(Messages: ExceptionMessages = null, Success: Success = null): TestRoleResponse = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    if (Success != null) __obj.updateDynamic("Success")(Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRoleResponse]
  }
}

