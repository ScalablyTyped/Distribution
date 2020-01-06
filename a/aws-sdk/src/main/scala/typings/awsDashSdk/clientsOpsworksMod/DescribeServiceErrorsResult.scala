package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceErrorsResult extends js.Object {
  /**
    * An array of ServiceError objects that describe the specified service errors.
    */
  var ServiceErrors: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.ServiceErrors] = js.native
}

object DescribeServiceErrorsResult {
  @scala.inline
  def apply(ServiceErrors: ServiceErrors = null): DescribeServiceErrorsResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceErrors != null) __obj.updateDynamic("ServiceErrors")(ServiceErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceErrorsResult]
  }
}

