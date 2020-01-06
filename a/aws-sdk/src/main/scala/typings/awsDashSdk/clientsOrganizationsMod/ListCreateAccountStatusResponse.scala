package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCreateAccountStatusResponse extends js.Object {
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.CreateAccountStatuses] = js.native
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.NextToken] = js.native
}

object ListCreateAccountStatusResponse {
  @scala.inline
  def apply(CreateAccountStatuses: CreateAccountStatuses = null, NextToken: NextToken = null): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatuses != null) __obj.updateDynamic("CreateAccountStatuses")(CreateAccountStatuses.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
}

