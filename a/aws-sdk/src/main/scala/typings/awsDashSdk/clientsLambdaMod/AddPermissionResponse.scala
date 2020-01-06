package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddPermissionResponse extends js.Object {
  /**
    * The permission statement that's added to the function policy.
    */
  var Statement: js.UndefOr[String] = js.native
}

object AddPermissionResponse {
  @scala.inline
  def apply(Statement: String = null): AddPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (Statement != null) __obj.updateDynamic("Statement")(Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPermissionResponse]
  }
}

