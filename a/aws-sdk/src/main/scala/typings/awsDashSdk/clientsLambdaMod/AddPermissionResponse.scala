package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPermissionResponse extends js.Object {
  /**
    * The permission statement that's added to the function policy.
    */
  var Statement: js.UndefOr[String] = js.undefined
}

object AddPermissionResponse {
  @scala.inline
  def apply(Statement: String = null): AddPermissionResponse = {
    val __obj = js.Dynamic.literal()
    if (Statement != null) __obj.updateDynamic("Statement")(Statement)
    __obj.asInstanceOf[AddPermissionResponse]
  }
}

