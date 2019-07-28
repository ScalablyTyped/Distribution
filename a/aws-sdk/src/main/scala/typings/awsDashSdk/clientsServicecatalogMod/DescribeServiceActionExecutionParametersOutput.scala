package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceActionExecutionParametersOutput extends js.Object {
  var ServiceActionParameters: js.UndefOr[ExecutionParameters] = js.undefined
}

object DescribeServiceActionExecutionParametersOutput {
  @scala.inline
  def apply(ServiceActionParameters: ExecutionParameters = null): DescribeServiceActionExecutionParametersOutput = {
    val __obj = js.Dynamic.literal()
    if (ServiceActionParameters != null) __obj.updateDynamic("ServiceActionParameters")(ServiceActionParameters)
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersOutput]
  }
}

