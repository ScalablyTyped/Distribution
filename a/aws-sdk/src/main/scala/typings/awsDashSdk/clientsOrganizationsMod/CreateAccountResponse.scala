package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountResponse extends js.Object {
  /**
    * A structure that contains details about the request to create an account. This response structure might not be fully populated when you first receive it because account creation is an asynchronous process. You can pass the returned CreateAccountStatus ID as a parameter to DescribeCreateAccountStatus to get status about the progress of the request at later times. You can also check the AWS CloudTrail log for the CreateAccountResult event. For more information, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.
    */
  var CreateAccountStatus: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.CreateAccountStatus] = js.native
}

object CreateAccountResponse {
  @scala.inline
  def apply(CreateAccountStatus: CreateAccountStatus = null): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatus != null) __obj.updateDynamic("CreateAccountStatus")(CreateAccountStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountResponse]
  }
}

