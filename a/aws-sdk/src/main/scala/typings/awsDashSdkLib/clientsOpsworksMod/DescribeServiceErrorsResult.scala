package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceErrorsResult extends js.Object {
  /**
    * An array of ServiceError objects that describe the specified service errors.
    */
  var ServiceErrors: js.UndefOr[ServiceErrors] = js.undefined
}

object DescribeServiceErrorsResult {
  @scala.inline
  def apply(ServiceErrors: ServiceErrors = null): DescribeServiceErrorsResult = {
    val __obj = js.Dynamic.literal()
    if (ServiceErrors != null) __obj.updateDynamic("ServiceErrors")(ServiceErrors)
    __obj.asInstanceOf[DescribeServiceErrorsResult]
  }
}

