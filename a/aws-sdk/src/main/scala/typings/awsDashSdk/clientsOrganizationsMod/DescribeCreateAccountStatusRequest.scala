package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCreateAccountStatusRequest extends js.Object {
  /**
    * Specifies the operationId that uniquely identifies the request. You can get the ID from the response to an earlier CreateAccount request, or from the ListCreateAccountStatus operation. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
    */
  var CreateAccountRequestId: typings.awsDashSdk.clientsOrganizationsMod.CreateAccountRequestId = js.native
}

object DescribeCreateAccountStatusRequest {
  @scala.inline
  def apply(CreateAccountRequestId: CreateAccountRequestId): DescribeCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal(CreateAccountRequestId = CreateAccountRequestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeCreateAccountStatusRequest]
  }
}

