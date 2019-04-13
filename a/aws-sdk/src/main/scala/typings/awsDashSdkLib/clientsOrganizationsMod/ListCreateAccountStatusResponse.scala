package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCreateAccountStatusResponse extends js.Object {
  /**
    * A list of objects with details about the requests. Certain elements, such as the accountId number, are present in the output only after the account has been successfully created.
    */
  var CreateAccountStatuses: js.UndefOr[CreateAccountStatuses] = js.undefined
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCreateAccountStatusResponse {
  @scala.inline
  def apply(CreateAccountStatuses: CreateAccountStatuses = null, NextToken: NextToken = null): ListCreateAccountStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateAccountStatuses != null) __obj.updateDynamic("CreateAccountStatuses")(CreateAccountStatuses)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCreateAccountStatusResponse]
  }
}

