package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchRevokePermissionsResponse extends js.Object {
  /**
    * A list of failures to revoke permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
}

object BatchRevokePermissionsResponse {
  @scala.inline
  def apply(Failures: BatchPermissionsFailureList = null): BatchRevokePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures)
    __obj.asInstanceOf[BatchRevokePermissionsResponse]
  }
}

