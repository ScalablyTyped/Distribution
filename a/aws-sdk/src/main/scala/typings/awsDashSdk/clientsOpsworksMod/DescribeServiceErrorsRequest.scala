package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceErrorsRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * An array of service error IDs. If you use this parameter, DescribeServiceErrors returns descriptions of the specified errors. Otherwise, it returns a description of every error.
    */
  var ServiceErrorIds: js.UndefOr[Strings] = js.native
  /**
    * The stack ID. If you use this parameter, DescribeServiceErrors returns descriptions of the errors associated with the specified stack.
    */
  var StackId: js.UndefOr[String] = js.native
}

object DescribeServiceErrorsRequest {
  @scala.inline
  def apply(InstanceId: String = null, ServiceErrorIds: Strings = null, StackId: String = null): DescribeServiceErrorsRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (ServiceErrorIds != null) __obj.updateDynamic("ServiceErrorIds")(ServiceErrorIds.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceErrorsRequest]
  }
}

