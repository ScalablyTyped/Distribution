package typings.awsDashSdk.clientsLakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGrantPermissionsResponse extends js.Object {
  /**
    * A list of failures to grant permissions to the resources.
    */
  var Failures: js.UndefOr[BatchPermissionsFailureList] = js.undefined
}

object BatchGrantPermissionsResponse {
  @scala.inline
  def apply(Failures: BatchPermissionsFailureList = null): BatchGrantPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Failures != null) __obj.updateDynamic("Failures")(Failures)
    __obj.asInstanceOf[BatchGrantPermissionsResponse]
  }
}

