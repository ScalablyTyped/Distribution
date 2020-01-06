package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserPoolClientsResponse extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.native
}

object ListUserPoolClientsResponse {
  @scala.inline
  def apply(NextToken: PaginationKey = null, UserPoolClients: UserPoolClientListType = null): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserPoolClients != null) __obj.updateDynamic("UserPoolClients")(UserPoolClients.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
}

